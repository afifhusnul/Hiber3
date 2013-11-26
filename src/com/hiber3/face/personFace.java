/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber3.face;

import com.hiber3.model.personModel;
import java.util.List;

/**
 *
 * @author NUSNAFIF
 */
public interface personFace {
    
    public void Add(personModel person);
    public void Delete(personModel person);
    List<personModel> getAll();
    
}
