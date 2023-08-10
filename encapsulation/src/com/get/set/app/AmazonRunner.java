package com.get.set.app;

public class AmazonRunner {

	public static void main(String[] args) {
		Amazon app=new Amazon();
		app.setInvention(1994);
		System.out.println(app.getInvention());
		app.setFounder("Jeff Bezos");
		System.out.println(app.getFounder());
		app.setUsed("shoping");
		System.out.println(app.getUsed());
		app.setAvailable("not free");
		System.out.println(app.getUsed());
		app.setUsers(1250000);
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
		app.setVideoSharing(true);
		System.out.println(app.isVideoSharing());
		app.setDocumentSharing(false);
		System.out.println(app.isDocumentSharing());
		app.setDesktopAccess(false);
		System.out.println(app.isDesktopAccess());
		
		
	}

}
