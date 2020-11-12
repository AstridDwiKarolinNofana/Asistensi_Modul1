/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astrid07221_rentalcamera;
import java.util.Date;
public class Astrid07221_cameraEntity {
   String Astrid07221_kode_camera,Astrid07221_merk,Astrid07221_tipe;
    public Astrid07221_cameraEntity(String Astrid07221_kode_camera,String Astrid07221_merk,String Astrid07221_tipe){
    this.Astrid07221_kode_camera=Astrid07221_kode_camera;
    this.Astrid07221_merk=Astrid07221_merk;
    this.Astrid07221_tipe=Astrid07221_tipe;
}
    String getAstrid07221_kode_camera(){
        return this.Astrid07221_kode_camera;
    }
    String getAstrid07221_merk(){
        return this.Astrid07221_merk;
    }
    String getAstrid07221_tipe(){
        return this.Astrid07221_tipe;
    }
}
