package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

public class Product implements ProductInterface{
    public String type = null;

    public Product(String type){
        this.type = type;
    }

    public String getName(){
        return this.type;
    }
}
