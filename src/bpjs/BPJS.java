/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpjs;

/**
 *
 * @author MOKLET-01
 */
public class BPJS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //inialisasi objek serta pemanggilan class data
        data a = new data();
        a.identitas();
        a.setNama("Syahra");
        System.out.println("Nama\t : "+a.getNama());
        a.setTTL("04-07-2004");
        System.out.println("TTL\t : "+a.getTTL());
        a.setAlamat("Blitar");
        System.out.println("Alamat\t : "+a.getAlamat());
        a.identitas("5625638297", "081234567");
        a.iuran();
        //inisialisasi objek serta pemanggilan class datadata
        data b = new datadata();
        b.iuran();
    }
    
}
