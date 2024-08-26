/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyek_1;

/**
 *
 * @author Raymond
 */
public class Proyek_1 {
    // Atribut
    private String nama;
    private int npm;
    private String no_hp;
    private String alamat;

    // Pembuatan objek
    public Proyek_1(String nama, int npm, String no_hp, String alamat) {
        this.nama = nama;
        this.npm = npm;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }

    // Menampilkan objek data
    public void display() {
        System.out.println("Nama : " + nama);
        System.out.println("Npm : " + npm);
        System.out.println("No Hp : " + no_hp);
        System.out.println("Alamat : " + alamat);
    }

    // Main method 
    public static void main(String[] args) {

        Proyek_1 student = new Proyek_1("Adetia", 12345, "0123123", "Secang");

        student.display();
    }
}

