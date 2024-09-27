import java.util.Scanner;

public class PRAK104_GhaniMudzakir_2310817110011 {
    public static void main(String[] args) {
        Scanner Inputer = new Scanner(System.in);

        int nilaiAbu = 0;
        int nilaiBagas = 0;
        String abu1, abu2, abu3;
        String bagas1, bagas2, bagas3;

        // kita meambil inputan nya abu dulu
        System.out.print("Tangan Abu : ");
        abu1 = Inputer.next().toUpperCase();
        abu2 = Inputer.next().toUpperCase();
        abu3 = Inputer.next().toUpperCase();

        // kita meambil inputannya bagas
        System.out.print("Tangan Bagas : ");
        bagas1 = Inputer.next().toUpperCase();
        bagas2 = Inputer.next().toUpperCase();
        bagas3 = Inputer.next().toUpperCase();

        // ronde pertama 
        if (abu1.equals("G") && bagas1.equals("K")) {
            nilaiAbu++;
        }else if (abu1.equals("G") && bagas1.equals("B")){
            nilaiBagas++;
        }else if(abu1.equals("K") && bagas1.equals("G")){
            nilaiBagas++;
        }else if(abu1.equals("K") && bagas1.equals("B")){
            nilaiAbu++;
        }else if(abu1.equals("B") && bagas1.equals("G")){
            nilaiAbu++;
        }else if(abu1.equals("B") && bagas1.equals("K")){
            nilaiBagas++;
        }

        // ronde kedua
        if (abu2.equals("G") && bagas2.equals("K")) {
            nilaiAbu++;
        }else if (abu2.equals("G") && bagas2.equals("B")){
            nilaiBagas++;
        }else if(abu2.equals("K") && bagas2.equals("G")){
            nilaiBagas++;
        }else if(abu2.equals("K") && bagas2.equals("B")){
            nilaiAbu++;
        }else if(abu2.equals("B") && bagas2.equals("G")){
            nilaiAbu++;
        }else if(abu2.equals("B") && bagas2.equals("K")){
            nilaiBagas++;
        }

        // ronde ketiga
        if (abu3.equals("G") && bagas3.equals("K")) {
            nilaiAbu++;
        }else if (abu3.equals("G") && bagas3.equals("B")){
            nilaiBagas++;
        }else if(abu3.equals("K") && bagas3.equals("G")){
            nilaiBagas++;
        }else if(abu3.equals("K") && bagas3.equals("B")){
            nilaiAbu++;
        }else if(abu3.equals("B") && bagas3.equals("G")){
            nilaiAbu++;
        }else if(abu3.equals("B") && bagas3.equals("K")){
            nilaiBagas++;
        }

        // penetuan sapa yang menang
        if (nilaiAbu > nilaiBagas) {
            System.out.println("Abu");
        }else if(nilaiAbu < nilaiBagas){
            System.out.println("Bagas");
        }else{
            System.out.println("Seri");
        }

        Inputer.close();
    }
}
