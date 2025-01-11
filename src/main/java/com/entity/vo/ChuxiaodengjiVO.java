package com.entity.vo;

import com.entity.ChuxiaodengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 出校登记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public class ChuxiaodengjiVO  implements Serializable {
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
	 * 出校时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuxiaoshijian;
		
	/**
	 * 出校事由
	 */
	
	private String chuxiaoshiyou;
		
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
	 * 设置：出校时间
	 */
	 
	public void setChuxiaoshijian(Date chuxiaoshijian) {
		this.chuxiaoshijian = chuxiaoshijian;
	}
	
	/**
	 * 获取：出校时间
	 */
	public Date getChuxiaoshijian() {
		return chuxiaoshijian;
	}
				
	
	/**
	 * 设置：出校事由
	 */
	 
	public void setChuxiaoshiyou(String chuxiaoshiyou) {
		this.chuxiaoshiyou = chuxiaoshiyou;
	}
	
	/**
	 * 获取：出校事由
	 */
	public String getChuxiaoshiyou() {
		return chuxiaoshiyou;
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
