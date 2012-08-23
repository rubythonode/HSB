package kr.swmaestro.hsb.model;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
/**
 * @author 이한솔  
 */
@RooJavaBean
@RooToString
@RooEntity
public class Follower extends SecureKeyModel{


	private Long userId;
	
	private Long followerId;
	
	@Column(nullable = false)
	private Date followDate;

}
