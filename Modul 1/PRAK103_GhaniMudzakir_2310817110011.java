import java.util.Scanner;

public class PRAK103_GhaniMudzakir_2310817110011 {
    public static void main(String[] args) {
        int N, nilaiAwal;
        Scanner Inputer = new Scanner(System.in);
        N = Inputer.nextInt();
        nilaiAwal = Inputer.nextInt();

        int nilaiCek = 0;
        int nilaiKoma = 1;

        do {
            if (nilaiAwal % 2 != 0) {
                nilaiKoma++;
                System.out.print(nilaiAwal);
                if (nilaiKoma <= N) {
                    System.out.print(", ");
                }
                nilaiCek++;
            }               
            nilaiAwal++;

        } while (nilaiCek != N);

        Inputer.close();
    }
}
