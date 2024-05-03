package com.entity.view;

import com.entity.JinianpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 纪念品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
@TableName("jinianpin")
public class JinianpinView  extends JinianpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinianpinView(){
	}
 
 	public JinianpinView(JinianpinEntity jinianpinEntity){
 	try {
			BeanUtils.copyProperties(this, jinianpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
