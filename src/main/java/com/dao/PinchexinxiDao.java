package com.dao;

import com.entity.PinchexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PinchexinxiVO;
import com.entity.view.PinchexinxiView;


/**
 * 拼车信息
 * 
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public interface PinchexinxiDao extends BaseMapper<PinchexinxiEntity> {
	
	List<PinchexinxiVO> selectListVO(@Param("ew") Wrapper<PinchexinxiEntity> wrapper);
	
	PinchexinxiVO selectVO(@Param("ew") Wrapper<PinchexinxiEntity> wrapper);
	
	List<PinchexinxiView> selectListView(@Param("ew") Wrapper<PinchexinxiEntity> wrapper);

	List<PinchexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PinchexinxiEntity> wrapper);
	
	PinchexinxiView selectView(@Param("ew") Wrapper<PinchexinxiEntity> wrapper);
	

}
