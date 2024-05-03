package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussyoujixinxiEntity;
import com.entity.view.DiscussyoujixinxiView;

import com.service.DiscussyoujixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 游记信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-20 09:57:19
 */
@RestController
@RequestMapping("/discussyoujixinxi")
public class DiscussyoujixinxiController {
    @Autowired
    private DiscussyoujixinxiService discussyoujixinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussyoujixinxiEntity discussyoujixinxi,
		HttpServletRequest request){
        EntityWrapper<DiscussyoujixinxiEntity> ew = new EntityWrapper<DiscussyoujixinxiEntity>();

		PageUtils page = discussyoujixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyoujixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussyoujixinxiEntity discussyoujixinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscussyoujixinxiEntity> ew = new EntityWrapper<DiscussyoujixinxiEntity>();

		PageUtils page = discussyoujixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyoujixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussyoujixinxiEntity discussyoujixinxi){
       	EntityWrapper<DiscussyoujixinxiEntity> ew = new EntityWrapper<DiscussyoujixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussyoujixinxi, "discussyoujixinxi")); 
        return R.ok().put("data", discussyoujixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussyoujixinxiEntity discussyoujixinxi){
        EntityWrapper< DiscussyoujixinxiEntity> ew = new EntityWrapper< DiscussyoujixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussyoujixinxi, "discussyoujixinxi")); 
		DiscussyoujixinxiView discussyoujixinxiView =  discussyoujixinxiService.selectView(ew);
		return R.ok("查询游记信息评论表成功").put("data", discussyoujixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussyoujixinxiEntity discussyoujixinxi = discussyoujixinxiService.selectById(id);
        return R.ok().put("data", discussyoujixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussyoujixinxiEntity discussyoujixinxi = discussyoujixinxiService.selectById(id);
        return R.ok().put("data", discussyoujixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussyoujixinxiEntity discussyoujixinxi, HttpServletRequest request){
    	discussyoujixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussyoujixinxi);
        discussyoujixinxiService.insert(discussyoujixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussyoujixinxiEntity discussyoujixinxi, HttpServletRequest request){
    	discussyoujixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussyoujixinxi);
        discussyoujixinxiService.insert(discussyoujixinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussyoujixinxiEntity discussyoujixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussyoujixinxi);
        discussyoujixinxiService.updateById(discussyoujixinxi);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussyoujixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussyoujixinxiEntity> wrapper = new EntityWrapper<DiscussyoujixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussyoujixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
