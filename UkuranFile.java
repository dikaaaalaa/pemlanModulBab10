import java.io.File;
import java.util.Scanner;

public class UkuranFile{
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);

        System.out.printf("Masukkan file yang akan dicek ukurannya: ");
        var fileName = keyboard.nextLine();
        
        File file = new File(fileName);
         
        if(file.exists() && file.isFile()){
            long bytes = file.length();
            final double KB = 1024;
            final double MB = KB * KB;

            System.out.printf("Untuk hasil ukuran file");

            if(bytes>= MB){
               double UkuranMB = (double) bytes / MB;
                System.out.printf(" %s adalah %.2f MB", fileName, UkuranMB);

            } else if(bytes <= KB){
                double UkuranKB = (double) bytes / KB;
                System.out.printf(" %s adalah %.2f KB", fileName, UkuranKB);
            }

        }       
    }
    }
    
