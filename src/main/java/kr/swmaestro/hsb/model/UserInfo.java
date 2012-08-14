package kr.swmaestro.hsb.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import kr.swmaestro.hsb.data.DataModel;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@RooJavaBean
@RooToString
@RooEntity
@XmlRootElement
@XStreamAlias("result")
public class UserInfo extends ResultModel implements DataModel {
	
	@NotEmpty(message = "아이디를 입력해주세요.")
	@Size(min = 4, max = 20, message = "아이디는 4글자 이상, 20글자 이하로 입력해주세요.")
	@Pattern(regexp = "[_a-z0-9-]*")
	@Column(length = 20, unique = true)
	private String username;
	
	@NotEmpty
	@Size(min = 4, max = 20)
	@Column(length = 40)
	// 암호화 하면 암호의 길이 증가
	private String password;

	@NotEmpty
	@Size(min = 4, max = 20)
	@Transient
	// 비밀번호 확인은 저장하지 않음
	private String passwordConfirm;

	@NotEmpty
	@Size(min = 4, max = 20)
	@Column(length = 20, unique = true)
	private String nickname;

	@NotEmpty
	@Size(max = 320)
	@Email
	@Column(length = 320)
	private String email;

	@Column(nullable = false)
	private Date joinDate;

	private int loginCount;
	
	public void increaseLoginCount() {
		loginCount++;
	};

	private int writeCount;
	
	private boolean enable;

	@Override
	public UserInfo get(Long id) {
		UserInfo userInfo = UserInfo.findUserInfo(id);
		if (userInfo.isEnable()) {
			return userInfo;
		}
		return null;
	}

	@Override
	public List<UserInfo> list(Long afterId, int count) {
		return null;
	}
	
}
