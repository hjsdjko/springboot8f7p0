package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyoujixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyoujixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyoujixinxiView;


/**
 * 游记信息评论表
 *
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
public interface DiscussyoujixinxiService extends IService<DiscussyoujixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyoujixinxiVO> selectListVO(Wrapper<DiscussyoujixinxiEntity> wrapper);
   	
   	DiscussyoujixinxiVO selectVO(@Param("ew") Wrapper<DiscussyoujixinxiEntity> wrapper);
   	
   	List<DiscussyoujixinxiView> selectListView(Wrapper<DiscussyoujixinxiEntity> wrapper);
   	
   	DiscussyoujixinxiView selectView(@Param("ew") Wrapper<DiscussyoujixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyoujixinxiEntity> wrapper);
   	

}

