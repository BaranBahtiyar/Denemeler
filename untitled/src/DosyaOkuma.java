import java.io.*;

public class DosyaOkuma {

    public static void main(String[] args) throws IOException {

        File file = new File("kod.txt");
        if (!file.exists()){
            file.createNewFile();
        }

        String value = "Bee-Doo ";
        FileWriter fWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(value);
        bWriter.write("\nBaran Bahtiyar");
        bWriter.close();

        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);

        while ((line = bReader.readLine()) != null ){
            System.out.println(line);
        }
    }
}
