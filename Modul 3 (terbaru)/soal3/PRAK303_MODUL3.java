package soal3;

import java.util.ArrayList;
import java.util.Scanner;


class Mahasiswa{
    String nama, nim;

    public Mahasiswa(String namaInput, String nimInput){
        this.nama = namaInput;
        this.nim = nimInput;
    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

}

public class PRAK303_MODUL3 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> tempatSimpanInfoMahasiswa = new ArrayList<>();
        Scanner inputer = new Scanner(System.in);

        int tempatInput;
        boolean kondisi = true;

        while(kondisi){
            System.out.println("Menu : ");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : ");
            tempatInput = inputer.nextInt();
            inputer.nextLine();

            switch (tempatInput) {
                case 1:
                    System.out.print("Masukan Nama Mahasiswa : ");
                    String namaInput = inputer.nextLine();

                    System.out.print("Masukan NIM Mahasiswa(Harus Unik): ");
                    String nimInput = inputer.nextLine();

                    Mahasiswa mahasiswaTambah = new Mahasiswa(namaInput, nimInput);
                    tempatSimpanInfoMahasiswa.add(mahasiswaTambah);

                    System.out.println("Mahasiswa "+namaInput+" Telah ditambahkan\n");
                    break;
                case 2:
                    System.out.print("Masukan NIM Mahasiswa yang Akan Dihapus : ");
                    String nimInputHapus = inputer.nextLine();
                    boolean cekbisadihapus = false;

                    for(Mahasiswa x : tempatSimpanInfoMahasiswa){
                        if(x.getNim().equals(nimInputHapus)){
                            tempatSimpanInfoMahasiswa.remove(x);
                            System.out.println("Mahasiswa dengan NIM "+nimInputHapus+ " Dihapus\n");
                            cekbisadihapus = true;
                            break;
                        }

                    }
                    if (!cekbisadihapus) {
                        System.out.println("Mahasiswa dengan NIM " + nimInputHapus + " tidak ditemukan.\n");
                    }
                    break;

                case 3:
                    System.out.print("Masukan NIM Mahasiwa yang Ingin Dicari : ");
                    String nimInputCari = inputer.nextLine();
                    boolean cekbisadicari = false;

                    for(Mahasiswa y: tempatSimpanInfoMahasiswa){
                        if (y.getNim().equals(nimInputCari)) {
                            System.out.println("NIM: "+y.getNim()+", Nama: "+y.getNama()+"\n");
                            cekbisadicari = true;
                            break;
                        }
                    }
                    if (!cekbisadicari) {
                        System.out.println("Mahasiswa dengan NIM " + nimInputCari + " tidak ditemukan.\n");
                    }
                    break;
                case 4:
                    System.out.println("Daftar Mahasiswa : ");
                    for(Mahasiswa z: tempatSimpanInfoMahasiswa){
                        System.out.println("NIM: "+z.getNim()+", Nama: "+z.getNama());
                    }
                    System.out.println("\n");
                    break;
                case 0:
                    System.out.println("Terima Kasih\n");
                    tempatSimpanInfoMahasiswa.clear();
                    kondisi=false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
        inputer.close();
    
    }
}
