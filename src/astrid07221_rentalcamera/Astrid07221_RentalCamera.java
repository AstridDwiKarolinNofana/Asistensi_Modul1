package astrid07221_rentalcamera;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Astrid07221_RentalCamera {
    static ArrayList<Astrid07221_AnggotaEntity>Astrid07221_dataAnggota = new ArrayList();
    static ArrayList<Astrid07221_cameraEntity>Astrid07221_dataCamera = new ArrayList();
    static ArrayList<Astrid07221_pelangganEntity>Astrid07221_dataPelanggan = new ArrayList();
    static Scanner input = new Scanner(System.in);
    
  
    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Rental Camera !!");
    int Astrid07221_pil;
    do{
        System.out.println("Pilihan : ");
            System.out.println("1. Input Data ");
            System.out.println("2. Lihat Data ");
            System.out.println("3. Ubah Data ");
            System.out.println("4. Hapus Data ");
            System.out.println("5. Exit");
            System.out.print("Pilih : ");
    
        Astrid07221_pil = input.nextInt();
        switch(Astrid07221_pil){
            case 1 : Astrid07221_daftar();
                     break;
            case 2 : Astrid07221_view();
                     break;
            case 3 : Astrid07221_update();
                     break;
            case 4 : Astrid07221_Delete();
                     break;         
        }
    }while(Astrid07221_pil!=5);
}
    static void Astrid07221_daftar(){
        System.out.println("1. Input Petugas");
        System.out.println("2. Input Camera");
        System.out.println("3. Input Pelanggan");
        System.out.print("pilih : ");
        int inputdata = input.nextInt();
        
         switch (inputdata) {
             case 1:
                 {
                     System.out.print("masukkan Id Petugas : ");
                     String Astrid07221_id = input.next();
                     System.out.print("masukkan Nama Petugas : ");
                     String Astrid07221_nama = input.next();
                     System.out.print("masukkan Alamat Petugas : ");
                     String Astrid07221_alamat = input.next();
                     System.out.print("masukkan No Identitas : ");
                     String Astrid07221_noIdentitas = input.next();
                     System.out.print("masukkan No Telepon : ");
                     String Astrid07221_notelp = input.next();
                     Astrid07221_dataAnggota.add(new Astrid07221_AnggotaEntity(Astrid07221_id,Astrid07221_nama,Astrid07221_alamat,
                             Astrid07221_noIdentitas,Astrid07221_notelp));
                     break;
                 }
             case 2:
                 {
                     System.out.print("masukkan Kode Kamera : ");
                     String Astrid07221_kode_camera = input.next();
                     System.out.print("masukkan Merk  : ");
                     String Astrid07221_merk = input.next();
                     System.out.print("masukkan Tipe : ");
                     String Astrid07221_tipe = input.next();
                     Astrid07221_dataCamera.add(new Astrid07221_cameraEntity(Astrid07221_kode_camera,Astrid07221_merk,Astrid07221_tipe));
                     break;
                 }
             case 3:
                 {
                    System.out.print("Input Id Pelanggan = ");
                    String Astrid07221_id_pelanggan = input.next();
                    System.out.print("Input Nama = ");
                    String Astrid07221_nama = input.next();
                    System.out.print("Input Alamat = ");
                    String Astrid07221_alamat = input.next();
                    System.out.print("Input No Telp = ");
                    String Astrid07221_notelp = input.next();
                    System.out.print("masukkan No Identitas : ");
                    String Astrid07221_noIdentitas = input.next();
                    
                    for(int i=0; i<Astrid07221_dataCamera.size();i++){
                    System.out.print(i+"."+Astrid07221_dataCamera.get(i).Astrid07221_merk);
                    System.out.println(" | "+Astrid07221_dataCamera.get(i).Astrid07221_tipe);
                    }
                    System.out.print("Pilih merk Camera = ");
                    int Astrid07221_indexcamera = input.nextInt();      

                    System.out.print("Input Tgl Sewa (mm/dd/yy) = ");
                    Date Astrid07221_Tanggal_Sewa = new Date(input.next());
                    System.out.print("Input Tgl Pengembalian (mm/dd/yy) = ");
                    Date Astrid07221_Tanggal_pengembalian = new Date(input.next());

                    System.out.print("masukkan Total Bayar : ");
                    String Astrid07221_harga = input.next();
                    
                    for(int i=0; i<Astrid07221_dataAnggota.size();i++){
                    System.out.println(i+"."+Astrid07221_dataAnggota.get(i).Astrid07221_nama);
                    }        
                    System.out.print("Petugas = ");
                    int Astrid07221_indexAnggota = input.nextInt(); 
                    
        Astrid07221_dataPelanggan.add(new Astrid07221_pelangganEntity(Astrid07221_id_pelanggan,Astrid07221_nama,Astrid07221_alamat,Astrid07221_noIdentitas,Astrid07221_notelp,Astrid07221_harga,
        Astrid07221_Tanggal_Sewa,Astrid07221_Tanggal_pengembalian,Astrid07221_indexcamera,Astrid07221_indexAnggota));
    }
                 default:
                 System.out.println("pilihan tidak ada");
                 break;
   }
 }
                 
    static void Astrid07221_view(){
    System.out.print(" Masukkan Pilihan anda (Petugas/Camera/Pelanggan) : ");
        String inputdata = input.next();
        if(inputdata.equals("Petugas")){
            for(int i=0;i<Astrid07221_dataAnggota.size();i++){
                System.out.println(" Id Petugas   : " + Astrid07221_dataAnggota.get(i).getAstrid07221_id_Petugas());
                System.out.println(" Nama         : " + Astrid07221_dataAnggota.get(i).getAstrid07221_nama());
                System.out.println(" Alamat       : " + Astrid07221_dataAnggota.get(i).getAstrid07221_alamat());
                System.out.println(" No Identitas : " + Astrid07221_dataAnggota.get(i).getAstrid07221_noIdentitas());
                System.out.println(" No Telepon   : " + Astrid07221_dataAnggota.get(i).getAstrid07221_notelp());
                System.out.println("_____________________________");
            }
               
        }else if(inputdata.equals("Camera")){
            for(int i=0;i<Astrid07221_dataCamera.size();i++){
                System.out.println(" Kode Camera : " + Astrid07221_dataCamera.get(i).getAstrid07221_kode_camera());
                System.out.println(" Merk        : " + Astrid07221_dataCamera.get(i).getAstrid07221_merk());
                System.out.println(" Tipe        : " + Astrid07221_dataCamera.get(i).getAstrid07221_tipe());
                System.out.println("_____________________________");
            }
        }else if(inputdata.equals("Pelanggan")){
            for(int i=0;i<Astrid07221_dataPelanggan.size();i++){
            System.out.println("Id_pelanggan       : "+Astrid07221_dataPelanggan.get(i).getAstrid07221_id_pelanggan());
            System.out.println("Nama               : "+Astrid07221_dataPelanggan.get(i).getAstrid07221_nama());
            System.out.println("Alamat             : "+Astrid07221_dataPelanggan.get(i).getAstrid07221_nama());
            System.out.println("No Identitas       : "+ Astrid07221_dataPelanggan.get(i).getAstrid07221_noIdentitas());
            System.out.println("No Telp            : "+Astrid07221_dataPelanggan.get(i).getAstrid07221_notelp());
            System.out.println("Camera | Tipe      : "+Astrid07221_dataCamera.get(Astrid07221_dataPelanggan.get(i).Astrid07221_indexcamera).getAstrid07221_merk()
            +" | "+Astrid07221_dataCamera.get(Astrid07221_dataPelanggan.get(i).Astrid07221_indexcamera).getAstrid07221_tipe());
            System.out.println("Tgl sewa           : "+new SimpleDateFormat(" dd - MM - yyyy").format(Astrid07221_dataPelanggan.get(i).getAstrid07221_Date_sewa()));
            System.out.println("Tgl pengembalian   : "+new SimpleDateFormat(" dd - MM - yyyy").format(Astrid07221_dataPelanggan.get(i).getAstrid07221_Date_kembali()));
            System.out.println("Total Harga        : "+Astrid07221_dataPelanggan.get(i).getAstrid07221_harga());
            System.out.println("Petugas            : "+Astrid07221_dataAnggota.get(Astrid07221_dataPelanggan.get(i).Astrid07221_indexAnggota).getAstrid07221_nama());
            }
        }
    }
    
    static void Astrid07221_update(){
        System.out.print(" Masukkan Pilihan anda (Petugas/Camera) : ");
        String inputdata = input.next();
        if(inputdata.equals("Petugas")){
                        for(int i=0; i<Astrid07221_dataAnggota.size(); i++){
                            System.out.println(i+". ID  : "+Astrid07221_dataAnggota.get(i).getAstrid07221_id_Petugas());
                        }
                        System.out.print("");
                        System.out.print("Pilih Index : ");
                        int selectIndex = input.nextInt();
           
                        
                     System.out.println(" MASUKKAN DATA BARU ");
                     System.out.print("masukkan Id Petugas : ");
                     String Astrid07221_id = input.next();
                     System.out.print("masukkan Nama Petugas : ");
                     String Astrid07221_nama = input.next();
                     System.out.print("masukkan Alamat Petugas : ");
                     String Astrid07221_alamat = input.next();
                     System.out.print("masukkan No Identitas : ");
                     String Astrid07221_noIdentitas = input.next();
                     System.out.print("masukkan No Telepon : ");
                     String Astrid07221_notelp = input.next();
                     Astrid07221_dataAnggota.set(selectIndex,new Astrid07221_AnggotaEntity(Astrid07221_id,Astrid07221_nama,
                     Astrid07221_alamat,Astrid07221_noIdentitas,Astrid07221_notelp));
               
        }else if(inputdata.equals("Camera")){
           for(int i=0; i<Astrid07221_dataCamera.size(); i++){
                            System.out.println(i+". kode  : "+Astrid07221_dataCamera.get(i).getAstrid07221_kode_camera());
                        }
                        System.out.print("");
                        System.out.print("Pilih Index : ");
                        int selectIndex = input.nextInt();
                       
                     System.out.print("masukkan Kode Kamera : ");
                     String Astrid07221_kode_camera = input.next();
                     System.out.print("masukkan Merk  : ");
                     String Astrid07221_merk = input.next();
                     System.out.print("masukkan Tipe : ");
                     String Astrid07221_tipe = input.next();
                     System.out.println("Data berhasil diubah");
                     System.out.println("");
                     Astrid07221_dataCamera.set(selectIndex,new Astrid07221_cameraEntity(Astrid07221_kode_camera,Astrid07221_merk,Astrid07221_tipe));             
        }
   }
    
    static void Astrid07221_Delete(){
        
        System.out.print(" Masukkan Pilihan anda (Petugas/Camera/Pelanggan) : ");
        String inputdata = input.next();
        if(inputdata.equals("Petugas")){
         System.out.print("masukkan id : ");
         String Astrid07221_id =input.next();
         System.out.print("masukkan nama : ");
         String Astrid07221_nama =input.next();
                   for(int i=0;i<Astrid07221_dataAnggota.size();i++)
                   {
                       if(Astrid07221_nama.equals(Astrid07221_dataAnggota.get(i).getAstrid07221_nama()) && Astrid07221_id.equals(Astrid07221_dataAnggota.get(i).getAstrid07221_id_Petugas()))
                        {
                            System.out.println(" DATA BERHASIL DIAMBIL");
                            Astrid07221_dataAnggota.remove(i);
                        }
                   } 
        }
        else if (inputdata.equals("Camera")){
         System.out.print("masukkan kode : ");
         String Astrid07221_kode =input.next();
         System.out.print("masukkan merk : ");
         String Astrid07221_merk =input.next();
                   for(int i=0;i<Astrid07221_dataCamera.size();i++)
                   {
                       if(Astrid07221_merk.equals(Astrid07221_dataCamera.get(i).getAstrid07221_merk()) && Astrid07221_kode.equals(Astrid07221_dataCamera.get(i).getAstrid07221_kode_camera()))
                        {
                            System.out.println(" DATA BERHASIL DIAMBIL");
                            Astrid07221_dataCamera.remove(i);
                        }
                   }
        }
        else if(inputdata.equals("Pelanggan")){
         System.out.print("masukkan id : ");
         String Astrid07221_id_pelanggan =input.next();
         System.out.print("masukkan nama : ");
         String Astrid07221_nama =input.next();
                   for(int i=0;i<Astrid07221_dataPelanggan.size();i++)
                   {
                       if(Astrid07221_nama.equals(Astrid07221_dataPelanggan.get(i).getAstrid07221_nama()) && Astrid07221_id_pelanggan.equals(Astrid07221_dataPelanggan.get(i).getAstrid07221_id_pelanggan()))
                        {
                            System.out.println(" DATA BERHASIL DIAMBIL");
                            Astrid07221_dataPelanggan.remove(i);
                        }
                   }
        }
    }
}