package com.entity.model;

import com.entity.PinchexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 拼车信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public class PinchexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 司机姓名
	 */
	
	private String sijixingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 出发地点
	 */
	
	private String chufadidian;
		
	/**
	 * 到达地点
	 */
	
	private String daodadidian;
		
	/**
	 * 出发时间
	 */
	
	private String chufashijian;
		
	/**
	 * 单人费用
	 */
	
	private Integer danrenfeiyong;
		
	/**
	 * 座位数
	 */
	
	private Integer zuoweishu;
		
	/**
	 * 拼车金额
	 */
	
	private Integer pinchejine;
		
	/**
	 * 拼车时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pincheshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
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
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：司机姓名
	 */
	 
	public void setSijixingming(String sijixingming) {
		this.sijixingming = sijixingming;
	}
	
	/**
	 * 获取：司机姓名
	 */
	public String getSijixingming() {
		return sijixingming;
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：出发地点
	 */
	 
	public void setChufadidian(String chufadidian) {
		this.chufadidian = chufadidian;
	}
	
	/**
	 * 获取：出发地点
	 */
	public String getChufadidian() {
		return chufadidian;
	}
				
	
	/**
	 * 设置：到达地点
	 */
	 
	public void setDaodadidian(String daodadidian) {
		this.daodadidian = daodadidian;
	}
	
	/**
	 * 获取：到达地点
	 */
	public String getDaodadidian() {
		return daodadidian;
	}
				
	
	/**
	 * 设置：出发时间
	 */
	 
	public void setChufashijian(String chufashijian) {
		this.chufashijian = chufashijian;
	}
	
	/**
	 * 获取：出发时间
	 */
	public String getChufashijian() {
		return chufashijian;
	}
				
	
	/**
	 * 设置：单人费用
	 */
	 
	public void setDanrenfeiyong(Integer danrenfeiyong) {
		this.danrenfeiyong = danrenfeiyong;
	}
	
	/**
	 * 获取：单人费用
	 */
	public Integer getDanrenfeiyong() {
		return danrenfeiyong;
	}
				
	
	/**
	 * 设置：座位数
	 */
	 
	public void setZuoweishu(Integer zuoweishu) {
		this.zuoweishu = zuoweishu;
	}
	
	/**
	 * 获取：座位数
	 */
	public Integer getZuoweishu() {
		return zuoweishu;
	}
				
	
	/**
	 * 设置：拼车金额
	 */
	 
	public void setPinchejine(Integer pinchejine) {
		this.pinchejine = pinchejine;
	}
	
	/**
	 * 获取：拼车金额
	 */
	public Integer getPinchejine() {
		return pinchejine;
	}
				
	
	/**
	 * 设置：拼车时间
	 */
	 
	public void setPincheshijian(Date pincheshijian) {
		this.pincheshijian = pincheshijian;
	}
	
	/**
	 * 获取：拼车时间
	 */
	public Date getPincheshijian() {
		return pincheshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
