class Kopi{
    String namaPembeli, namaKopi, ukuran;
    double harga;

    void info(){
        System.out.println("Nama Kopi : "+namaKopi);
        System.out.println("Ukuran : "+ukuran);
        System.out.println("Harga : Rp."+harga);
    }

    void setPembeli(String namaInput){
        namaPembeli = namaInput;
    }
    String getPembeli(){
        return namaPembeli;
    }

    double getPajak(){
        return harga*11/100;
    }
} 

public class Soal2Main {
    public static void main(String[] args) {
        Kopi kopi1 = new Kopi(); 
        kopi1.namaKopi = "Espresso"; 
        kopi1.ukuran = "Medium"; 
        kopi1.harga = 25000; 
 
        kopi1.info(); 
        kopi1.setPembeli("Alice"); 
        System.out.println("Pembeli Kopi: " + kopi1.getPembeli()); 
        System.out.println("Pajak Kopi: Rp. " + kopi1.getPajak()); 
    }
}
