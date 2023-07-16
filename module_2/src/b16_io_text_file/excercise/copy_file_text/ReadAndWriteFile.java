package b16_io_text_file.excercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFile {
    public static ArrayList<String> readFile(String path) throws IOException {
        ArrayList list = new ArrayList<String>();

        try {
            File file = new File(path);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);

            System.out.println("---String đọc được---");
            System.out.println("");

            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                list.add(line);
            }

            System.out.println("");

            br.close();
        }catch (FileNotFoundException e){
            System.out.println("Không tìm thấy file cần Copy");
        }
        return list;
    }

    public static void writeFile(String path, ArrayList<String> list){
        try {
            File file = new File(path);
            if (file.exists()){
                throw new RuntimeException();
            }

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("---Paste String---");
            System.out.println("");

            for (String string : list){
                bufferedWriter.write(string);
                bufferedWriter.newLine();
                System.out.println(string);
            }
            bufferedWriter.close();

        }catch (RuntimeException e){
            System.out.println("File đã tồn tại rồi, ghi đè nó chửi chết");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
