package com.opentext.SpringCore1.storagedevice;

public class HardDisk implements StorageDevice {

	private int capacity;
	private float writingspeed;
	private float readingspeed;

	public void write() {
		System.out.println("write() of HardDisk");

	}

	public void read() {
		System.out.println("read() of HardDisk");

	}

	public void format() {
		System.out.println("format() of HardDisk");

	}

	// Getters and Setters
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public float getWritingspeed() {
		return writingspeed;
	}

	public void setWritingspeed(float writingspeed) {
		this.writingspeed = writingspeed;
	}

	public float getReadingspeed() {
		return readingspeed;
	}

	public void setReadingspeed(float readingspeed) {
		this.readingspeed = readingspeed;
	}

}// End Class
