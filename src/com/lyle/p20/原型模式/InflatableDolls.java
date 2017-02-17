package com.lyle.p20.原型模式;

/**
 * @ClassName: InflatableDolls
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月17日 下午1:48:11
 */
public class InflatableDolls implements Cloneable {

	private String sex;

	private String material;

	private String size;

	private String name;

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void served() {
		System.out.println("baby->" + this.name + "来伺候你；费用是->" + this.price + "其他特性：[" + this.material + "," + this.size
				+ "," + this.sex + "]");
	}

	@Override
	public InflatableDolls clone() {
		try {
			return (InflatableDolls) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
