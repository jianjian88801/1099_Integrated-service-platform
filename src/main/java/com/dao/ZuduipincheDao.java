package com.dao;

import com.entity.ZuduipincheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuduipincheVO;
import com.entity.view.ZuduipincheView;


/**
 * 组队拼车
 * 
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public interface ZuduipincheDao extends BaseMapper<ZuduipincheEntity> {
	
	List<ZuduipincheVO> selectListVO(@Param("ew") Wrapper<ZuduipincheEntity> wrapper);
	
	ZuduipincheVO selectVO(@Param("ew") Wrapper<ZuduipincheEntity> wrapper);
	
	List<ZuduipincheView> selectListView(@Param("ew") Wrapper<ZuduipincheEntity> wrapper);

	List<ZuduipincheView> selectListView(Pagination page,@Param("ew") Wrapper<ZuduipincheEntity> wrapper);
	
	ZuduipincheView selectView(@Param("ew") Wrapper<ZuduipincheEntity> wrapper);
	

}
