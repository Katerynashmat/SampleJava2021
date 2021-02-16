package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

public class ChildDisplay extends Display {

    public String showAnotherMessage(OldInterface oldInterface){
        return "ChildDisplay: " + oldInterface.getName();
    }

}
