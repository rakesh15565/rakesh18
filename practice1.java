package rakesh18;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class practice1 {
    String filename ;
    String destinationfile;
    Scanner s = new Scanner(System.in);
    int count = 0;
    
    void readUserInput() {
        System.out.println("Enter the filename: ");
        filename = s.nextLine();
        System.out.println("Enter destination filename: ");
        destinationfile = s.nextLine();
        s.close();
    }

    void file_read() {
        try (
                BufferedReader br = new BufferedReader(new FileReader(filename)); 
                BufferedWriter bw = new BufferedWriter(new FileWriter(destinationfile))){
            String line = br.readLine();
            while (line != null) {
                bw.write(line);
                bw.newLine();
                count++;
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e){
            System.out.println("An error occurred."); 
        }
    }
}
class output{
    public static void main(String[] args) {
        practice1 obj = new practice1();
        obj.readUserInput();
        obj.file_read();
    }
}
