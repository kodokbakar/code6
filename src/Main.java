import java.util.*;

public class Main {
    public static void main(String[] args) {
        mahasiswa m = new mahasiswa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Data Mahasiswa");
        System.out.print("Nama : ");
        m.setNama(scanner.nextLine());
        System.out.print("NIM: ");
        m.setNim(scanner.nextLine());
        System.out.print("Email: ");
        m.setEmail(scanner.nextLine());

        System.out.println("\nData Mahasiswa");
        System.out.println("Nama: " + m.getNama());
        System.out.println("NIM: " + m.getNim());
        System.out.println("Email: " + m.getEmail());
    }
}