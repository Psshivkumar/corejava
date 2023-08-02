package com.boot.xworkz;

import com.boot.Batsman;
import com.boot.Bowler;
import com.boot.Catcher;
import com.boot.Computer;
import com.boot.Cricket;
import com.boot.Defender;
import com.boot.District;
import com.boot.Fan;
import com.boot.Home;
import com.boot.Kabaddi;
import com.boot.Laptop;
import com.boot.Machine;
import com.boot.Phone;
import com.boot.Rider;

public class MainRunner {

	public static void main(String[] args) {

		Machine machine=new Fan();
		Fan fan=new Fan();
		double cost=machine.cost;
		fan.rotate();
		fan.machine();
		String comp=fan.company;
		
		Computer c=new Computer();
		Laptop l1=new Laptop();
		Phone p=new Phone();
		
		p.ring();
		p.charge();
		p.shutDown();
		
		Bowler b=new Bowler();
		Batsman b1=new Batsman();
		Cricket c1=new Cricket();
		b.play();
		b.yorkerKing();
		b.hit();
		Kabaddi k=new Kabaddi();
		Catcher c2= new Catcher();
		Rider r1=new Rider();
		Defender d=new Defender();
		d.catching();
		d.ride();
		d.riding();
		d.defend();
		d.catching();
		
		Home h=new Home();
		h.gramPanchayath();
		h.oldHome();
		h.famousFor();
		h.has();
		h.near();
		
		Chapati c3=new Chapati();
		c3.color();
		c3.nubers();
		c3.starter();
		c3.variety();
		c3.size();
		c3.types();
		c3.typesOfFood();
		c3.duration();
		
		
		
		
	}

}
