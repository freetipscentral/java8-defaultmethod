package com.freetipscentral.defaultmethod;

public interface GenericRemote {
	
	public void startDevice();
	
	default public void stopDevice() {
		System.out.println("Default Stop Device");
	}
}
