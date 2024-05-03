package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JinianpinDao;
import com.entity.JinianpinEntity;
import com.service.JinianpinService;
import com.entity.vo.JinianpinVO;
import com.entity.view.JinianpinView;

@Service("jinianpinService")
public class JinianpinServiceImpl extends ServiceImpl<JinianpinDao, JinianpinEntity> implements JinianpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinianpinEntity> page = this.selectPage(
                new Query<JinianpinEntity>(params).getPage(),
                new EntityWrapper<JinianpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinianpinEntity> wrapper) {
		  Page<JinianpinView> page =new Query<JinianpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinianpinVO> selectListVO(Wrapper<JinianpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinianpinVO selectVO(Wrapper<JinianpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinianpinView> selectListView(Wrapper<JinianpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinianpinView selectView(Wrapper<JinianpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
