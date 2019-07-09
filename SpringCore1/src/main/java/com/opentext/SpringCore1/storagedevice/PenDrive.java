package com.opentext.SpringCore1.storagedevice;

public class PenDrive implements StorageDevice {
	private int capacity;
	private float writingspeed;
	private float readingspeed;

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

	public void write() {
		System.out.println("Writing in pendrive");

	}

	public void read() {
		System.out.println("Reading from pendrive");

	}

	public void format() {
		System.out.println("Formatting the pendrive");

	}
}// End Class
