package b16_io_text_file.practice.sum_in_text;

import java.io.*;

public class ReadFileText {
    public static void readFileText(String path){
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                int sum = 0;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                br.close();
            System.out.println("Tổng = " + sum);



        } catch (FileNotFoundException e) {
            System.out.println("File ko tồn tại ba ơi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
