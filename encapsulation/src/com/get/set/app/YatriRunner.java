package com.get.set.app;

public class YatriRunner {

	public static void main(String[] args) {

		
		NammaYatri app=new NammaYatri();
		app.setInvention(2022);
		System.out.println(app.getInvention());
		app.setFounder("Bengaluru's Auto Rickshaw Drivers' Union ");
		System.out.println(app.getFounder());
		app.setUsed("travell");
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
		app.setVideoSharing(false);
		System.out.println(app.isVideoSharing());
		app.setDocumentSharing(false);
		System.out.println(app.isDocumentSharing());
		app.setDesktopAccess(true);
		System.out.println(app.isDesktopAccess());
		
	}

}
