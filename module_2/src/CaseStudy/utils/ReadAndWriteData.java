package CaseStudy.utils;
import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteData {
    public final static String SPLITKEY = "|";
    public final static String SPLITKEYREGEX = "\\|";
    public void write(String link, ArrayList<String> data, Boolean append){
        try{
            File file = new File(link);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : data){
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            System.err.println("Kiếm không ra file bạn ei");;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<String> read(String link) {
        ArrayList<String> listText = new ArrayList<>();
        try {
            File file = new File(link);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                listText.add(line);
            }
            bufferedReader.close();


        } catch (FileNotFoundException e) {
            System.err.println("Kiếm không ra file bạn ei");
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listText;
    }
    public static int readContractorNumber(){
        try {
            File file = new File("CaseStudy/data/count_contractor_number.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            bufferedReader.close();

            return Integer.parseInt(line);
        } catch (FileNotFoundException e) {
            System.err.println("Kiếm không ra file bạn ei");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
    public static void writeContractorNumber(int count){
        try{
            File file = new File("CaseStudy/data/count_contractor_number.csv");
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(count + "");
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            System.err.println("Kiếm không ra file bạn ei");;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
