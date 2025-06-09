package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjianliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjianliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjianliView;


/**
 * 学生简历
 *
 * @author 
 * @email 
 * @date 2021-03-22 20:24:18
 */
public interface XueshengjianliService extends IService<XueshengjianliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjianliVO> selectListVO(Wrapper<XueshengjianliEntity> wrapper);
   	
   	XueshengjianliVO selectVO(@Param("ew") Wrapper<XueshengjianliEntity> wrapper);
   	
   	List<XueshengjianliView> selectListView(Wrapper<XueshengjianliEntity> wrapper);
   	
   	XueshengjianliView selectView(@Param("ew") Wrapper<XueshengjianliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjianliEntity> wrapper);
   	
}

