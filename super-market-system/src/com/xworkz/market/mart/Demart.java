package com.xworkz.market.mart;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Demart {
    private int id;
    private String name;
    private String type;
    private String manufacturedDate;
    private String expireDate;
    private double price;
    private String companyName;
}
