package com.xworkz.task;

public class Ott {
	String[] names = new String[4];
	int index;

	public boolean addName(String name) {
		boolean isAdded = false;
		if (index < names.length) {

			if (name != null) {

				boolean exist = checkNameIfExist(name);
				if (exist == false) {
					names[index++] = name;
					System.out.println(name + " name is added");
					isAdded = true;
				} else {
					System.out.println("name already exist");
				}

			} else {
				System.out.println("null is not allowed");
			}
		} else {
			System.out.println("no space to add names");
		}
		return isAdded;

	}

	public void getName() {

		for (int i = 0; i < names.length; i++) {

			System.out.println(names[i]);
		}

	}

	public boolean checkNameIfExist(String value) {
		boolean exist = false;

		for (int j = 0; j < names.length; j++) {
			if (value == names[j]) {
				exist = true;

			}
		}
		return exist;

	}

}
