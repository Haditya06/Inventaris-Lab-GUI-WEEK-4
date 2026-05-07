/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week9;

/**
 *
 * @author Dit
 */
public class Electronic extends PassengerGoods implements Taxable {
    private String type;
    
    public Electronic(String name, int quantity, double price, String type){
        super(name, quantity, price);
        this.type = type;
    }
    @Override
    protected double calculatePrice(){
        return quantity * getPrice();
    }
    @Override
    public double calculateTax(){
        return (calculatePrice() - 7500000) * TAX_RATE;
    }
    @Override
    public void displayDetail(){
        System.out.println("- Nama Barang "+ getName() + " dengan tipe " + type + " berjumlah " 
                + quantity + " dengan total harga Rp " + (long)calculatePrice() + " dengan total pajak Rp" + calculateTax() );
        
    }
}
