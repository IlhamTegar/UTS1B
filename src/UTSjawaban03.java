import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class UTSjawaban03 {

    String[] PRODI = {"Prodi Teknik Informatika","Prodi DKV","Prodi Teknik Komputer"};
    static int totalJumlahPendftar = 1050;
    public static String[] ProdiTI = new String[500];
    public static String[] ProdiDKV = new String[300];
    public static String[] ProdiTK = new String[250];

    public static void informasikuotapendaftar(){
        int totalProdiTI=0;
        int totalsisakuota=0;
        for (int index=0;index<ProdiTI.length;index++){
            if(ProdiTI[index] !=null){
                totalProdiTI++;
            }
        }
        int totalProdiDKV=0;
        for (int index=0;index<ProdiDKV.length;index++){
            if(ProdiDKV[index] !=null){
                totalProdiDKV++;
            }
        }
        int totalProdiTK=0;
        for (int index=0;index<ProdiTK.length;index++){
            if(ProdiTK[index] !=null){
                totalProdiTK++;
            }
        }
        totalsisakuota = totalJumlahPendftar - totalProdiTI - totalProdiDKV - totalProdiTK;
        System.out.println("Total Pendaftar Prodi TI: " + totalProdiTI + " | Total Pendaftar Prodi DKV: " + totalProdiDKV + " |Total Pendaftar Prodi MK: " + totalProdiTK);
        System.out.println("Jumlah Mahasiswa Poltek Harapan Bersama: " + totalJumlahPendftar + " | Total Sisa Kuota: " + totalsisakuota);
    }

    public static void CekIndexArray(String[] myArray, String Mahasiswa) {
        int indexnow = 0;
        for (int index=0; index<myArray.length;index++){
            if(myArray[index] !=null){
                indexnow = index+1;
            }
        }
        if (indexnow< myArray.length){
            myArray[indexnow]= Mahasiswa;
        }
    }
    public static void InputMahasiswa(){
        Scanner InputData = new Scanner(System.in);
        Scanner inputdata = new Scanner(System.in);
        while(true){
            System.out.println("Nama Lengkap = ");
            String namamahasiwa = InputData.nextLine();
            System.out.println("Program study yang dipilih = ");
            System.out.println("Teknik Informatika/Desain Komunikasi Visual/Teknik Komputer");
            String PRODI = inputdata.nextLine();
            if (namamahasiwa.isBlank()){
                System.out.println("NAMA WAJIB DIISI !!");
                InputMahasiswa();}
            System.out.println("Nama Saya: " + namamahasiwa);
            System.out.println("Prodi saya: " + PRODI);
        }
    }

    public static void main(String[] args) {
        InputMahasiswa();
    }
}
