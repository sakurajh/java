package com.baidou;
class Material{
	protected String name;
	protected double price;
	
	public Material(String name,double price) {
		this.name=name;
		this.price=price;		
	}
	public void getInfoMaterial() {
		System.out.println("材料的名称为:"+this.name);
		System.out.println("材料的价格为:"+this.price);
	}
}
class Wood extends Material{
	private String color;
	
	public Wood(String name,double price,String color) {
		super(name, price);
		this.color=color;
	}
	public void getInfoMaterial() {
		System.out.println("材料的名称为:"+super.name);
		System.out.println("材料的价格为:"+super.price);
		System.out.println("材料的颜色为:"+this.color);
	}
}
public class TestWood {
	public static void main(String[] args) {
		
		Material material=new Material("牡丹花",20);
		material.getInfoMaterial();
		System.out.println("---------------");
		Wood wood=new Wood("杜鹃花", 50, "黄色");
		wood.getInfoMaterial();		
	}

}
