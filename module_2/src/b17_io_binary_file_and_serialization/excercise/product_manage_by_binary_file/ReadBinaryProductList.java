package b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadBinaryProductList {
    public static ArrayList<BinaryProduct> readBinaryList(String path){
        ArrayList<BinaryProduct> list = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            list = (ArrayList<BinaryProduct>) ois.readObject();


        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file");
        } catch (IOException e) {
            System.err.println(e);;
        } catch (ClassNotFoundException e) {
            System.err.println("File không có dữ liệu");
        }
        return list;
    }
}
