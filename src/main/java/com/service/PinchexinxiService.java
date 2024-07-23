package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PinchexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PinchexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PinchexinxiView;


/**
 * 拼车信息
 *
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public interface PinchexinxiService extends IService<PinchexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PinchexinxiVO> selectListVO(Wrapper<PinchexinxiEntity> wrapper);
   	
   	PinchexinxiVO selectVO(@Param("ew") Wrapper<PinchexinxiEntity> wrapper);
   	
   	List<PinchexinxiView> selectListView(Wrapper<PinchexinxiEntity> wrapper);
   	
   	PinchexinxiView selectView(@Param("ew") Wrapper<PinchexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PinchexinxiEntity> wrapper);
   	

}

