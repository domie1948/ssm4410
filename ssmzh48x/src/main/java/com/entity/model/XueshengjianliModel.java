package com.entity.model;

import com.entity.XueshengjianliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生简历
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-22 20:24:18
 */
public class XueshengjianliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 学校
	 */
	
	private String xuexiao;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 所获奖项
	 */
	
	private String suohuojiangxiang;
		
	/**
	 * 所获技能
	 */
	
	private String suohuojineng;
		
	/**
	 * 学校经历
	 */
	
	private String xuexiaojingli;
		
	/**
	 * 社会实践
	 */
	
	private String shehuishijian;
		
	/**
	 * 自我评价
	 */
	
	private String ziwopingjia;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：学校
	 */
	 
	public void setXuexiao(String xuexiao) {
		this.xuexiao = xuexiao;
	}
	
	/**
	 * 获取：学校
	 */
	public String getXuexiao() {
		return xuexiao;
	}
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：所获奖项
	 */
	 
	public void setSuohuojiangxiang(String suohuojiangxiang) {
		this.suohuojiangxiang = suohuojiangxiang;
	}
	
	/**
	 * 获取：所获奖项
	 */
	public String getSuohuojiangxiang() {
		return suohuojiangxiang;
	}
				
	
	/**
	 * 设置：所获技能
	 */
	 
	public void setSuohuojineng(String suohuojineng) {
		this.suohuojineng = suohuojineng;
	}
	
	/**
	 * 获取：所获技能
	 */
	public String getSuohuojineng() {
		return suohuojineng;
	}
				
	
	/**
	 * 设置：学校经历
	 */
	 
	public void setXuexiaojingli(String xuexiaojingli) {
		this.xuexiaojingli = xuexiaojingli;
	}
	
	/**
	 * 获取：学校经历
	 */
	public String getXuexiaojingli() {
		return xuexiaojingli;
	}
				
	
	/**
	 * 设置：社会实践
	 */
	 
	public void setShehuishijian(String shehuishijian) {
		this.shehuishijian = shehuishijian;
	}
	
	/**
	 * 获取：社会实践
	 */
	public String getShehuishijian() {
		return shehuishijian;
	}
				
	
	/**
	 * 设置：自我评价
	 */
	 
	public void setZiwopingjia(String ziwopingjia) {
		this.ziwopingjia = ziwopingjia;
	}
	
	/**
	 * 获取：自我评价
	 */
	public String getZiwopingjia() {
		return ziwopingjia;
	}
			
}
