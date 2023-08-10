package com.get.set.app;

public class PubgRunner {

	public static void main(String[] args) {

		
		Pubg app= new Pubg();
		app.setInvention(2017);
		System.out.println(app.getInvention());
		app.setFounder("Brendan Greene");
		System.out.println(app.getFounder());
		app.setUsed("game");
		System.out.println(app.getUsed());
		app.setAvailable("free");
		System.out.println(app.getAvailable());
		app.setUsers(2000000);
		System.out.println(app.getUsers());
		app.setSecure(false);
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
