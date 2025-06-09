package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JianzhipingjiaDao;
import com.entity.JianzhipingjiaEntity;
import com.service.JianzhipingjiaService;
import com.entity.vo.JianzhipingjiaVO;
import com.entity.view.JianzhipingjiaView;

@Service("jianzhipingjiaService")
public class JianzhipingjiaServiceImpl extends ServiceImpl<JianzhipingjiaDao, JianzhipingjiaEntity> implements JianzhipingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianzhipingjiaEntity> page = this.selectPage(
                new Query<JianzhipingjiaEntity>(params).getPage(),
                new EntityWrapper<JianzhipingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianzhipingjiaEntity> wrapper) {
		  Page<JianzhipingjiaView> page =new Query<JianzhipingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianzhipingjiaVO> selectListVO(Wrapper<JianzhipingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianzhipingjiaVO selectVO(Wrapper<JianzhipingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianzhipingjiaView> selectListView(Wrapper<JianzhipingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianzhipingjiaView selectView(Wrapper<JianzhipingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
