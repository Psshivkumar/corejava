package com.xworkz.policeapp;

import com.xworkz.policeapp.constatnts.BloodGroup;
import com.xworkz.policeapp.constatnts.Gender;
import com.xworkz.policeapp.officer.Officer;
import com.xworkz.policeapp.policestations.PoliceStation;

import java.util.Arrays;
import java.util.Scanner;

public class OfriicerTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number officers to be added");
        int size = sc.nextInt();
        PoliceStation ps = new PoliceStation(size);

//        int length = ps.officers.length;


        for (int i = 0; i < ps.officers.length; i++) {
            Officer off = new Officer();
            System.out.println("enter the id");
            off.setId(sc.nextInt());
            System.out.println("enter the name");
            off.setName(sc.next());
            System.out.println("enter the age");
            off.setAge(sc.nextInt());
            System.out.println("enter the address");
            off.setAddress(sc.next());
            System.out.println("enter the gender");
            off.setGender(Gender.valueOf(sc.next()));
            System.out.println("enter the email");
            off.setEmail(sc.next());
            System.out.println("enter the post name");
            off.setPostName(sc.next());
            System.out.println("enter the blood group");
            off.setBloodGroup(BloodGroup.valueOf(sc.next()));
            ps.addOfficer(off);
        }
//        Officer off1 = new Officer();
//        Officer off2 = new Officer();
//        Officer off3 = new Officer();
//        Officer off4 = new Officer();

//        off.setId(1);
//        off.setAddress("rajajinagar");
//        off.setAge(32);
//        off.setEmail("Shivu@gmail.com");
//        off.setGender(Gender.Male);
//        off.setName("Shivu");
//        off.setBloodGroup(BloodGroup.Opositive);
//        off.setPostName("SI");
//
//        ps.addOfficer(off);
//
//        off1.setId(2);
//        off1.setAddress("Makali");
//        off1.setAge(33);
//        off1.setEmail("prema@gmail.com");
//        off1.setGender(Gender.Female);
//        off1.setName("Prema");
//        off1.setBloodGroup(BloodGroup.Opositive);
//        off1.setPostName("constable");
//        ps.addOfficer(off1);
//
//        off2.setId(3);
//        off2.setAddress("BDA");
//        off2.setAge(35);
//        off2.setEmail("yogi@gmail.com");
//        off2.setGender(Gender.Male);
//        off2.setName("yogi");
//        off2.setBloodGroup(BloodGroup.ABnegative);
//        off2.setPostName("Watchman");
//        ps.addOfficer(off2);
//
//
//        off3.setId(4);
//        off3.setAddress("KBkere");
//        off3.setAge(34);
//        off3.setEmail("sonu@gmail.com");
//        off3.setGender(Gender.Female);
//        off3.setName("sonu");
//        off3.setBloodGroup(BloodGroup.Opositive);
//        off3.setPostName("SI");
//        ps.addOfficer(off3);
//
//
//        off4.setId(5);
//        off4.setAddress("white field");
//        off4.setAge(38);
//        off4.setEmail("sakshi@123");
//        off4.setGender(Gender.Female);
//        off4.setName("Sakshi");
//        off4.setBloodGroup(BloodGroup.Anegative);
//        off4.setPostName("constable");
//        ps.addOfficer(off4);


        ps.getAllOfficers();

        System.out.println("Enter post name to get all the officers with the same post");
        String officersName[] = ps.getOfficersNameByPostName(sc.next());
        for (int i = 0; i < officersName.length; i++) {
            System.out.println(officersName[i]);
        }
//        System.out.println(Arrays.toString(officersName));

        System.out.println("Enter the officer id to get Address");
        ps.getAddressById(sc.nextInt());
        System.out.println("enter the id to get officers information");
        ps.getOfficersInfoById(sc.nextInt());
        System.out.println("enter the name to get officers age");
        ps.getOfficersageByName(sc.next());
        System.out.println("enter the name to get Post name");
        ps.getPostNameByName(sc.next());
        System.out.println("enter the id to get the post name");
        ps.getPostNameById(sc.nextInt());
        System.out.println("enter the new post name and id to update the post name as new post name");
        ps.updatePostNameById(sc.next(), sc.nextInt());
        System.out.println("eneter tehe id to get officers information");
        ps.getOfficersInfoById(sc.nextInt());
        System.out.println("enter the id to delete the officer");
        ps.deleteOfficerById(sc.nextInt());

    }
}
