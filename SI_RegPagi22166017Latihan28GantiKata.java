import java.util.Scanner;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk mengganti kata dalam sebuah kalimat
 */
public class SI_RegPagi22166017Latihan28GantiKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Memasukkan kalimat
        System.out.println("========== Program Mengganti Kalimat ==========");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();
        
         // Meminta kata yang ingin diganti
        System.out.print("Ganti kata : ");
        String kata_lama = input.nextLine();

        // Meminta kata pengganti
        System.out.print("Menjadi kata : ");
        String kata_baru = input.nextLine();
        
        System.out.println("========== Hasil Formatting ==========");
        
         // Melakukan penggantian kata dalam kalimat
        String kalimat_baru = kalimat.replace(kata_lama, kata_baru);

        // Menampilkan kalimat awal dan kalimat setelah penggantian
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimat_baru);

    }
    
}
