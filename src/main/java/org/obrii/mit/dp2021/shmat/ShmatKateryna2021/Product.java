package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

public class Product implements ProductInterface{
    public String name = null;
    public String color = null;
    public String delivery = null;

    public Product(String name, String color, String delivery){
        this.name = name;
        this.color = color;
        this.delivery = delivery;
    }

    public String getName(){
        return this.name;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getDelivery(){
        return this.delivery;
    }
}
