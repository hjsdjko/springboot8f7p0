package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YoujixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YoujixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YoujixinxiView;


/**
 * 游记信息
 *
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
public interface YoujixinxiService extends IService<YoujixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YoujixinxiVO> selectListVO(Wrapper<YoujixinxiEntity> wrapper);
   	
   	YoujixinxiVO selectVO(@Param("ew") Wrapper<YoujixinxiEntity> wrapper);
   	
   	List<YoujixinxiView> selectListView(Wrapper<YoujixinxiEntity> wrapper);
   	
   	YoujixinxiView selectView(@Param("ew") Wrapper<YoujixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YoujixinxiEntity> wrapper);
   	

}

