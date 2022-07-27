package laundry_ukl;
import java.util.ArrayList;
import java.util.Scanner;

public class Laundry {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClientLaundry daftarClient = new ClientLaundry();
        PetugasLaundry daftarPetugas = new PetugasLaundry();
        TransaksiLaundry Transaksi = new TransaksiLaundry();
        Laporan laporan = new Laporan();
        
        laporan.laporan(daftarPetugas);
        System.out.print("Masukkan Id Petugas : ");
        int id = input.nextInt();
        System.out.println("Selamat Datang " + daftarPetugas.getNama(id));
        System.out.println("");
        
        JenisLaundry jenislaundry = new JenisLaundry();
        laporan.laporan(daftarClient);
        laporan.laporan(jenislaundry);
        Transaksi.prosesTransaksiLaundry(daftarClient, Transaksi, jenislaundry);
        laporan.laporan(jenislaundry);
        laporan.laporan(daftarClient);
            
    }
                
                }
         
        



    
    
    
    

