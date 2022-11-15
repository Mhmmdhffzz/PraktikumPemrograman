
package praktikum4.soal2;


public class komik extends Buku {
     private int volume;
    private String sinopsis;
    
    public komik(String j, String p, String t, Integer v, String s){
        super.judul=j;
        super.penulis=p;
        super.tahun= Integer.valueOf(t);
        this.volume=v;
        this.sinopsis=s;  
    }
    
    public String getkomikDetail(){
        return "\nData yang baru diinputkan adalah \nSebuah komik dengan judul \""+ judul +
                "\". Komik tersebut dibuat oleh "+ penulis+" \ndan diterbitkan pada tahun "+ tahun +
                ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak "+ getVolume() +" buah. \nSinopsis : "+getSinopsis();
        
    }


    public int getVolume() {
        return volume;
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }


    public String getSinopsis() {
        return sinopsis;
    }


    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    
}
