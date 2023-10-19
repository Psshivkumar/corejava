package com.xworkz.showroom;

import com.xworkz.showroom.constants.Company;
import com.xworkz.showroom.dto.ApplienceDto;
import com.xworkz.showroom.girias.Girias;
import com.xworkz.showroom.girias.impl.GiriasImpl;

import java.util.Scanner;

public class ShowRommTester {
    public static void main(String[] args) {
        int id = 1;

        Scanner sc = new Scanner(System.in);
        Girias gi = new GiriasImpl();
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            ApplienceDto dto = new ApplienceDto();
            dto.setCompany(Company.valueOf(sc.next()));
            dto.setName(sc.next());
            dto.setDurabality(sc.nextBoolean());
            dto.setLocation(sc.next());
            dto.setModelNo(sc.next());
            dto.setPrice(sc.nextDouble());
            dto.setNoOfAppliences(sc.nextInt());
            gi.addSAppliences(dto);



        }
    }
}
