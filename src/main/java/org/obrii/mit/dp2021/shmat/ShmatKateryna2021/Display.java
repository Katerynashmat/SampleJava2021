package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

public class Display implements OldDisplayInterface{

    @Override
    public String showMessage(OldInterface oldInterface) {
        return oldInterface.getName();
    }

}
