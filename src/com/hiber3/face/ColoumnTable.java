/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hiber3.face;

import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Component;

/**
 *
 * @author NUSNAFIF
 */
public class ColoumnTable {

   public ColoumnTable (JTable table) {
       aturColoumn(table);
   }

    public void aturColoumn(JTable t){
    	//cara untuk menyesuaikan kolom dari tabel adalah mengambil
    	// lebar kolom yang ada kemudian sesuaikan
    	TableColumnModel modelKolom=t.getColumnModel();

    	for(int kol=0; kol < modelKolom.getColumnCount(); kol++){
    		int lebarKolomMax=0;
    		for(int baris=0;baris<t.getRowCount();baris++){
    			TableCellRenderer rend=t.getCellRenderer(baris,kol);
    			Object nilaiTablel=t.getValueAt(baris,kol);
    			Component comp=rend.getTableCellRendererComponent(t,nilaiTablel,false,false,baris,kol);
				lebarKolomMax=Math.max(comp.getPreferredSize().width,lebarKolomMax);
    		}//akhir for baris
    		TableColumn kolom=modelKolom.getColumn(kol);
    		kolom.setPreferredWidth(lebarKolomMax);
    	}//akhir for kolom
    }
}
