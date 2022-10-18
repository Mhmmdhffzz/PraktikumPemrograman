/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak202_2110817310018_muhammadhafiz;

/**
 *
 * @author User
 */
public class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    private String pemilik;
    long pajak;

    /**
     * @return the pemilik
     */
    public String getPemilik() {
        return pemilik;
    }

    /**
     * @param pemilik the pemilik to set
     */
    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
     /**
     * @return the pajak
     */
    public long getPajak() {
        return pajak;
    }

    public void setPajak(int pajakMobil) {
        this.pajak = pajakMobil;
    }
    
    
    public void info () {
         System.out.println("Merek Mobil : " +merek);
        System.out.println("Harga: RP. " +harga);
        System.out.println("Tahun keluaran: " +tahun_keluaran);
        System.out.println("Kapasitas: " +kapasitas+ "cc");
        pajak =(long)(harga*0.02);
    }
}

