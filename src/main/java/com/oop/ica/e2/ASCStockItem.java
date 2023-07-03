/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.ica.e2;

/**
 *
 * @author laves
 */
public class ASCStockItem {
    private String Code;
    
    private String Title;
    
    private String Description;
    
    private double price ;
    
    private int quantity;

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ASCStockItem(String Code, String Title, String Description, double price, int quantity) {
        this.Code = Code;
        this.Title = Title;
        this.Description = Description;
        this.price = price;
        this.quantity = quantity;
    }
    
    
}
