package com.opentext.SpringCore1.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opentext.SpringCore1.storagedevice.StorageDevice;

public class Laptop1 {

	@Autowired
	private Laptop laptop;

	@Autowired
	@Qualifier("harddisk")
	private StorageDevice storagedevice;

	// Getter and Setters
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public StorageDevice getStoragedevice() {
		return storagedevice;
	}

	public void setStoragedevice(StorageDevice storagedevice) {
		this.storagedevice = storagedevice;
	}

	public void operations() {
		laptop.display();
		laptop.process();
		laptop.showSpecification();
		storagedevice.write();
		storagedevice.read();
		storagedevice.format();
	}

}// End Class
