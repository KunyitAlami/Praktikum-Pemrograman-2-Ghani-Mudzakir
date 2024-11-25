package soal2;

import java.util.*;

class negara{
    private String Nama, jenisKepemimpinan, namaPemimpin;
    private int tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan;
    private HashMap<Integer, String> namaMapBulan = new HashMap<>();

    public negara(String a, String b, String c, int d, int e, int f){
        this.Nama = a;
        this.jenisKepemimpinan = b;
        this.namaPemimpin = c;
        this.tanggalKemerdekaan = d;
        this.bulanKemerdekaan = e;
        this.tahunKemerdekaan = f;

        namaMapBulan.put(1, "Januari");
        namaMapBulan.put(2, "Februari");
        namaMapBulan.put(3, "Maret");
        namaMapBulan.put(4, "April");
        namaMapBulan.put(5, "Mei");
        namaMapBulan.put(6, "Juni");
        namaMapBulan.put(7, "Juli");
        namaMapBulan.put(8, "Agustus");
        namaMapBulan.put(9, "September");
        namaMapBulan.put(10, "Oktober");
        namaMapBulan.put(11, "November");
        namaMapBulan.put(12, "Desember");
    }

    String ambilBulan(int key){
        return namaMapBulan.get(key);
    }

    public void tampilkanInfo(){
        if (jenisKepemimpinan.toLowerCase().equals("monarki")) {
            System.out.println("\nNegara "+Nama+" mempunyai Presiden bernama "+namaPemimpin+"\r\n");            
        }else{
            System.out.println("\nNegara "+Nama+" mempunyai Presiden bernama "+namaPemimpin+"\r\n" +"Deklarasi Kemerdekaan pada Tanggal "+ tanggalKemerdekaan+" "+ambilBulan(bulanKemerdekaan) +" "+ tahunKemerdekaan +".\r\n");
        }
    }
}

public class PRAK302_MODUL3 {
    public static void main(String[] args) {
        int jumlahPerulangan;
        LinkedList<negara>tempatNegara = new LinkedList<>();

        String namaInput, jenisKepemimpinanInput, namaPemimpinInput;
        int tanggal =0, bulan=0, tahun=0;
        
        Scanner inputer = new Scanner(System.in);
        jumlahPerulangan = inputer.nextInt();
        inputer.nextLine();

        for(int i = 0; i<jumlahPerulangan;i++){
            namaInput = inputer.nextLine();
            jenisKepemimpinanInput = inputer.nextLine();
            namaPemimpinInput = inputer.nextLine();
            if(jenisKepemimpinanInput.toLowerCase().equals("monarki")){
                tanggal =0;
                bulan=0;
                tahun=0;
            }else{
                tanggal = inputer.nextInt();
                inputer.nextLine();
                bulan = inputer.nextInt();
                inputer.nextLine();
                tahun = inputer.nextInt();
                inputer.nextLine();
            }
            negara inputNegara = new negara(namaInput, jenisKepemimpinanInput, namaPemimpinInput, tanggal, bulan, tahun);
            tempatNegara.add(inputNegara);
        }
        for (negara negara : tempatNegara) {
            negara.tampilkanInfo();
        }

        inputer.close();
    }
}
