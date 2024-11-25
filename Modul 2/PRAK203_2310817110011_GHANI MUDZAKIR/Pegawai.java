// ini penamaan public class nya salah harusnya disesuaikan dengan nama file
// public class Employee { }
public class Pegawai {
    public String nama;

    // Erro disini dikarenakan tipe data dari variabel asal adalah String 
    //public char asal; 
    public String asal;

    public String jabatan; 
    public int umur; 
 
    public String getNama() { 
        return nama; 
    } 
 
    public String getAsal() { 
        return asal; 
    } 

    // public void setJabatan() harus punya parameter untuk di set
    // public void setJabatan()
    public void setJabatan(String inputJabatan) { 
        jabatan = inputJabatan; 
    } 
} 

