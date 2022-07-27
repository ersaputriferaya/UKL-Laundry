package laundry_ukl;

public class Laporan {
    
     public void laporan(JenisLaundry jenislaundry){
        int x = jenislaundry.getJmlJenisLaundry();
        
        System.out.println();
        System.out.println("Tabel Jenis Laundry");
        System.out.println();
        System.out.println("Jenis Laundry \t\tHarga \tDurasi");
        
        for(int i = 0; i<x; i++){
            System.out.println(jenislaundry.getNamaJenisLaundry(i)+"\t"+jenislaundry.getHarga(i)+"\t"+jenislaundry.getDurasi(i));
        }
    }
    public void laporan(ClientLaundry clientlaundry){
        int x = clientlaundry.getJmlClientLaundry();
        
        System.out.println();
        System.out.println("Tabel Client");
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
        
        for(int i = 0; i<x; i++){
            System.out.println(clientlaundry.getNama(i)+"\t"+clientlaundry.getAlamat(i)+"\t"+clientlaundry.getTelepon(i)+"\t"+clientlaundry.getSaldo(i));
        }
    }
    
     public void laporan(PetugasLaundry petugaslaundry){
        int x = petugaslaundry.getJmlPetugasLaundry();
        
        System.out.println();
        System.out.println("Tabel Petugas");
        System.out.println();
        System.out.println("Nama \t \t\tAlamat \t\tTelepon \tJabatan");
        
        for(int i = 0; i<x; i++){
            System.out.println(petugaslaundry.getNama(i)+"\t"+petugaslaundry.getAlamat(i)+"\t"+petugaslaundry.getTelepon(i)+"\t"+petugaslaundry.getJabatan(i));
        }
    }
    public void laporan(TransaksiLaundry transaksilaundry, JenisLaundry jenislaundry){
        int x = transaksilaundry.getJmlTransaksiLaundry();
        
        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Nama Barang\tQty \tHarga \tJumlah");
        
        int total = 0;
        for(int i = 0; i<x; i++){
            int jumlah = transaksilaundry.getBanyaknya(i)*jenislaundry.getHarga(transaksilaundry.getIdjenisLaundry(i));
            total += jumlah;
            
            System.out.println(jenislaundry.getNamaJenisLaundry(transaksilaundry.getIdjenisLaundry(i))+"\t"+transaksilaundry.getBanyaknya(i)
            +"\t"+jenislaundry.getHarga(transaksilaundry.getIdjenisLaundry(i))+"\t"+jumlah);
        }
        System.out.println("Total Omset = "+total);
    }
    
    
}

