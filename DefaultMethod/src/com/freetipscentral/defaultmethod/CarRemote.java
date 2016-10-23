package com.freetipscentral.defaultmethod;

public interface CarRemote extends GenericRemote {
	default public void stopDevice() {
		System.out.println("Stop the Car");
	}
}
