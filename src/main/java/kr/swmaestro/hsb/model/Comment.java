package kr.swmaestro.hsb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import kr.swmaestro.hsb.XmlDateToLongConverter;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * @author 심영재
 */
@XStreamAlias("item")
@RooJavaBean
@RooToString
@RooEntity
public class Comment extends SecureKeyModel {
	
	@NotNull
	private Long targetArticleId;
	
	@NotEmpty
	@Size(max = 500)
	@Column(length = 500, nullable = false)
	private String content;

	@NotNull
	private Long writerId;
	
	@NotNull
	private Long writerUsername;
	
	@NotNull
	private String writerNickname;

	@XStreamConverter(XmlDateToLongConverter.class)
	@Column(nullable = false)
	private Date writeDate;

}
