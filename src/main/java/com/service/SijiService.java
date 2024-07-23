package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SijiView;


/**
 * 司机
 *
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public interface SijiService extends IService<SijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SijiVO> selectListVO(Wrapper<SijiEntity> wrapper);
   	
   	SijiVO selectVO(@Param("ew") Wrapper<SijiEntity> wrapper);
   	
   	List<SijiView> selectListView(Wrapper<SijiEntity> wrapper);
   	
   	SijiView selectView(@Param("ew") Wrapper<SijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SijiEntity> wrapper);
   	

}

