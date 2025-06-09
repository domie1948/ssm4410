package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianzhipingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianzhipingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianzhipingjiaView;


/**
 * 兼职评价
 *
 * @author 
 * @email 
 * @date 2021-03-22 20:24:18
 */
public interface JianzhipingjiaService extends IService<JianzhipingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianzhipingjiaVO> selectListVO(Wrapper<JianzhipingjiaEntity> wrapper);
   	
   	JianzhipingjiaVO selectVO(@Param("ew") Wrapper<JianzhipingjiaEntity> wrapper);
   	
   	List<JianzhipingjiaView> selectListView(Wrapper<JianzhipingjiaEntity> wrapper);
   	
   	JianzhipingjiaView selectView(@Param("ew") Wrapper<JianzhipingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianzhipingjiaEntity> wrapper);
   	
}

