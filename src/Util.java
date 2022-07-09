import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {
    public static void Write (int x){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt",true));
            writer.flush();
            writer.write( Integer.toString(x) + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Read() throws NumberFormatException, IOException{
        String data = "0";
        FileReader fin = null;
        try {
            fin = new FileReader("Input.txt");
            try (BufferedReader br = new BufferedReader(fin)) {
                while (data != null){
                    data = br.readLine();
                    if (data != null) System.out.println (data);
                    int dataint = Integer.parseInt(data);
                    int hasil = dataint *dataint*dataint;
                    Write(hasil);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        } finally {
            if (fin != null){
                try {
                    fin.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

