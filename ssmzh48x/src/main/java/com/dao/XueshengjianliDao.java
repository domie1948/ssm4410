package com.dao;

import com.entity.XueshengjianliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjianliVO;
import com.entity.view.XueshengjianliView;


/**
 * 学生简历
 * 
 * @author 
 * @email 
 * @date 2021-03-22 20:24:18
 */
public interface XueshengjianliDao extends BaseMapper<XueshengjianliEntity> {
	
	List<XueshengjianliVO> selectListVO(@Param("ew") Wrapper<XueshengjianliEntity> wrapper);
	
	XueshengjianliVO selectVO(@Param("ew") Wrapper<XueshengjianliEntity> wrapper);
	
	List<XueshengjianliView> selectListView(@Param("ew") Wrapper<XueshengjianliEntity> wrapper);

	List<XueshengjianliView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjianliEntity> wrapper);
	
	XueshengjianliView selectView(@Param("ew") Wrapper<XueshengjianliEntity> wrapper);
	
}
