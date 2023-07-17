package b16_io_text_file.excercise.read_csv_file;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<String[]>();
        list = ReadCsvFile.readCSVFile("b16_io_text_file/excercise/read_csv_file/Nation.csv");
//        list = ReadCsvFile.readCSVFile("b16_io_text_file/excercise/read_csv_file/abc.csv");
        for (String[] strings : list){
            for (String string : strings){
                System.out.print(string + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Danh sách các quốc gia có trong list");

        ArrayList<String> nationList = new ArrayList();
        for (int i = 0; i < list.size(); i++){
            String nation = list.get(i)[2];
            if (!nationList.contains(nation)){
                nationList.add(nation);
            }
        }
        System.out.println("");
        for (String string : nationList){
            System.out.println(string);
        }
    }
}
