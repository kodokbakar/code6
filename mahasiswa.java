import format.*;

import java.util.*;
import java.util.regex.*;

public class mahasiswa {
    private String nama, nim, email;
    private final Scanner scanner = new Scanner(System.in);

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        try {
            cekNama(nama);
            this.nama = nama;
        } catch (Nama e) {
            System.out.print(e.getMessage());
            System.out.print("\nNama: ");setNama(scanner.nextLine());
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        try {
            cekNim(nim);
            this.nim = nim;
        } catch (Nim e) {
            System.out.print(e.getMessage());
            System.out.print("\nNIM: ");setNim(scanner.nextLine());
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            cekEmail(email);
            this.email = email;
        } catch (Email e) {
            System.out.print(e.getMessage());
            System.out.print("\nEmail: ");setEmail(scanner.nextLine());
        }
    }

    private void cekNim(String nim) throws Nim {
        /* Cara Kerja Regex di CekNim
        ^ = awal string
        202210370311 = NIM
        \\d{3} = 3 digit angka terakhir
        $ = akhir string
         */
        if (!Pattern.matches("^202210370311\\d{3}$", nim)) {
            throw new Nim("NIM tidak valid!");
        }
    }

    private void cekNama(String nama) throws Nama {
        /* Cara Kerja Regex di CekNama
        a-zA-Z = huruf kecil dan besar
        spasi = spasi
        */
        if (!Pattern.matches("[a-zA-Z ]+", nama)) {
            throw new Nama("Nama hanya boleh mengandung huruf dan spasi.");
        }
    }

    private void cekEmail(String email) throws Email {
        /* Cara Kerja Regex di CekEmail
        [\\w.-]+ = karakter yang diperbolehkan adalah huruf, angka, titik, dan strip
        @ = karakter @
        [webmail.umm] = karakter w, e, b, m, a, i, l, ., u, m, m
        \\w+ = karakter yang diperbolehkan adalah huruf dan angka
        \\. = karakter .
        \\w+ = karakter yang diperbolehkan adalah huruf dan angka
         */
        if (!Pattern.matches("[\\w.-]+@[webmail.umm]\\w+\\.\\w+", email)) {
            throw new Email("Email tidak valid!");
        }
    }
}
