package com.dao;

import com.entity.JianzhipingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianzhipingjiaVO;
import com.entity.view.JianzhipingjiaView;


/**
 * 兼职评价
 * 
 * @author 
 * @email 
 * @date 2021-03-22 20:24:18
 */
public interface JianzhipingjiaDao extends BaseMapper<JianzhipingjiaEntity> {
	
	List<JianzhipingjiaVO> selectListVO(@Param("ew") Wrapper<JianzhipingjiaEntity> wrapper);
	
	JianzhipingjiaVO selectVO(@Param("ew") Wrapper<JianzhipingjiaEntity> wrapper);
	
	List<JianzhipingjiaView> selectListView(@Param("ew") Wrapper<JianzhipingjiaEntity> wrapper);

	List<JianzhipingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<JianzhipingjiaEntity> wrapper);
	
	JianzhipingjiaView selectView(@Param("ew") Wrapper<JianzhipingjiaEntity> wrapper);
	
}
