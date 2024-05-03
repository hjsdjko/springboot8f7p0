package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstesemeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstesemeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstesemeishiView;


/**
 * 特色美食评论表
 *
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
public interface DiscusstesemeishiService extends IService<DiscusstesemeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstesemeishiVO> selectListVO(Wrapper<DiscusstesemeishiEntity> wrapper);
   	
   	DiscusstesemeishiVO selectVO(@Param("ew") Wrapper<DiscusstesemeishiEntity> wrapper);
   	
   	List<DiscusstesemeishiView> selectListView(Wrapper<DiscusstesemeishiEntity> wrapper);
   	
   	DiscusstesemeishiView selectView(@Param("ew") Wrapper<DiscusstesemeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstesemeishiEntity> wrapper);
   	

}

