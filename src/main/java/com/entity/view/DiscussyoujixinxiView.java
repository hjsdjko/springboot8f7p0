package com.entity.view;

import com.entity.DiscussyoujixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游记信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
@TableName("discussyoujixinxi")
public class DiscussyoujixinxiView  extends DiscussyoujixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyoujixinxiView(){
	}
 
 	public DiscussyoujixinxiView(DiscussyoujixinxiEntity discussyoujixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyoujixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
