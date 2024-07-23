package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianzhiyingpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianzhiyingpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianzhiyingpinView;


/**
 * 兼职应聘
 *
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public interface JianzhiyingpinService extends IService<JianzhiyingpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianzhiyingpinVO> selectListVO(Wrapper<JianzhiyingpinEntity> wrapper);
   	
   	JianzhiyingpinVO selectVO(@Param("ew") Wrapper<JianzhiyingpinEntity> wrapper);
   	
   	List<JianzhiyingpinView> selectListView(Wrapper<JianzhiyingpinEntity> wrapper);
   	
   	JianzhiyingpinView selectView(@Param("ew") Wrapper<JianzhiyingpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianzhiyingpinEntity> wrapper);
   	

}

