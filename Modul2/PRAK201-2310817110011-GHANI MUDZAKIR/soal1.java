class Buah{
    String namaBuah;  
    double berat, harga, jumlahBeli;
    double hargaBuahSekilo, banyakDiskon;

    int cekHarga(){
        double hargasementara = (jumlahBeli/berat)*harga;
        int hargaSebelumDiskon = (int) hargasementara;
        return hargaSebelumDiskon;
    }

    int berapaKaliDiskon(){
        return (int) jumlahBeli/4;
    }
    
    double cekDiskon(){
        double banyakDiskonAkhir = berapaKaliDiskon() * 2;
        double hargaDiskon = cekHarga()*banyakDiskonAkhir/100;
        return hargaDiskon;
    }

    double hitungDiskon(){
        double hargaSesudahDiskon = cekHarga() - cekDiskon();
        return hargaSesudahDiskon;
    }

    void infoBuah(){
        System.out.println("Nama Buah : " + namaBuah);
        System.out.println("Berat : "+berat);
        System.out.println("Harga : "+ harga);
        System.out.println("Jumlah Beli : "+ jumlahBeli+" Kg");
        System.out.println("Harga sebelum diskon Rp."+cekHarga()+".00");
        System.out.println("Banyak Diskon : Rp."+cekDiskon());
        System.out.println("Harga Sesudah Diskon : Rp."+hitungDiskon()+"\n");

    }
}

public class soal1 {
    public static void main(String[] args) {
        // kita buah object untuk 3 buah kelas tersebut
        Buah buah1 = new Buah();
        Buah buah2 = new Buah();
        Buah buah3 = new Buah();

        // kita masukan nilai untuk masing masing attribute
        buah1.namaBuah = "Apel";
        buah1.berat = 0.4;
        buah1.harga = 7000;
        buah1.jumlahBeli = 40;

        buah2.namaBuah = "Mangga";
        buah2.berat = 0.2;
        buah2.harga = 3500;
        buah2.jumlahBeli = 15;

        buah3.namaBuah = "Alpukat";
        buah3.berat = 0.25;
        buah3.harga = 10000;
        buah3.jumlahBeli = 12;

        buah1.infoBuah();
        buah2.infoBuah();
        buah3.infoBuah();


    }    

}
