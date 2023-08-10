package com.get.set.app;

public class LinkedInRunner {

	public static void main(String[] args) {

		
		LinkedIn app= new LinkedIn();
		app.setInvention(2002);
		System.out.println(app.getInvention());
		app.setFounder("Reid Hoffman");
		System.out.println(app.getFounder());
		app.setUsed("job portal");
		System.out.println(app.getUsed());
		app.setAvailable("free");
		System.out.println(app.getUsed());
		app.setUsers(2000000);
		System.out.println(app.getUsers());
		app.setSecure(true);
		System.out.println(app.isSecure());
		app.setAudioCall(true);
		System.out.println(app.isAudioCall());
		app.setVideoCall(false);
		System.out.println(app.isVideoCall());
		app.setVoiceMessage(false);
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
