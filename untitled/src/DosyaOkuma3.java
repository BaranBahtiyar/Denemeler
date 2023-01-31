import java.io.*;
import java.util.Scanner;

public class DosyaOkuma3 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String metin;

        File file = new File("kod.txt");
        if (!file.exists()){
            file.createNewFile();
        }


        FileWriter fWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        metin = scanner.nextLine();
        System.out.println("Yazılacak metni girin : ");
        bWriter.write(metin);
        bWriter.close();

        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);

        while ((line = bReader.readLine()) != null ){
            System.out.println(line);
        }
    }
}
