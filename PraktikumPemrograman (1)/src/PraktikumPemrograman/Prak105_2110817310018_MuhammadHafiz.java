/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPemrograman;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author User
 */
public class Prak105_2110817310018_MuhammadHafiz {
    public static void main(String[] args) {
        double jari, tinggi, hitungan;
        double phi = 3.14;        
        
        Scanner angka=new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("#.###");
        
        System.out.print("Masukkan Jari-Jari : ");
        jari = angka.nextDouble();
        
        System.out.print("Masukkan Tinggi : ");
        tinggi = angka.nextDouble();
        
        hitungan = phi* jari * jari * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari "+jari+"cm dan ");
        System.out.println("tinggi "+tinggi+"cm adalah"+df.format(hitungan) +" m3");
        
    }
    
}
