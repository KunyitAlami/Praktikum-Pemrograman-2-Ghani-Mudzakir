package soal1;

import java.util.Scanner;

class HewanPeliharaan{
    private String nama;
    private String ras;

    public HewanPeliharaan(String r, String n){
        this.nama = n;
        this.ras = r;
    }

    public void display(){
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama Hewan Peliharaan : "+nama);
        System.out.println("Dengan ras : "+ras);
    }

}

public class soal1_Modul4 {
    public static void main(String[] args) {
        String namaInput, rasInput;
        Scanner inputer = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan : ");
        namaInput = inputer.nextLine();
        System.out.print("Ras : ");
        rasInput = inputer.nextLine();

        HewanPeliharaan hewan1 = new HewanPeliharaan(rasInput, namaInput);
        hewan1.display();

        inputer.close();
        
    }
}
