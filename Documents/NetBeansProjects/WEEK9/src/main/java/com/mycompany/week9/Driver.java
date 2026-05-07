/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week9;

/**
 *
 * @author Dit
 */
public class Driver {

    public static void main(String[] args) {
//        Electronic q = new Electronic("Smartphone", 2, 18000000.0, "Iphone 14");
//        Food w = new Food("Lamington", 4, 75.0, 350.0);
//        Cigaratte e = new Cigaratte("Dunhill Blue", 30, 60000.0, 20);
//        
//        q.displayDetail();
//        w.displayDetail();
//        e.displayDetail();
        Driver s = new Driver();
        s.runThis();
    }
    void runThis(){
        Electronic q = new Electronic("Smartphone", 2, 18000000.0, "Iphone 14");
        Food w = new Food("Lamington", 4, 75.0, 350.0);
        Cigaratte e = new Cigaratte("Dunhill Blue", 30, 60000.0, 20);
        
        q.displayDetail();
        w.displayDetail();
        e.displayDetail();
    }
}
