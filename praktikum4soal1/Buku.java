/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4soal1;

/**
 *
 * @author User
 */
public class Buku {
    private String judul;
   private String penulis;
   private int tahun;
   
   public Buku(String j, String p, int t){
       judul = j;
       penulis = p;
       tahun = t;
   }
    
   public void displayBuku () {
       System.out.println(" ");
       System.out.println("Detail Buku: ");
       System.out.println("Judul adalah " +getJudul());
       System.out.println("Penulis adalah "+getPenulis());
       System.out.println("Tahun Terbit adalah "+getTahun());
   }

    /**
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the penulis
     */
    public String getPenulis() {
        return penulis;
    }

    /**
     * @param penulis the penulis to set
     */
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    /**
     * @return the tahun
     */
    public int getTahun() {
        return tahun;
    }

    /**
     * @param tahun the tahun to set
     */
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
   
}
