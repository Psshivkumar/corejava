package com.xworkz.market;

import com.xworkz.market.mart.Demart;
import com.xworkz.market.supermarket.SuperMarket;

import java.util.Scanner;

public class DemartExecutor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        SuperMarket market = new SuperMarket(size);
        for (int i = -0; i < size; i++) {
            Demart mart = new Demart();
//            mart.setId(sc.nextInt());
            mart.setName(sc.next());
            mart.setPrice(sc.nextDouble());
            mart.setType(sc.next());
            mart.setCompanyName(sc.next());
            mart.setExpireDate(sc.next());
            mart.setManufacturedDate(sc.next());
            market.addItems(mart);


        }
        String input=null;
        do{
            System.out.println("press 1: to get all items");
            System.out.println("press 2: to get item name by id");
            System.out.println("press 3: to get all items info by id");
            System.out.println("press 4: to get modified date by name");
            System.out.println("press 5: to get price by name");
            System.out.println("press 6: to get type of item by name");
            System.out.println("press 7: to update the price");



            int options=sc.nextInt();
            switch (options){
                case 1:
                    System.out.println("get all the items");
                    market.getAllItems();
                    break;
                case 2:
                    System.out.println("enter the id to get item name");
                     market.getItemNameById(sc.nextInt());
                     break;
                case 3:
                    System.out.println("enter id to item info");
                    market.getItemInfoById(sc.nextInt());
                    break;
                case 4:
                    System.out.println("enter the name of item to get modified name");
                   String date= market.getModifiedDateByName(sc.next());
                    System.out.println(date);
                    break;
                case 5:
                    System.out.println("enter the name of item to get its price");
                   double price= market.getPriceByname(sc.next());
                    System.out.println(price);
                    break;
                case 6:
                    System.out.println("enter the name to get type of item");
                   String type= market.getTypeByName(sc.next());
                    System.out.println(type);
                    break;
                case 7:
                    System.out.println("give new price to update wrt to id");
                    market.updatePriceById(sc.nextDouble(),sc.nextInt());
                    break;
                case 8:
                    System.out.println("delete the item by id");
                    market.deleteItemById(sc.nextInt());
                    break;
                default:
                    System.out.println("options are invalid");
                    break;
            }
            System.out.println("do you want to continue yes/no");
            input=sc.next();
        }while (input.equals("yes"));
        System.out.println("thans for visiting");
    }
}
