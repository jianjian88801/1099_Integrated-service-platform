package com.controller;

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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JianzhiyingpinEntity;
import com.entity.view.JianzhiyingpinView;

import com.service.JianzhiyingpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 兼职应聘
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
@RestController
@RequestMapping("/jianzhiyingpin")
public class JianzhiyingpinController {
    @Autowired
    private JianzhiyingpinService jianzhiyingpinService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianzhiyingpinEntity jianzhiyingpin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			jianzhiyingpin.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			jianzhiyingpin.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JianzhiyingpinEntity> ew = new EntityWrapper<JianzhiyingpinEntity>();
		PageUtils page = jianzhiyingpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianzhiyingpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianzhiyingpinEntity jianzhiyingpin, 
		HttpServletRequest request){
        EntityWrapper<JianzhiyingpinEntity> ew = new EntityWrapper<JianzhiyingpinEntity>();
		PageUtils page = jianzhiyingpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianzhiyingpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianzhiyingpinEntity jianzhiyingpin){
       	EntityWrapper<JianzhiyingpinEntity> ew = new EntityWrapper<JianzhiyingpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianzhiyingpin, "jianzhiyingpin")); 
        return R.ok().put("data", jianzhiyingpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianzhiyingpinEntity jianzhiyingpin){
        EntityWrapper< JianzhiyingpinEntity> ew = new EntityWrapper< JianzhiyingpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianzhiyingpin, "jianzhiyingpin")); 
		JianzhiyingpinView jianzhiyingpinView =  jianzhiyingpinService.selectView(ew);
		return R.ok("查询兼职应聘成功").put("data", jianzhiyingpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianzhiyingpinEntity jianzhiyingpin = jianzhiyingpinService.selectById(id);
        return R.ok().put("data", jianzhiyingpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianzhiyingpinEntity jianzhiyingpin = jianzhiyingpinService.selectById(id);
        return R.ok().put("data", jianzhiyingpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianzhiyingpinEntity jianzhiyingpin, HttpServletRequest request){
    	jianzhiyingpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianzhiyingpin);
        jianzhiyingpinService.insert(jianzhiyingpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianzhiyingpinEntity jianzhiyingpin, HttpServletRequest request){
    	jianzhiyingpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianzhiyingpin);
        jianzhiyingpinService.insert(jianzhiyingpin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JianzhiyingpinEntity jianzhiyingpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianzhiyingpin);
        jianzhiyingpinService.updateById(jianzhiyingpin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianzhiyingpinService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JianzhiyingpinEntity> wrapper = new EntityWrapper<JianzhiyingpinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangjiazhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jianzhiyingpinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
