package laundry_ukl;
import java.util.ArrayList;

public class PetugasLaundry implements UserLaundry {
    
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public PetugasLaundry(){
        this.namaPetugas.add("Laundry Manager");
        this.alamat.add("\tSawojajar");
        this.telepon.add("085555333444");
        this.jabatan.add(0);
        
        this.namaPetugas.add("Dry Cleaning Supervisor");
        this.alamat.add("Singosari");
        this.telepon.add("085233445566");
        this.jabatan.add(0);
    }
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    public int getJmlPetugasLaundry(){
        return this.namaPetugas.size();
    }

    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
    }
    @Override
    public void setAlamat(String alamat){
        this.namaPetugas.add(alamat);
    }
    @Override
    public void setTelepon(String telepon){
        this.namaPetugas.add(telepon);   
    }  
    @Override
    public String getNama(int idPetugas){
        return this.namaPetugas.get(idPetugas);  
    }
    @Override
    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);   
    }
    @Override
    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
    }
    
    
}


