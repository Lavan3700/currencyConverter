import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Gebe ein wie viel CHF du umtauschen möchtest:");
        Scanner inputCHF = new Scanner(System.in);

        double chf = inputCHF.nextDouble();
        
        double bitcoinWert = 26995.12; // Kurs Anpassen
        double euroWert = 1.03; // Kurs Anpassen

        System.out.println("Für " + chf + " Franken bekommst du:");

        covertCHFToBitcoin(chf, bitcoinWert);
        covertCHFToEUR(chf, euroWert);
    }

    public static void covertCHFToBitcoin(double chf, double bitcoinWert) {
        double result = chf / bitcoinWert; // Um die Augabe zu Runden
        System.out.println(String.format("%.6f", result)  + " Bitcoins."); 
    }

    public static void covertCHFToEUR(double chf, double euroWert) {
        double result = chf * euroWert; // Um die Augabe zu Runden
        System.out.println(String.format("%.2f", result)  + " Euros."); 
    }
}
