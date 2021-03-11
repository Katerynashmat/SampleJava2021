/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

import java.util.List;

/**
 *
 * @author HP
 */
public interface DataCrudInterface {

    void createData(Data data);
    
    List<Data> readData();

    void deleteData(int number);

    void updateData(int number, Data data);
    
    void writeData(List<Data> data);

    public List<Data> filterData(String s);
    
}
