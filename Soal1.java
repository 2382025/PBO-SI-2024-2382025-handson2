import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input pertama
        System.out.println("Masukkan Angka Pertama: ");
        int angka1 = input.nextInt();

        //input kedua
        System.out.println("Masukkan Angka Kedua: ");
        int angka2 = input.nextInt();

        //membandingkan angka dan menampilkan angka terbesar
        if (angka1 > angka2) {
            System.out.println("Angka Terbesar Adalah: " + angka1);
        } else if (angka2 > angka1) {
            System.out.println("Angka terbesar Adalah: " + angka2);
        } else {
            System.out.println("Kedua Angka Sama Besar.");
        }
    }
}



