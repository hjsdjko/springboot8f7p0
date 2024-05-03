package com.entity.view;

import com.entity.DiscussjinianpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 纪念品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
@TableName("discussjinianpin")
public class DiscussjinianpinView  extends DiscussjinianpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjinianpinView(){
	}
 
 	public DiscussjinianpinView(DiscussjinianpinEntity discussjinianpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussjinianpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
