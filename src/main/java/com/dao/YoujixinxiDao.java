package com.dao;

import com.entity.YoujixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YoujixinxiVO;
import com.entity.view.YoujixinxiView;


/**
 * 游记信息
 * 
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
public interface YoujixinxiDao extends BaseMapper<YoujixinxiEntity> {
	
	List<YoujixinxiVO> selectListVO(@Param("ew") Wrapper<YoujixinxiEntity> wrapper);
	
	YoujixinxiVO selectVO(@Param("ew") Wrapper<YoujixinxiEntity> wrapper);
	
	List<YoujixinxiView> selectListView(@Param("ew") Wrapper<YoujixinxiEntity> wrapper);

	List<YoujixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YoujixinxiEntity> wrapper);
	
	YoujixinxiView selectView(@Param("ew") Wrapper<YoujixinxiEntity> wrapper);
	

}
