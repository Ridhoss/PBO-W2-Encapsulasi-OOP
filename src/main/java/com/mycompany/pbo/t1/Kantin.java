/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo.t1;

import java.util.Scanner;

/**
 *
 * @author RIDHO
 */
class Makanan {
    private String nama;
    private int harga;
    
    public Makanan(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}

class Minuman {
    private String nama;
    private int harga;
    
    public Minuman(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}

class Store {
    private String nama;
    private Makanan[] makanan;
    private Minuman[] minuman;

    
    public Store(String nama, Makanan[] makanan, Minuman[] minuman){
        this.nama = nama;
        this.makanan = makanan;
        this.minuman = minuman;
    }
    
    public String getNama() {
        return nama;
    }
    public Makanan[] getMakanan() {
        return makanan;
    }
    public Minuman[] getMinuman() {
        return minuman;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}


public class Kantin {
    public static void main(String[] args) {
        Makanan[] makananStore1 = {
            new Makanan("Nasi Goreng", 15000),
            new Makanan("Mie Ayam", 12000),
            new Makanan("Sate Ayam", 20000)
        };
        Minuman[] minumanStore1 = {
            new Minuman("Es Teh", 5000),
            new Minuman("Es Jeruk", 7000)
        };

        Makanan[] makananStore2 = {
            new Makanan("Ayam Geprek", 18000),
            new Makanan("Bakso", 14000)
        };
        Minuman[] minumanStore2 = {
            new Minuman("Kopi Hitam", 6000),
            new Minuman("Teh Tarik", 8000)
        };

        Makanan[] makananStore3 = {
            new Makanan("Rendang", 25000),
            new Makanan("Soto Ayam", 17000)
        };
        Minuman[] minumanStore3 = {
            new Minuman("Jus Alpukat", 12000),
            new Minuman("Jus Mangga", 10000)
        };

        Store[] stores = {
            new Store("Kantin Bu Siti", makananStore1, minumanStore1),
            new Store("Kantin Pak Budi", makananStore2, minumanStore2),
            new Store("Kantin Mbak Rina", makananStore3, minumanStore3),
        };
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Daftar Kantin ===");
        for (int i = 0; i < stores.length; i++) {
            System.out.println((i + 1) + ". " + stores[i].getNama());
        }

        System.out.print("Pilih kantin (1-" + stores.length + "): ");
        int pilihan = sc.nextInt();

        if (pilihan >= 1 && pilihan <= stores.length) {
            Store kantinDipilih = stores[pilihan - 1];
            System.out.println("\n=== " + kantinDipilih.getNama() + " ===");
            
            System.out.println("Makanan:");
                for (Makanan m : kantinDipilih.getMakanan()) {
                System.out.println(" - " + m.getNama() + " (Rp" + m.getHarga() + ")");
            }

            System.out.println("Minuman:");
            for (Minuman min : kantinDipilih.getMinuman()) {
                System.out.println(" - " + min.getNama() + " (Rp" + min.getHarga() + ")");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

    }
}