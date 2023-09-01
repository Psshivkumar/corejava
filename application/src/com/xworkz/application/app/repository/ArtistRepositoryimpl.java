package com.xworkz.application.app.repository;

public class ArtistRepositoryimpl implements ArtistRepository {
	private String[] detail = new String[TOTAL_NO];
	private int position;

	@Override
	public void save(String details) {
		System.out.println("invoke save in ArtistRepositoryimpl ");
		if (position < TOTAL_NO) {

			this.detail[position] = details;

			System.out.println("detail " + details + " at position " + position);
			this.position++;
		} else {
			System.err.println("memory full no space");
		}

	}

}
