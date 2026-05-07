/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week9;

/**
 *
 * @author Dit
 */
public class Cigaratte extends PassengerGoods implements Taxable {
    private int piecesPerPack;
    
    public Cigaratte(String name, int quantity, double price, int piecesPerPack){
        super(name, quantity, price);
        this.piecesPerPack = piecesPerPack;
    }
    
    @Override 
    public double calculatePrice(){
        if(piecesPerPack < 12){
            return quantity * getPrice();
        }else if(piecesPerPack <= 24){
            return quantity * getPrice() * 1.5;
        }else{
            return quantity * getPrice() * (piecesPerPack /10);
        }
    }
    @Override
    public double calculateTax(){
        return calculatePrice() * TAX_RATE;
    }
    @Override
    public void displayDetail(){
        System.out.println("- Rokok " + getName() + " Berjumlah " + quantity 
                + " bungkus " + piecesPerPack+ " batang, " + "harga Rp " + getPrice() + " dan pajak Rp " + calculateTax());
    }
}
