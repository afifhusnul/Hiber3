/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber3;

import com.hiber3.model.bukuModel;
import com.hiber3.face.bukuService;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
        
    
/**
 *
 * @author NUSNAFIF
 */
public class Main {
      
    /**
     * @param args the command line arguments
     */
    private static bukuService bukuService;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        ApplicationContext appContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        bukuService = (bukuService) appContext.getBean("bukuService");
//        
////        bukuModel bk= new bukuModel();
////        b.setJudulBuku("Opo Wae");
////        b.setHrgBuku(150000);
////        bukuService.save(b);
//        
//        List<bukuModel> buku=bukuService.getAll();
//        for (bukuModel p: buku) {
//                System.out.println(p.getId()+ ' '+ p.getJudulBuku()+ ' '+ p.getHrgBuku());
//        }
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //Schedule a job for the event-dispatching thread:
        //adding TrayIcon.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                  new AppFrame().setVisible(true);
            }
        });
    }

}
