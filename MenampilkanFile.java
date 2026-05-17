import java.io.File;
import java.util.Scanner;


public class MenampilkanFile{
    public static void main(String[] args) {
        var keyboard= new Scanner(System.in);   

        System.out.printf("Memasukkan file direktori yang akan ditampilkan: ");
        var PatchDirektori = keyboard.nextLine();

        File direktori = new File(PatchDirektori);

        if(direktori.exists() && direktori.isDirectory()){
            File[] daftarfile = direktori.listFiles();

            System.out.printf("\nDaftar file dalam direktori");
            
            if(daftarfile != null && daftarfile.length > 0) {
                int jumlahFile= 1;
                for(File file : daftarfile){
                    if(file.isFile()){
                        System.out.printf("\n%d. %s", jumlahFile, file.getName());
                        jumlahFile++;           
                    }
                }
                
                if(jumlahFile == 1){
                    System.out.println("Direktori ditemukan, tapi hanya folder saja.");
                } else {
                    System.out.printf("Folder '%s' ini kosong.\n", PatchDirektori);
                }
            } else {
                System.err.println("\n[ERROR] Direktori tidak ditemukan atau salah ketik!");
                System.err.println("Jalur yang kamu masukkan: " + PatchDirektori);
            }

    
}
    }
}
