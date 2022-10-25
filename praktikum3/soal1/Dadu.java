package praktikum3.soal1;


public class Dadu {
     private int nilaiDadu;


    public void AcakDadu() {
        nilaiDadu = (int)(Math.random()*6+1);
        
    }

    public int getNilaiDadu() {
        return nilaiDadu;
    }
    
}