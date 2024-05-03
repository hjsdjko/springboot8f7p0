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


import com.dao.DiscusstesemeishiDao;
import com.entity.DiscusstesemeishiEntity;
import com.service.DiscusstesemeishiService;
import com.entity.vo.DiscusstesemeishiVO;
import com.entity.view.DiscusstesemeishiView;

@Service("discusstesemeishiService")
public class DiscusstesemeishiServiceImpl extends ServiceImpl<DiscusstesemeishiDao, DiscusstesemeishiEntity> implements DiscusstesemeishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstesemeishiEntity> page = this.selectPage(
                new Query<DiscusstesemeishiEntity>(params).getPage(),
                new EntityWrapper<DiscusstesemeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstesemeishiEntity> wrapper) {
		  Page<DiscusstesemeishiView> page =new Query<DiscusstesemeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstesemeishiVO> selectListVO(Wrapper<DiscusstesemeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstesemeishiVO selectVO(Wrapper<DiscusstesemeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstesemeishiView> selectListView(Wrapper<DiscusstesemeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstesemeishiView selectView(Wrapper<DiscusstesemeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
