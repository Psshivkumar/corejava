package com.xworkz.market.supermarket;

import com.xworkz.market.mart.Demart;

import java.util.Arrays;

public class SuperMarket {
    Demart[] demart;
    int id = 1;
    int index;

    public SuperMarket(int size) {
        demart = new Demart[size];

    }

    public boolean addItems(Demart item) {
        System.out.println("invoke add items");
        boolean isAdded = false;
        if (item != null) {
            item.setId(id++);
            demart[index++] = item;
            isAdded = true;

            System.out.println("item added successfully");
        }
        return isAdded;
    }

    public void getAllItems() {
        for (int index = 0; index < demart.length; index++) {
            System.out.println(demart[index].toString());
        }
    }

    public void getItemNameById(int id) {
        System.out.println("invoke get item name by id");
        for (int index = 0; index < demart.length; index++) {
            if (demart[index].getId() == id) {
                System.out.println(demart[index].getName());
            }
        }
    }

    public Demart getItemInfoById(int id) {
        System.out.println("invoke get item info by id");
        Demart mart = null;
        for (int index = 0; index < demart.length; index++) {
            if (demart[index].getId() == id) {
                mart = demart[index];
                System.out.println(mart.toString());
            }
        }
        return mart;
    }

    public String getModifiedDateByName(String name) {
        System.out.println("invoke get modified name by name");
        String modifiedDate = null;
        for (int index = 0; index < demart.length; index++) {
            if (demart[index].getName().equals(name)) {
                modifiedDate = demart[index].getManufacturedDate();
            }
        }
        return modifiedDate;
    }

    public double getPriceByname(String name) {
        System.out.println("invoke get price by name");
        double price = 0.0;
        for (int index = 0; index < demart.length; index++) {
            if (demart[index].getName().equals(name)) {
                price = demart[index].getPrice();

            }
        }
        return price;
    }

    public String getTypeByName(String name) {
        System.out.println("invoking get type by name");
        String type = null;
        for (int index = 0; index < demart.length; index++) {
            if (demart[index].getName().equals(name)) {
                type = demart[index].getType();
            }
        }
        return type;
    }

    public boolean updatePriceById(double newPrice, int id) {
        System.out.println("updating price by its id");
        boolean isPriceUpdated = false;
        for (int index = 0; index < demart.length; index++) {
            if (demart[index].getId() == id) {
                demart[index].setPrice(newPrice);
                isPriceUpdated = true;
            }

        }
        return isPriceUpdated;
    }

    public void deleteItemById(int id) {
        System.out.println("invoke delete item by id");
        int index;
        int newIndex;
        for (index = 0, newIndex = 0; index < demart.length; index++) {

            if (demart[index].getId() != id) {
                demart[newIndex++] = demart[index];
            }

        }
        demart = Arrays.copyOf(demart, newIndex);
        getNewItems(demart);
    }

    public void getNewItems(Demart[] demart) {
        for (int i = 0; i < demart.length; i++) {
            System.out.println(demart[i].toString());

        }
    }


}
