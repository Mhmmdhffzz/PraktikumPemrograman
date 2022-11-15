
package praktikum4soal1;

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

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
   
}
