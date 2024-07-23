package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwujiedanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwujiedanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwujiedanView;


/**
 * 服务接单
 *
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public interface FuwujiedanService extends IService<FuwujiedanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwujiedanVO> selectListVO(Wrapper<FuwujiedanEntity> wrapper);
   	
   	FuwujiedanVO selectVO(@Param("ew") Wrapper<FuwujiedanEntity> wrapper);
   	
   	List<FuwujiedanView> selectListView(Wrapper<FuwujiedanEntity> wrapper);
   	
   	FuwujiedanView selectView(@Param("ew") Wrapper<FuwujiedanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwujiedanEntity> wrapper);
   	

}

