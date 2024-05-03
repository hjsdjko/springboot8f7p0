package com.dao;

import com.entity.DiscussyoujixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyoujixinxiVO;
import com.entity.view.DiscussyoujixinxiView;


/**
 * 游记信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
public interface DiscussyoujixinxiDao extends BaseMapper<DiscussyoujixinxiEntity> {
	
	List<DiscussyoujixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyoujixinxiEntity> wrapper);
	
	DiscussyoujixinxiVO selectVO(@Param("ew") Wrapper<DiscussyoujixinxiEntity> wrapper);
	
	List<DiscussyoujixinxiView> selectListView(@Param("ew") Wrapper<DiscussyoujixinxiEntity> wrapper);

	List<DiscussyoujixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyoujixinxiEntity> wrapper);
	
	DiscussyoujixinxiView selectView(@Param("ew") Wrapper<DiscussyoujixinxiEntity> wrapper);
	

}
