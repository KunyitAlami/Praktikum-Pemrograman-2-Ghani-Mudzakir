import java.util.Scanner;

public class PRAK101_GhaniMudzakir_2310817110011 {
    public static void main(String[] args) {

        String namaLengkap, tempatLahir;
        int tanggalLahir, bulanLahir, tahunLahir, tinggiBadan;
        float beratBadan;

        Scanner alatMasuk = new Scanner(System.in);

        System.out.print("Masukan Nama Lengkap : ");
        namaLengkap = alatMasuk.nextLine();

        System.out.print("Masukan Tempat Lahir : ");
        tempatLahir = alatMasuk.nextLine();

        System.out.print("Masukan Tanggal Lahir : ");
        tanggalLahir= alatMasuk.nextInt();

        System.out.print("Masukan Bulan Lahir : ");
        bulanLahir = alatMasuk.nextInt();

        System.out.print("Masukan Tahun Lahir : ");
        tahunLahir = alatMasuk.nextInt();

        System.out.print("Masukan Tinggi Badan : ");
        tinggiBadan = alatMasuk.nextInt();

        System.out.print("Masukan Berat Badan : ");
        beratBadan = alatMasuk.nextFloat();

        String namaBulanAkhir = "";
        switch (bulanLahir) {
            case 1:
                namaBulanAkhir = "Januari";
                break;
            case 2:
                namaBulanAkhir = "Februari";
                break;
            case 3:
                namaBulanAkhir = "Maret";
                break;
            case 4:
                namaBulanAkhir = "April";
                break;
            case 5:
                namaBulanAkhir = "Mei";
                break;
            case 6:
                namaBulanAkhir = "Juni";
                break;
            case 7:
                namaBulanAkhir = "Juli";
                break;
            case 8:
                namaBulanAkhir = "Agustus";
                break;
            case 9:
                namaBulanAkhir = "September";
                break;
            case 10:
                namaBulanAkhir = "Oktober";
                break;
            case 11:
                namaBulanAkhir = "November";
                break;
            case 12:
                namaBulanAkhir = "Desember";
                break;

            default:
                break;
        }


        System.out.println("Nama Lengkap " +  namaLengkap +", Lahir di " + tempatLahir+ " pada Tanggal " + tanggalLahir +" "+ namaBulanAkhir + " "+ tahunLahir);
        System.out.println("Tinggi Badan "+tinggiBadan+ " cm dan Berat Badan " + beratBadan + " kilogram");

        alatMasuk.close();




    }
}
