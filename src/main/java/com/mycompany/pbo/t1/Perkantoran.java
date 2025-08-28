/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo.t1;

import java.util.Scanner;

/**
 *
 * @author RIDHO
 */
class Departement {
    private String nama;

    public Departement(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Pegawai {
    private String nama;
    private int idpekerja;
    private int gaji;
    private String departement;
    
    public Pegawai(int idpekerja, String nama, String departement, int gaji){
        this.idpekerja = idpekerja;
        this.nama = nama;
        this.gaji = gaji;
        this.departement = departement;
    }

    public String getNama() {
        return nama;
    }
    public String getDepartement() {
        return departement;
    }
    public int getId() {
        return idpekerja;
    }
    public int getGaji() {
        return gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setDepartement(String departement) {
        this.departement = departement;
    }
    public void setId(int idpekerja) {
        this.idpekerja = idpekerja;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

}

public class Perkantoran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Departement[] departements = {
            new Departement("Direktorat Teknologi Informasi"),
            new Departement("Direktorat Logistik"),
            new Departement("Direktorat Sumber Daya Anggota"),
        };
        
        Pegawai[] pegawais =  new Pegawai[100];
        int count = 0;
        
        int exit = 0;
        int pilih;
        do {            
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Pegawai");
            System.out.println("2. Lihat data Pegawai");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            System.out.println("=========================");
            
            switch (pilih) {
                case 1:
                    int dep, gaji, id;
                    String nama;
                    
                    System.out.print("Masukan ID Pegawai: ");
                    id = sc.nextInt();
                    
                    System.out.print("Masukan Nama Pegawai: ");
                    nama = sc.next();
                    
                    System.out.print("Masukan Gaji Pegawai: ");
                    gaji = sc.nextInt();
                    
                    System.out.println("Pilihan Departement:");
                    for (int i = 0; i < departements.length; i++) {
                        System.out.println(i+1 + ". " + departements[i].getNama());
                    }
                    
                    System.out.print("Pilih Departement: ");
                    dep = sc.nextInt();
                    
                    pegawais[count++] = new Pegawai(id, nama, departements[dep-1].getNama(), gaji); 
                    
                    break;
                case 2:
                    for (int i = 0; i < pegawais.length; i++) {
                        try {
                            System.out.println(i+1 + ". " + pegawais[i].getId() + " || " + pegawais[i].getNama() + " || " + pegawais[i].getGaji() + " || " + pegawais[i].getDepartement() + " ||");
                        } catch (Exception e) {
                            break;
                        }
                    }
                    
                    break;
                case 3:
                    exit = 1;
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        } while (exit != 1);

    }
}