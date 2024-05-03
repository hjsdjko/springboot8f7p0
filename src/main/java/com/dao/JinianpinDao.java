package com.dao;

import com.entity.JinianpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinianpinVO;
import com.entity.view.JinianpinView;


/**
 * 纪念品
 * 
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
public interface JinianpinDao extends BaseMapper<JinianpinEntity> {
	
	List<JinianpinVO> selectListVO(@Param("ew") Wrapper<JinianpinEntity> wrapper);
	
	JinianpinVO selectVO(@Param("ew") Wrapper<JinianpinEntity> wrapper);
	
	List<JinianpinView> selectListView(@Param("ew") Wrapper<JinianpinEntity> wrapper);

	List<JinianpinView> selectListView(Pagination page,@Param("ew") Wrapper<JinianpinEntity> wrapper);
	
	JinianpinView selectView(@Param("ew") Wrapper<JinianpinEntity> wrapper);
	

}
