/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Files implements DataCrudInterface {

    private File file;
    
    public Files(){
    
    }
    
    public Files(File file){
    this.file=file;
    }
    
    
    public void writeData(List<Data> data){
        try(FileOutputStream f = new FileOutputStream(file); ObjectOutputStream o = new ObjectOutputStream(f)){
        data.forEach( d ->{
            try{
                o.writeObject(d);
            } catch (IOException ex){
                Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        } catch (FileNotFoundException ex){
           Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
                Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
            }
    }    

    
    @Override
    public List<Data> readData() {
        try(FileInputStream f = new FileInputStream(file); ObjectInputStream o = new ObjectInputStream(f)){  
            List<Data> result = new ArrayList<>();
            while (f.available()>0){
                result.add((Data) o.readObject());
            }
            return result;
        } catch (FileNotFoundException ex){
           Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
           return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex){
                Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
                return new ArrayList<>();
            }
    }
    
    @Override
    public void createData(Data data) {
        List<Data> dataList = this.readData();
        data.setNumber(dataList.size());
        dataList.add(data);
        this.writeData(dataList);
       
    }

    @Override
    public void deleteData(int number) {
        List<Data> newData = new ArrayList<>();
        int i = 0;
        for (Data d: this.readData()){
            if (d.getNumber() !=number){
                d.setNumber(i);
                newData.add(d);
                i++;
            }              
        }
        this.writeData(newData);
    }

    @Override
    public void updateData(int number, Data data) {
        List<Data> newData = new ArrayList<>();
        data.setNumber(number);
        for (Data d: this.readData()){
            if (d.getNumber() !=number){
                newData.add(d);
            } else{newData.add(data);}
    }
        this.writeData(newData);
        
    }
    
    public File getFile(){
        return file;
    }
    
    public void setFileName(File file){
        this.file = file;
    }

    @Override
    public Object searchData(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                  
    }
    

