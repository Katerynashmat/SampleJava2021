/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Saver {
    
    private static Saver saverInstanse = new Saver();
    private static List<Data> dataSaver;
    
    private Saver(){
        dataSaver = new ArrayList<>();
        dataSaver.add(new Data(1, "Kateryna", "Shmat", 19, "katushkashmat@gmail.com"));
    }
    
    public static Saver getInstanse(){
    return saverInstanse;
    }
    
    public static List<Data> getSaver(){
    return dataSaver;
    }
    
}
