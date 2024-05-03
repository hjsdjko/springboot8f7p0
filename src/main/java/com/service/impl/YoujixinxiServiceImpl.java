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


import com.dao.YoujixinxiDao;
import com.entity.YoujixinxiEntity;
import com.service.YoujixinxiService;
import com.entity.vo.YoujixinxiVO;
import com.entity.view.YoujixinxiView;

@Service("youjixinxiService")
public class YoujixinxiServiceImpl extends ServiceImpl<YoujixinxiDao, YoujixinxiEntity> implements YoujixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YoujixinxiEntity> page = this.selectPage(
                new Query<YoujixinxiEntity>(params).getPage(),
                new EntityWrapper<YoujixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YoujixinxiEntity> wrapper) {
		  Page<YoujixinxiView> page =new Query<YoujixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YoujixinxiVO> selectListVO(Wrapper<YoujixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YoujixinxiVO selectVO(Wrapper<YoujixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YoujixinxiView> selectListView(Wrapper<YoujixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YoujixinxiView selectView(Wrapper<YoujixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
