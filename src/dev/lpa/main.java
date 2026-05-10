package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name ,String type ,int count){
    public GroceryItem(String name){
        this(name,"Dairy",1);
    }
}

public class main {
    public static void main(String[] args){
        GroceryItem [] GroceryArray = new GroceryItem[3];
        GroceryArray[0] = new GroceryItem("milk");
        GroceryArray[1]=new GroceryItem("apple","fruit",6);
        GroceryArray[2]=new GroceryItem("Oranges","friut",5);
        System.out.println(Arrays.toString(GroceryArray));

        ArrayList objectlist = new ArrayList();
        objectlist.add(new GroceryItem("Butter"));
        objectlist.add("curd");
    }
}
