import java.util.Scanner;

public class PRAK105_Ghani_Mudzakir_2310817110011 {
    public static void main(String[] args) {
        Scanner Inputer = new Scanner(System.in);
        float r, t;
        final double phi = 3.14;

        System.out.print("Masukkan jari-jari : ");
        r = Inputer.nextFloat();
        System.out.print("Masukan tinggi : ");
        t = Inputer.nextFloat();

        double volume = phi * r * r * t;
        String hasil = String.format("%.3f", volume);

        System.out.println("Volume tabung dengan jari-jari "+r+" cm dan tinggi "+t+" cm adalah "+hasil+" m3");
        Inputer.close();       
    }
}
