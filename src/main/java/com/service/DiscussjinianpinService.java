package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjinianpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjinianpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjinianpinView;


/**
 * 纪念品评论表
 *
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
public interface DiscussjinianpinService extends IService<DiscussjinianpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjinianpinVO> selectListVO(Wrapper<DiscussjinianpinEntity> wrapper);
   	
   	DiscussjinianpinVO selectVO(@Param("ew") Wrapper<DiscussjinianpinEntity> wrapper);
   	
   	List<DiscussjinianpinView> selectListView(Wrapper<DiscussjinianpinEntity> wrapper);
   	
   	DiscussjinianpinView selectView(@Param("ew") Wrapper<DiscussjinianpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjinianpinEntity> wrapper);
   	

}

