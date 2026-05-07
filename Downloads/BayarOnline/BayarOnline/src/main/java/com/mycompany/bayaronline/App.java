/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bayaronline;

/**
 *
 * @author dit
 */
public class App {
    public static void main(String[] args) throws Exception{
        Qris qris = new Qris(15000);
        Tunai tunai = new Tunai(50000);
        
        qris.tampilkanJumlahTransaksi();
        qris.verifikasiPembayaran();
        tunai.tampilkanJumlahTransaksi();
        tunai.verifikasiPembayaran();
    }
}
