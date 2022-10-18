/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak201_2110817310018_muhammadhafiz;

/**
 *
 * @author User
 */
public class Buah {
    String NamaBuah;
    float BeratBuah;
    int JumlahBuah;
    float TotalBerat;
    int TotalHarga;
    int Harga;
 
    
    public Buah (String NB, float BB, int JB, float TB, int TH, int H){
        NamaBuah = NB;
        BeratBuah = BB;
        TotalBerat = TB;
        JumlahBuah = JB;
        TotalHarga = TH;
        Harga =H;
        
    }
    
    public void DisplayBuah () {
        System.out.println("Nama Mangga : " +NamaBuah);
        System.out.println("Berat : " +BeratBuah+ " kg");
        System.out.println("Jumlah Beli : " +JumlahBuah);
        System.out.println("Total Berat : " +BeratBuah*JumlahBuah+ " kg");
        System.out.println("Total Harga : RP. " +JumlahBuah*Harga);
    } 
}
