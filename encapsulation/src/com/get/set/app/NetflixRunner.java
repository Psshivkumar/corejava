package com.get.set.app;

public class NetflixRunner {

	public static void main(String[] args) {
		
		Netflix app= new Netflix();
		app.setInvention(1997);
		System.out.println(app.getInvention());
		app.setFounder("Reed Hastings and Marc Randolph");
		System.out.println(app.getFounder());
		app.setUsed("entertainment");
		System.out.println(app.getUsed());
		app.setAvailable("not free");
		System.out.println(app.getAvailable());
		app.setUsers(2000000);
		System.out.println(app.getUsers());
		app.setSecure(true);
		System.out.println(app.isSecure());
		app.setAudioCall(false);
		System.out.println(app.isAudioCall());
		app.setVideoCall(false);
		System.out.println(app.isVideoCall());
		app.setVoiceMessage(false);
		System.out.println(app.isVoiceMessage());
		app.setSecureMessage(false);
		System.out.println(app.isSecureMessage());
		app.setPhotoSharing(false);
		System.out.println(app.isPhotoSharing());
		app.setVideoSharing(false);
		System.out.println(app.isVideoSharing());
		app.setDocumentSharing(false);
		System.out.println(app.isDocumentSharing());
		app.setDesktopAccess(true);
		System.out.println(app.isDesktopAccess());
		

	}

}
