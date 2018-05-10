package com.vrusu;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "V RUSu";
        String message;

        String[] items = new String[5];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";

        message = custName + " want to purchase " + items.length + " items.";
        System.out.println(message);

        System.out.println("items pourchased:");
        for(String item : items){
            System.out.println(item + ", ");
        }

    }
}
