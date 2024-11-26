import java.util.Scanner;

public class PRAK102_GhaniMudzakir_2310817110011 {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);

        int angkaMulai;
        angkaMulai = inputer.nextInt();

        int angkaBatas = angkaMulai + 10;
        int nilaiKoma = 0;

        while (angkaMulai <= angkaBatas) {
            if (angkaMulai % 5 == 0) {
                nilaiKoma++;
                System.out.print((angkaMulai/5)-1);
                if (nilaiKoma <= 10) {
                    System.out.print(", ");
                }
            }else{
                nilaiKoma++;
                System.out.print(angkaMulai);
                if (nilaiKoma <= 10) {
                    System.out.print(", ");
                }
            }
            angkaMulai++;
        }

        inputer.close();
       
    }
}
