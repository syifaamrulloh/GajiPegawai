/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan43.gajipegawai;

/**
 *
 * @author 
 * Nama     : MUHAMAD SYIFA AMRULOH
 * Kelas    : IF 11-K
 * Nim      : 10118910
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return totalGaji = uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------------------");
        System.out.println("Nama Karyawan  : "+ nama);
        System.out.println("Alamat         : "+ getAlamat());
        System.out.println("Uang Transport : Rp. "+ uangTransport);
        System.out.println("Uang Tunjangan : Rp. "+ uangTunjangan);
        System.out.println("Gaji Pokok     : Rp. "+ gajiPokok);
        System.out.println("Gaji Total     : Rp. "+ totalGaji);
    }
}
