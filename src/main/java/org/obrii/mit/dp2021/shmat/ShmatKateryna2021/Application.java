package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

import java.lang.constant.DynamicCallSiteDesc;

public class Application {

    public static void PrintMessage(OldDisplayInterface display, OldInterface user){
        if(display instanceof ChildDisplay){
            System.out.println(((ChildDisplay)display).showAnotherMessage(user));
        }else{
            System.out.println(display.showMessage(user));
        }
    }

    public static void main(String[] args) {
        OldInterface user = new User("Katya", "");
        OldDisplayInterface display = new ChildDisplay();
        PrintMessage(display, user);
        display = new Display();
        PrintMessage(display, user);
    }
}
