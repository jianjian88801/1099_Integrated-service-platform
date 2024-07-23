package com.entity.model;

import com.entity.ZuduipincheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 组队拼车
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-31 17:19:17
 */
public class ZuduipincheModel  implements Serializable {
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
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 出发地点
	 */
	
	private String chufadidian;
		
	/**
	 * 到达地点
	 */
	
	private String daodadidian;
		
	/**
	 * 单人费用
	 */
	
	private Integer danrenfeiyong;
		
	/**
	 * 座位数
	 */
	
	private Integer zuoweishu;
		
	/**
	 * 出发时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chufashijian;
				
	
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
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：出发时间
	 */
	 
	public void setChufashijian(Date chufashijian) {
		this.chufashijian = chufashijian;
	}
	
	/**
	 * 获取：出发时间
	 */
	public Date getChufashijian() {
		return chufashijian;
	}
			
}
