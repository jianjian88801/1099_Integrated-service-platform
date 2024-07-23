package com.dao;

import com.entity.FuwujiedanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwujiedanVO;
import com.entity.view.FuwujiedanView;


/**
 * 服务接单
 * 
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public interface FuwujiedanDao extends BaseMapper<FuwujiedanEntity> {
	
	List<FuwujiedanVO> selectListVO(@Param("ew") Wrapper<FuwujiedanEntity> wrapper);
	
	FuwujiedanVO selectVO(@Param("ew") Wrapper<FuwujiedanEntity> wrapper);
	
	List<FuwujiedanView> selectListView(@Param("ew") Wrapper<FuwujiedanEntity> wrapper);

	List<FuwujiedanView> selectListView(Pagination page,@Param("ew") Wrapper<FuwujiedanEntity> wrapper);
	
	FuwujiedanView selectView(@Param("ew") Wrapper<FuwujiedanEntity> wrapper);
	

}
