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


import com.dao.DiscussjinianpinDao;
import com.entity.DiscussjinianpinEntity;
import com.service.DiscussjinianpinService;
import com.entity.vo.DiscussjinianpinVO;
import com.entity.view.DiscussjinianpinView;

@Service("discussjinianpinService")
public class DiscussjinianpinServiceImpl extends ServiceImpl<DiscussjinianpinDao, DiscussjinianpinEntity> implements DiscussjinianpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjinianpinEntity> page = this.selectPage(
                new Query<DiscussjinianpinEntity>(params).getPage(),
                new EntityWrapper<DiscussjinianpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjinianpinEntity> wrapper) {
		  Page<DiscussjinianpinView> page =new Query<DiscussjinianpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjinianpinVO> selectListVO(Wrapper<DiscussjinianpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjinianpinVO selectVO(Wrapper<DiscussjinianpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjinianpinView> selectListView(Wrapper<DiscussjinianpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjinianpinView selectView(Wrapper<DiscussjinianpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
