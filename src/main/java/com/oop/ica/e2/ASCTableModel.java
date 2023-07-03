/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.ica.e2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author laves
 */
public class ASCTableModel {
    
     public static ArrayList<ASCStockItem> fetch2(){
         ArrayList <ASCStockItem> products=new ArrayList<>();
    String path=".\\ASCStock.csv";
    String line="";
    try {
        BufferedReader br=new BufferedReader(new FileReader(path));
        while((line=br.readLine())!=null){
            String[] value=line.split(",");
            ASCStockItem a=new ASCStockItem(value[0],value[1],value[2],Double.parseDouble(value[3]),Integer.parseInt(value[4]));
            products.add(a);
        }
         return products;
    }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
    }
}
}
