/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.fit.mit.KaterynaShmat.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Asus
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {
    
    
    private Self self;

    public Links() {
    }
    
    

    @Override
    public String toString() {
        return "Links{" + "self=" + self + '}';
    }

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }
    
    
    
}
