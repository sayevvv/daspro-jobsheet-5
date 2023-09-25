import java.util.Scanner;

public class PemilihanPercobaan201 {

    public static void main (String [] args) {
        Scanner input00= new Scanner(System.in);
        System.out.print("Nilai uas\t: ");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts\t: ");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis\t: ");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas\t: ");
        float tugas = input00.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        
        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
        input00.close();
    }
}