/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber3.ctrl;

import com.hiber3.model.bukuModel;
import com.hiber3.face.bukuService;
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
@Service("bukuService")
@Transactional
public class bukuImplService implements bukuService {

    protected static Logger log = Logger.getLogger("bukuImplService");

    
    @Autowired
    private SessionFactory sessionFactory;
            
   
    @Override
    public void save(bukuModel buku) {
        log.debug("Insert record to table t_buku");
        sessionFactory.getCurrentSession().save(buku);
    }

   
    @Override
    public List<bukuModel> getAll() {
        log.debug("Retrieving all buku");
        return sessionFactory.getCurrentSession().createQuery("from bukuModel b").list();
    }
    
    
}
