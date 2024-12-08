package soal2;

import java.util.ArrayList;
import java.util.Scanner;

class HewanPeliharaan {
    protected String nama;
    protected String ras;

    public HewanPeliharaan(String r, String n) {
        this.ras = r;
        this.nama = n;
    }

    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}

class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing(String r, String n, String w) {
        super(r, n);
        this.warnaBulu = w;
    }

    public void displayDetailKucing() {
        display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}

class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private ArrayList<String> kemampuan;

    public Anjing(String r, String n, String w, ArrayList<String> k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing() {
        display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.print("Memiliki kemampuan : ");
        for (String kemampuanItem : kemampuan) {
            System.out.print(kemampuanItem + " ");
        }
        System.out.println();
    }
}

public class soal2_Modul4 {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        int inputUser;

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        inputUser = inputer.nextInt();
        inputer.nextLine(); // Clear buffer newline

        switch (inputUser) {
            case 1: {
                String namaInput, rasInput, warnaBuluInput;

                System.out.print("Nama hewan peliharaan: ");
                namaInput = inputer.nextLine();

                System.out.print("Ras: ");
                rasInput = inputer.nextLine();

                System.out.print("Warna Bulu: ");
                warnaBuluInput = inputer.nextLine();

                Kucing objekKucing = new Kucing(rasInput, namaInput, warnaBuluInput);
                objekKucing.displayDetailKucing();
                break;
            }

            case 2: {
                String namaInputAnjing, rasInputAnjing, warnaBuluInputAnjing;

                System.out.print("Nama hewan peliharaan: ");
                namaInputAnjing = inputer.nextLine();

                System.out.print("Ras: ");
                rasInputAnjing = inputer.nextLine();

                System.out.print("Warna Bulu: ");
                warnaBuluInputAnjing = inputer.nextLine();

                System.out.print("Kemampuan : ");
                String kemampuanInput = inputer.nextLine();

                String[] kemampuanArray = kemampuanInput.split(",");
                ArrayList<String> kemampuanList = new ArrayList<>();
                for (String kemampuan : kemampuanArray) {
                    kemampuanList.add(kemampuan.trim());
                }

                Anjing objekAnjing = new Anjing(rasInputAnjing, namaInputAnjing, warnaBuluInputAnjing, kemampuanList);
                objekAnjing.displayDetailAnjing();
                break;
            }

            default:
                System.out.println("Maaf, input Anda salah!");
        }

        inputer.close();
    }
}
