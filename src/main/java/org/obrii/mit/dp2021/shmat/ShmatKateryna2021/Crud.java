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
public class Crud implements DataCrudInterface {
    
    private List<Data> dataList = Saver.getSaver();

    public Crud() {
    }
   
    @Override
    public void createData (Data data){
    data.setNumber(dataList.size());
    dataList.add(data);
    }
    
    @Override
    public List<Data> readData(){
    return dataList;
    }
    
    @Override
    public void updateData(int number, Data data){
    data.setNumber(number);
    dataList.set(number, data);
    }
    
    @Override
    public void deleteData(int number){
        dataList.remove(number);
    }
    
}
