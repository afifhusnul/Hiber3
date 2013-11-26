/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber3.ctrl;

import com.hiber3.face.personFace;
import com.hiber3.model.personModel;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author NUSNAFIF
 */
@Service("personFace")
@Transactional
public class personCtrl implements personFace {
    
    protected static Logger log = Logger.getLogger("bukuImplService");

    
    @Autowired
    private SessionFactory sessionFactory;
    

    @Override
    public void Add(personModel person) {
        log.debug("Insert record to table t_person");
        sessionFactory.getCurrentSession().save(person);
    }
    
    @Override
    public void Delete(personModel person) {
        log.debug("Delete record to table t_person");
        sessionFactory.getCurrentSession().delete(person);
    }
    

    @Override
    public List<personModel> getAll() {
        log.debug("Retrieving all person");
        return sessionFactory.getCurrentSession().createQuery("from personModel p").list();
    }
            
    
}
