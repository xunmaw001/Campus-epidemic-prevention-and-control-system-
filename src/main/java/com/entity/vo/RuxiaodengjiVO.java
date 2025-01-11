package com.entity.vo;

import com.entity.RuxiaodengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 入校登记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public class RuxiaodengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 入校时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruxiaoshijian;
		
	/**
	 * 入校事由
	 */
	
	private String ruxiaoshiyou;
		
	/**
	 * 健康码
	 */
	
	private String jiankangma;
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：入校时间
	 */
	 
	public void setRuxiaoshijian(Date ruxiaoshijian) {
		this.ruxiaoshijian = ruxiaoshijian;
	}
	
	/**
	 * 获取：入校时间
	 */
	public Date getRuxiaoshijian() {
		return ruxiaoshijian;
	}
				
	
	/**
	 * 设置：入校事由
	 */
	 
	public void setRuxiaoshiyou(String ruxiaoshiyou) {
		this.ruxiaoshiyou = ruxiaoshiyou;
	}
	
	/**
	 * 获取：入校事由
	 */
	public String getRuxiaoshiyou() {
		return ruxiaoshiyou;
	}
				
	
	/**
	 * 设置：健康码
	 */
	 
	public void setJiankangma(String jiankangma) {
		this.jiankangma = jiankangma;
	}
	
	/**
	 * 获取：健康码
	 */
	public String getJiankangma() {
		return jiankangma;
	}
			
}
