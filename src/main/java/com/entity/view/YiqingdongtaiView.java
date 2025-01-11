package com.entity.view;

import com.entity.YiqingdongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫情动态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
@TableName("yiqingdongtai")
public class YiqingdongtaiView  extends YiqingdongtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiqingdongtaiView(){
	}
 
 	public YiqingdongtaiView(YiqingdongtaiEntity yiqingdongtaiEntity){
 	try {
			BeanUtils.copyProperties(this, yiqingdongtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
