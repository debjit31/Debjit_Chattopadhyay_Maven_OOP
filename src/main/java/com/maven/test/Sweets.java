package com.maven.test;
abstract public class Sweets{
	private String name,shape, color;
	private float weight;
	public String getName(){
		return this.name;
	}
	public String getColor() {
		return this.color;
	}
	public String getShape() {
		return this.shape;
	}
	public float getWeight() {
		return this.weight;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setWeight(Float weight) {
		this.weight=weight;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setShape(String shape)
	{
		this.shape=shape;
	}
	abstract public void display();
	
}
