/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.fit.mit.KaterynaShmat.Repository;

/**
 *
 * @author Asus
 */
import org.obrii.fit.mit.KaterynaShmat.Domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User , Long>{

   
    
}
