package bagian3.perpustakaan;

import java.util.ArrayList;

public class LibrarySystem {

    // Class model
    static class Buku {
        private String title;
        private String author;
        // Jawaban No 2: Atribut tahunTerbit
        private int tahunTerbit; 
        private boolean isBorrowed;

        public Buku(String title, String author, int tahunTerbit) {
            this.title = title;
            this.author = author;
            this.tahunTerbit = tahunTerbit;
            this.isBorrowed = false;
        }

        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public int getTahunTerbit() { return tahunTerbit; }
        public void setBorrowed(boolean status) { this.isBorrowed = status; }
        
        public String info() {
            String status = isBorrowed ? "Borrowed" : "Available";
            return title + " by " + author + " (" + tahunTerbit + ") [" + status + "]";
        }
    }

    // Class pengelola
    static class Perpustakaan {
        private ArrayList<Buku> collection = new ArrayList<>();

        public void addBook(Buku b) {
            collection.add(b);
        }

        public void showCollection() {
            System.out.println("Collection:");
            for (Buku b : collection) {
                System.out.println("- " + b.info());
            }
        }

        public void borrowBook(String target) {
            for (Buku b : collection) {
                if (b.getTitle().equals(target)) {
                    b.setBorrowed(true);
                    System.out.println("Borrowed: " + target);
                    return;
                }
            }
        }

        // Jawaban No 1: Method kembalikanBuku
        public void kembalikanBuku(String target) {
            for (Buku b : collection) {
                if (b.getTitle().equals(target)) {
                    b.setBorrowed(false);
                    System.out.println("Returned: " + target);
                    return;
                }
            }
            System.out.println("Not found.");
        }

        // Jawaban No 3: Method cariPenulis
        public void cariPenulis(String targetAuthor) {
            System.out.println("Search result for " + targetAuthor + ":");
            boolean found = false;
            for (Buku b : collection) {
                if (b.getAuthor().equals(targetAuthor)) {
                    System.out.println("- " + b.getTitle());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No records for " + targetAuthor);
            }
        }
    }

    // Class main untuk pengujian
    public static void main(String[] args) {
        Perpustakaan lib = new Perpustakaan();

        lib.addBook(new Buku("Ocean", "Smith", 2015));
        lib.addBook(new Buku("Mountain", "Doe", 2020));
        lib.addBook(new Buku("River", "Smith", 2022));

        lib.showCollection();
        System.out.println();

        lib.borrowBook("Ocean");
        System.out.println();

        // Uji coba No 1
        lib.kembalikanBuku("Ocean");
        System.out.println();

        // Uji coba No 3
        lib.cariPenulis("Smith");
    }
}