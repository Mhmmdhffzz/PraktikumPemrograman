/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak202_2110817310018_muhammadhafiz;

/**
 *
 * @author User
 */
public class PRAK202_2110817310018_MuhammadHafiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mobil1 = new Mobil();
        mobil1.merek = "Toyota Raize";
        mobil1.tahun_keluaran = "2021";
        mobil1.kapasitas = 988;
        mobil1.harga = 202700000;
        
        mobil1.info();
        mobil1.setPemilik("Kasel");
        System.out.println("Pemilik Mobil: " + mobil1.getPemilik());
         System.out.println("Pajak Mobil: Rp. " + mobil1.getPajak() );
 
    }
    
}
