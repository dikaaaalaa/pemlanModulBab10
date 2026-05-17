import java.io.File;
import java.util.Scanner;

public class HapusDirektori {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan path direktori yang akan dihapus: ");
        var pathDirektori = keyboard.nextLine();
        
        File direktori = new File(pathDirektori);
        
        if (direktori.exists() && direktori.isDirectory()) {
            
            File[] daftarFile = direktori.listFiles();
            
            if (daftarFile != null) {
                for (File file : daftarFile) {
                    if (file.isFile()) {
                        boolean fileTerhapus = file.delete();
                        if (fileTerhapus) {
                            System.out.println("File terhapus: " + file.getName());
                        } else {
                            System.err.println("Gagal menghapus file: " + file.getName());
                        }
                    }
                }
            }
            
            if (direktori.delete()) {
                System.out.println("\n[SUKSES] Direktori '" + direktori.getName() + "' berhasil dihapus total.");
            } else {
                System.err.println("\n[GAGAL] Gagal menghapus direktori utama. Pastikan tidak ada file yang terkunci.");
            }
            
        } else {
            System.err.println("[ERROR] Direktori tidak ditemukan atau jalurnya salah!");
        }
        
        keyboard.close();
    }
}
