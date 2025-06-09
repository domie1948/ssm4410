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


import com.dao.XueshengjianliDao;
import com.entity.XueshengjianliEntity;
import com.service.XueshengjianliService;
import com.entity.vo.XueshengjianliVO;
import com.entity.view.XueshengjianliView;

@Service("xueshengjianliService")
public class XueshengjianliServiceImpl extends ServiceImpl<XueshengjianliDao, XueshengjianliEntity> implements XueshengjianliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjianliEntity> page = this.selectPage(
                new Query<XueshengjianliEntity>(params).getPage(),
                new EntityWrapper<XueshengjianliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjianliEntity> wrapper) {
		  Page<XueshengjianliView> page =new Query<XueshengjianliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjianliVO> selectListVO(Wrapper<XueshengjianliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjianliVO selectVO(Wrapper<XueshengjianliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjianliView> selectListView(Wrapper<XueshengjianliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjianliView selectView(Wrapper<XueshengjianliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
