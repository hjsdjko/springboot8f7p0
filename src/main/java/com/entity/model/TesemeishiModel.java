package com.entity.model;

import com.entity.TesemeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 特色美食
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
public class TesemeishiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 美食图片
	 */
	
	private String meishitupian;
		
	/**
	 * 美食分类
	 */
	
	private String meishifenlei;
		
	/**
	 * 人均价格
	 */
	
	private String renjunjiage;
		
	/**
	 * 打卡地址
	 */
	
	private String dakadizhi;
		
	/**
	 * 产品特色
	 */
	
	private String chanpintese;
		
	/**
	 * 地区
	 */
	
	private String diqu;
		
	/**
	 * 美食详情
	 */
	
	private String meishixiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：美食图片
	 */
	 
	public void setMeishitupian(String meishitupian) {
		this.meishitupian = meishitupian;
	}
	
	/**
	 * 获取：美食图片
	 */
	public String getMeishitupian() {
		return meishitupian;
	}
				
	
	/**
	 * 设置：美食分类
	 */
	 
	public void setMeishifenlei(String meishifenlei) {
		this.meishifenlei = meishifenlei;
	}
	
	/**
	 * 获取：美食分类
	 */
	public String getMeishifenlei() {
		return meishifenlei;
	}
				
	
	/**
	 * 设置：人均价格
	 */
	 
	public void setRenjunjiage(String renjunjiage) {
		this.renjunjiage = renjunjiage;
	}
	
	/**
	 * 获取：人均价格
	 */
	public String getRenjunjiage() {
		return renjunjiage;
	}
				
	
	/**
	 * 设置：打卡地址
	 */
	 
	public void setDakadizhi(String dakadizhi) {
		this.dakadizhi = dakadizhi;
	}
	
	/**
	 * 获取：打卡地址
	 */
	public String getDakadizhi() {
		return dakadizhi;
	}
				
	
	/**
	 * 设置：产品特色
	 */
	 
	public void setChanpintese(String chanpintese) {
		this.chanpintese = chanpintese;
	}
	
	/**
	 * 获取：产品特色
	 */
	public String getChanpintese() {
		return chanpintese;
	}
				
	
	/**
	 * 设置：地区
	 */
	 
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	
	/**
	 * 获取：地区
	 */
	public String getDiqu() {
		return diqu;
	}
				
	
	/**
	 * 设置：美食详情
	 */
	 
	public void setMeishixiangqing(String meishixiangqing) {
		this.meishixiangqing = meishixiangqing;
	}
	
	/**
	 * 获取：美食详情
	 */
	public String getMeishixiangqing() {
		return meishixiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
