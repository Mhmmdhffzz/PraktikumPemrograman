/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPemrograman;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Prak101_2110817310018_MuhammadHafiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input =new Scanner (System.in);
       String Nama , Lahir;
       String bulanl=null;
       int Tanggal, Bulan, Tahun, Tinggi;
       double Berat;
       
       System.out.print("Masukkan Nama Lengkap: ");
       Nama = input.nextLine();
       
       System.out.print("Masukkan Tempat Lahir: ");
       Lahir = input.nextLine();
       
       System.out.print("Masukkan Tanggal Lahir: ");
       Tanggal =input.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        Bulan = input.nextInt();
        
switch (Bulan) {
case 1 -> bulanl= "januari";
case 2 ->bulanl = "Februari";
case 3 ->bulanl= "Maret";
case 4 ->bulanl = "April";
case 5 ->bulanl = "Mei";
case 6 ->bulanl = "Juni";
case 7 ->bulanl = "July";
case 8 ->bulanl= "Agustus";
case 9 ->bulanl = "September";
case 10 ->bulanl = "Oktober";
case 11 ->bulanl= "November";
case 12 ->bulanl= "Desember";
}
        
        System.out.print("Masukkan Tahun Lahir: ");
        Tahun =input.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        Tinggi =input.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        Berat =input.nextDouble();
       
        System.out.println("===========");
        System.out.println("Data Telah Ditambahkan,");
        System.out.println("Nama Lengkap "+Nama+", Lahir di "+Lahir+" pada Tanggal "+Tanggal+" "+bulanl+" "+Tahun);
        System.out.println("Tinggi Badan "+Tinggi+" cm dan Berat Badan "+Berat+" kilogram");
        
        
    }
    
}
