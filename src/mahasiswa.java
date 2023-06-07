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
            System.out.println(e.getMessage());
            setNama(scanner.nextLine());
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
            System.out.println(e.getMessage());
            setNim(scanner.nextLine());
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
            System.out.println(e.getMessage());
            setEmail(scanner.nextLine());
        }
    }

    private void cekNim(String nim) throws Nim {
        if (!Pattern.matches("^202210370311\\d{3}$", nim)) {
            throw new Nim("NIM tidak valid!");
        }
    }

    private void cekNama(String nama) throws Nama {
        if (!Pattern.matches("[a-zA-Z ]+", nama)) {
            throw new Nama("Nama hanya boleh mengandung huruf dan spasi.");
        }
    }

    private void cekEmail(String email) throws Email {
        if (!Pattern.matches("[\\w.-]+@[webmail.umm]\\w+\\.\\w+", email)) {
            throw new Email("Email tidak valid!");
        }
    }
}
