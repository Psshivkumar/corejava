package com.get.set.app;

public class MainRunner {

	public static void main(String[] args) {

		WhatsApp app=new WhatsApp();
		app.setInvention(2000);
		System.out.println(app.getInvention());
		app.setFounder("brion action and jan koum");
		System.out.println(app.getFounder());
		app.setUsed("messaging");
		System.out.println(app.getUsed());
		app.setAvailable("free");
		System.out.println(app.getUsed());
		app.setUsers(2000000);
		System.out.println(app.getUsers());
		app.setSecure(true);
		System.out.println(app.isSecure());
		app.setAudioCall(true);
		System.out.println(app.isAudioCall());
		app.setVideoCall(true);
		System.out.println(app.isVideoCall());
		app.setVoiceMessage(true);
		System.out.println(app.isVoiceMessage());
		app.setSecureMessage(true);
		System.out.println(app.isSecureMessage());
		app.setPhotoSharing(true);
		System.out.println(app.isPhotoSharing());
		app.setVideoSharing(true);
		System.out.println(app.isVideoSharing());
		app.setDocumentSharing(true);
		System.out.println(app.isDocumentSharing());
		app.setDesktopAccess(true);
		System.out.println(app.isDesktopAccess());
		
		
	}

}
