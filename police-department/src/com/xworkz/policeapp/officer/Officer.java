package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.constatnts.BloodGroup;
import com.xworkz.policeapp.constatnts.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PoliceStation {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private BloodGroup bloodGroup;


}
