package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinianpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinianpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinianpinView;


/**
 * 纪念品
 *
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
public interface JinianpinService extends IService<JinianpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinianpinVO> selectListVO(Wrapper<JinianpinEntity> wrapper);
   	
   	JinianpinVO selectVO(@Param("ew") Wrapper<JinianpinEntity> wrapper);
   	
   	List<JinianpinView> selectListView(Wrapper<JinianpinEntity> wrapper);
   	
   	JinianpinView selectView(@Param("ew") Wrapper<JinianpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinianpinEntity> wrapper);
   	

}

