package com.freetipscentral.defaultmethod;

public class TVRemote implements GenericRemote {
	public void startDevice(){
		System.out.println("TV Started");
	}
	
	@Override
	public void stopDevice() {
		System.out.println("TV Stopped");
	}
}
