package b16_io_text_file.excercise.read_csv_file;

import java.io.*;
import java.util.ArrayList;

public class ReadCsvFile {
    public static ArrayList<String[]> readCSVFile(String path){
        ArrayList<String[]> list = new ArrayList<String[]>();
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                list.add(data);

            }


        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println(e);
        }
        return list;
    }
}
