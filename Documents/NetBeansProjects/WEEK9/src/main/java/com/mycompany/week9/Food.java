/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week9;

/**
 *
 * @author Dit
 */
public class Food extends PassengerGoods {
    private double weight;
    public  Food(String name, int quantity, double price, double weight){
        super(name, quantity, price);
        this.weight = weight;
    }
    @Override
    protected double calculatePrice(){
        return quantity * getPrice() * weight;
    }
    @Override
    public void displayDetail(){
        System.out.println("- Makanan " + getName() + " berat " + (int)weight + "-gram berjumlah " + quantity + ", total harga Rp "+ calculatePrice());
    }
    
}
