package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianzhijiaoyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianzhijiaoyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianzhijiaoyiView;


/**
 * 闲置交易
 *
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public interface XianzhijiaoyiService extends IService<XianzhijiaoyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianzhijiaoyiVO> selectListVO(Wrapper<XianzhijiaoyiEntity> wrapper);
   	
   	XianzhijiaoyiVO selectVO(@Param("ew") Wrapper<XianzhijiaoyiEntity> wrapper);
   	
   	List<XianzhijiaoyiView> selectListView(Wrapper<XianzhijiaoyiEntity> wrapper);
   	
   	XianzhijiaoyiView selectView(@Param("ew") Wrapper<XianzhijiaoyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianzhijiaoyiEntity> wrapper);
   	

}

