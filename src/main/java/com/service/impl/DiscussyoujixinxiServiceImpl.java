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


import com.dao.DiscussyoujixinxiDao;
import com.entity.DiscussyoujixinxiEntity;
import com.service.DiscussyoujixinxiService;
import com.entity.vo.DiscussyoujixinxiVO;
import com.entity.view.DiscussyoujixinxiView;

@Service("discussyoujixinxiService")
public class DiscussyoujixinxiServiceImpl extends ServiceImpl<DiscussyoujixinxiDao, DiscussyoujixinxiEntity> implements DiscussyoujixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyoujixinxiEntity> page = this.selectPage(
                new Query<DiscussyoujixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyoujixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyoujixinxiEntity> wrapper) {
		  Page<DiscussyoujixinxiView> page =new Query<DiscussyoujixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyoujixinxiVO> selectListVO(Wrapper<DiscussyoujixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyoujixinxiVO selectVO(Wrapper<DiscussyoujixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyoujixinxiView> selectListView(Wrapper<DiscussyoujixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyoujixinxiView selectView(Wrapper<DiscussyoujixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
