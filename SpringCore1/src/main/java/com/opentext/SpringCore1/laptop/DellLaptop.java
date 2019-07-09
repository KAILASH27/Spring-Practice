package com.opentext.SpringCore1.laptop;

public class DellLaptop implements Laptop {

	private String color;
	private float cost;
	private float weight;
	private int ram;
	private String brand;
	private String operatingsystem;

	// Getters and Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingsystem() {
		return operatingsystem;
	}

	public void setOperatingsystem(String operatingsystem) {
		this.operatingsystem = operatingsystem;
	}

	public void display() {
		System.out.println("display() of dell");

	}

	public void process() {
		System.out.println("process() of dell");

	}

	public void showSpecification() {
		System.out.println("showspecification() of dell");

	}

}// End Class
