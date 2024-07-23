package com.entity.vo;

import com.entity.FuwujiedanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 服务接单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public class FuwujiedanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服务类型
	 */
	
	private String fuwuleixing;
		
	/**
	 * 酬金
	 */
	
	private Integer choujin;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 接单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiedanshijian;
		
	/**
	 * 接单账号
	 */
	
	private String jiedanzhanghao;
		
	/**
	 * 接单号码
	 */
	
	private String jiedanhaoma;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：服务类型
	 */
	 
	public void setFuwuleixing(String fuwuleixing) {
		this.fuwuleixing = fuwuleixing;
	}
	
	/**
	 * 获取：服务类型
	 */
	public String getFuwuleixing() {
		return fuwuleixing;
	}
				
	
	/**
	 * 设置：酬金
	 */
	 
	public void setChoujin(Integer choujin) {
		this.choujin = choujin;
	}
	
	/**
	 * 获取：酬金
	 */
	public Integer getChoujin() {
		return choujin;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：接单时间
	 */
	 
	public void setJiedanshijian(Date jiedanshijian) {
		this.jiedanshijian = jiedanshijian;
	}
	
	/**
	 * 获取：接单时间
	 */
	public Date getJiedanshijian() {
		return jiedanshijian;
	}
				
	
	/**
	 * 设置：接单账号
	 */
	 
	public void setJiedanzhanghao(String jiedanzhanghao) {
		this.jiedanzhanghao = jiedanzhanghao;
	}
	
	/**
	 * 获取：接单账号
	 */
	public String getJiedanzhanghao() {
		return jiedanzhanghao;
	}
				
	
	/**
	 * 设置：接单号码
	 */
	 
	public void setJiedanhaoma(String jiedanhaoma) {
		this.jiedanhaoma = jiedanhaoma;
	}
	
	/**
	 * 获取：接单号码
	 */
	public String getJiedanhaoma() {
		return jiedanhaoma;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
