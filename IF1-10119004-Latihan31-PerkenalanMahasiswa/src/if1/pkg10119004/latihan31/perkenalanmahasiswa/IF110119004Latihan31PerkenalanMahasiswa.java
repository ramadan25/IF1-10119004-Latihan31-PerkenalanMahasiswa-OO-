/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan31.perkenalanmahasiswa;

/**
 *
 * @author ENDOG
 *  Nama      : Muhamad Ramadan
 *  NIM       : 10119004
 *  Kelas     : IF1
 *  Deskripsi : menampilkan identitas
 */
public class IF110119004Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "A";
        mhs1.nim = "10118009";

        Mahasiswa mhs2 = new Mahasiswa();  
        mhs2.nama = "B";
        mhs2.nim =  "10119089";
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nama = "C";
        mhs3.nim = "10119198";       
                
        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.nama = "D";
        mhs4.nim = "10119320";
      
        mhs1.perkenalanDiri();
        mhs2.perkenalanDiri();
        mhs3.perkenalanDiri();
        mhs4.perkenalanDiri();
    }
    
}
