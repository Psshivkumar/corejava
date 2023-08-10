package com.get.set.app;

public class YouTubeRunner {

	public static void main(String[] args) {


		YouTube app=new YouTube();
		app.setInvention(2005);
		System.out.println(app.getInvention());
		app.setFounder("Steve Chen, Chad Hurley, and Jawed Karim");
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
