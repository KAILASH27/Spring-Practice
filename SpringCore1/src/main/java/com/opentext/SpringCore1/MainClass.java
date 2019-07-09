package com.opentext.SpringCore1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.opentext.SpringCore1.laptop.HPLaptop;
import com.opentext.SpringCore1.laptop.Laptop1;
import com.opentext.SpringCore1.laptop.LaptopConfig;
import com.opentext.SpringCore1.storagedevice.HardDisk;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
		Laptop1 lt1 = context.getBean(Laptop1.class);

		HPLaptop hp = (HPLaptop) lt1.getLaptop();
		hp.setColor("Blue");
		hp.setCost(25000f);
		hp.setWeight(12.5f);
		hp.setRam(1024);
		hp.setBrand("HP");
		hp.setOperatingsystem("Windows");

		HardDisk hd = (HardDisk) lt1.getStoragedevice();
		hd.setCapacity(1024);
		hd.setWritingspeed(24.5f);
		hd.setReadingspeed(25f);

		System.out.println("Features of Laptop:--------");
		System.out.println("Color: " + hp.getColor());
		System.out.println("Cost: " + hp.getCost());
		System.out.println("Weigth: " + hp.getWeight());
		System.out.println("RAM: " + hp.getRam());
		System.out.println("Brand: " + hp.getBrand());
		System.out.println("OS: " + hp.getOperatingsystem());

		System.out.println("Features of HARDDISK:---------");
		System.out.println(hd.getCapacity());
		System.out.println(hd.getWritingspeed());
		System.out.println(hd.getReadingspeed());

		lt1.operations();
	}// End of Main()

}// End of Class
