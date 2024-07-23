package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuduipincheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuduipincheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuduipincheView;


/**
 * 组队拼车
 *
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public interface ZuduipincheService extends IService<ZuduipincheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuduipincheVO> selectListVO(Wrapper<ZuduipincheEntity> wrapper);
   	
   	ZuduipincheVO selectVO(@Param("ew") Wrapper<ZuduipincheEntity> wrapper);
   	
   	List<ZuduipincheView> selectListView(Wrapper<ZuduipincheEntity> wrapper);
   	
   	ZuduipincheView selectView(@Param("ew") Wrapper<ZuduipincheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuduipincheEntity> wrapper);
   	

}

