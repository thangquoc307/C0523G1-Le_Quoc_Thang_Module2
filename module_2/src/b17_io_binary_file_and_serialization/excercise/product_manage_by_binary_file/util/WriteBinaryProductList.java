package b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.util;

import b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.model.BinaryProduct;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteBinaryProductList {
    public static void writeFile(String path, ArrayList<BinaryProduct> product) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oss = new ObjectOutputStream(fos);

            oss.writeObject(product);
            fos.close();
            oss.close();

        }catch (Exception e){
            System.err.println(e);
        }
    }
}
