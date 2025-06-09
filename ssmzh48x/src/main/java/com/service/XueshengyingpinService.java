package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengyingpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengyingpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengyingpinView;


/**
 * 学生应聘
 *
 * @author 
 * @email 
 * @date 2021-03-22 20:24:18
 */
public interface XueshengyingpinService extends IService<XueshengyingpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengyingpinVO> selectListVO(Wrapper<XueshengyingpinEntity> wrapper);
   	
   	XueshengyingpinVO selectVO(@Param("ew") Wrapper<XueshengyingpinEntity> wrapper);
   	
   	List<XueshengyingpinView> selectListView(Wrapper<XueshengyingpinEntity> wrapper);
   	
   	XueshengyingpinView selectView(@Param("ew") Wrapper<XueshengyingpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengyingpinEntity> wrapper);
   	
}

