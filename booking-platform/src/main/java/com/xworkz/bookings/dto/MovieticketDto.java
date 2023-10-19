package com.xworkz.booking.dto;

import com.xworkz.booking.constants.Languages;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name="movie_tickets")
public class MovieticketDto {
    @Column
    private int id;
    private String moviename;
    private Languages language;
    private String location;
    private double price;
    private int noOfTickets;
    private String theatre;
    private String timings;
}
