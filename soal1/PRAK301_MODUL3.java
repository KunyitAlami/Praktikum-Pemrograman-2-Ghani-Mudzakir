package soal1;

import java.util.*;

class Dadu{
    private LinkedList<Integer> tempatNilaiAcak = new LinkedList<>();
    private Random acakNilaiDadu = new Random();

    private int jumlahPerulangan;
    private final int [] nilaiDadu = {1,2,3,4,5,6};

    public void setNilaiPerulangan(int input){
        this.jumlahPerulangan = input;
    }

    private int acakNilai(){
        int nilaiDaduIndeks = acakNilaiDadu.nextInt(nilaiDadu.length);
        return nilaiDadu[nilaiDaduIndeks];
    }

    private void masukLinkedList(){
        for(int i=0; i<jumlahPerulangan;i++){
            tempatNilaiAcak.add(acakNilai());
        }
    }

    private int nilaiAkhir(){
        int total = 0;
        for(int i =0; i<tempatNilaiAcak.size();i++){
            total = total + tempatNilaiAcak.get(i);
        }
        return total;
    }

    private void mulaiProgram(){
        masukLinkedList();
    }

    public void display(){
        mulaiProgram();
        for(int i=0; i<tempatNilaiAcak.size();i++){
            System.out.println("Dadu ke-"+(i+1)+" dengan nilai "+tempatNilaiAcak.get(i));
        }
        System.out.println("Total nilai akhir adalah "+nilaiAkhir());
    }
}

public class PRAK301_MODUL3 {
    public static void main(String[] args) {
        int nilaiInput;
        Scanner inputer = new Scanner(System.in);
        nilaiInput = inputer.nextInt();
        inputer.close();

        Dadu objekAcakDadu = new Dadu();
        objekAcakDadu.setNilaiPerulangan(nilaiInput);
        objekAcakDadu.display();
    }
}
