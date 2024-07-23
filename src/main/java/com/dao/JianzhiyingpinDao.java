package com.dao;

import com.entity.JianzhiyingpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianzhiyingpinVO;
import com.entity.view.JianzhiyingpinView;


/**
 * 兼职应聘
 * 
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public interface JianzhiyingpinDao extends BaseMapper<JianzhiyingpinEntity> {
	
	List<JianzhiyingpinVO> selectListVO(@Param("ew") Wrapper<JianzhiyingpinEntity> wrapper);
	
	JianzhiyingpinVO selectVO(@Param("ew") Wrapper<JianzhiyingpinEntity> wrapper);
	
	List<JianzhiyingpinView> selectListView(@Param("ew") Wrapper<JianzhiyingpinEntity> wrapper);

	List<JianzhiyingpinView> selectListView(Pagination page,@Param("ew") Wrapper<JianzhiyingpinEntity> wrapper);
	
	JianzhiyingpinView selectView(@Param("ew") Wrapper<JianzhiyingpinEntity> wrapper);
	

}
