package com.xworkz.showroom.dto;

import com.xworkz.showroom.constants.Company;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity //make enable dto mapped with db
@Table(name = "girias")
@NoArgsConstructor
public class ApplienceDto {

    @Id
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "company_name")
    @Enumerated(EnumType.STRING)
    private Company company;
    @Column(name = "location")
    private String location;
    @Column(name = "price")
    private double price;
    @Column(name = "no_of_appliences")
    private int noOfAppliences;
    @Column(name = "durabality")
    private boolean durabality;
    @Column(name = "model_no")
    private String modelNo;


}
