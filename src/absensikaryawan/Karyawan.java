/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package absensikaryawan;

/**
 *
 * @author hp
 */
public class Karyawan {
    private int idKaryawan;
    private int NomorIndukKaryawan;
    private int NomorTelepon;
    private String NamaKaryawan;
    private String JenisKelamin;
    private String Alamat;
    private String Email;
    private String Jabatan;
    
    public Karyawan(int idKaryawan, int NomorIndukKaryawan, int NomorTelepon, String namaKaryawan, String JenisKelamin, String Alamat, String Email, String Jabatan) {
        this.idKaryawan = idKaryawan;
        this.NomorIndukKaryawan = NomorIndukKaryawan;
        this.NomorTelepon = NomorTelepon;
        this.NamaKaryawan = NamaKaryawan;
        this.JenisKelamin = JenisKelamin;
        this.Alamat = Alamat;
        this.Jabatan = Jabatan;
    }
    
    
    
     
}
