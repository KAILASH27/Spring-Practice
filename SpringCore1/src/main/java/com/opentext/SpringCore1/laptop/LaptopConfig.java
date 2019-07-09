package com.opentext.SpringCore1.laptop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.opentext.SpringCore1.storagedevice.HardDisk;
import com.opentext.SpringCore1.storagedevice.StorageDevice;

@Configuration
public class LaptopConfig {

	@Bean
	public Laptop1 laptop1() {
		return new Laptop1();
	}

	@Bean
	public Laptop laptop() {
		return new HPLaptop();
	}

	@Bean(name = "harddisk")
	public StorageDevice storagedevice() {
		return new HardDisk();
	}
}// End of Class
