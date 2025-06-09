package com.dao;

import com.entity.XueshengyingpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengyingpinVO;
import com.entity.view.XueshengyingpinView;


/**
 * 学生应聘
 * 
 * @author 
 * @email 
 * @date 2021-03-22 20:24:18
 */
public interface XueshengyingpinDao extends BaseMapper<XueshengyingpinEntity> {
	
	List<XueshengyingpinVO> selectListVO(@Param("ew") Wrapper<XueshengyingpinEntity> wrapper);
	
	XueshengyingpinVO selectVO(@Param("ew") Wrapper<XueshengyingpinEntity> wrapper);
	
	List<XueshengyingpinView> selectListView(@Param("ew") Wrapper<XueshengyingpinEntity> wrapper);

	List<XueshengyingpinView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengyingpinEntity> wrapper);
	
	XueshengyingpinView selectView(@Param("ew") Wrapper<XueshengyingpinEntity> wrapper);
	
}
