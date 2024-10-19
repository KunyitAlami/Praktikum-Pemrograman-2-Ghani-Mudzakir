public class Soal3Main {
    
    public static void main(String[] args) {

        Pegawai p1 = new Pegawai();

        // Pada baris ini terjadi error karena kurangnya titik koma (;) 
        // p1.nama = "Roi" 
        p1.nama = "Roi"; 

        p1.asal = "Kingdom of Orvel"; 
        p1.setJabatan("Assasin"); 

        // kita menambahkan nilai pada atribut umur dengan nilai yang sama untuk output yang diperintahkan
        p1.umur = 17;
 
        System.out.println("Nama Pegawai: " + p1.getNama()); 
        System.out.println("Asal: " + p1.getAsal()); 
        System.out.println("Jabatan: " + p1.jabatan);
        
        // kita menambahkan " Tahun" di sysout agar sesuai dengan output yang diperintahkan
        System.out.println("Umur: " + p1.umur + " Tahun"); 

    }
}
