package b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.repository;
import b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.model.BinaryProduct;
import b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.util.ReadBinaryProductList;
import b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.util.WriteBinaryProductList;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Repository {
    private static final String LINKPATH = "b17_io_binary_file_and_serialization/excercise/product_manage_by_binary_file/data/data.dat";
    private static ArrayList<BinaryProduct> products = ReadBinaryProductList.readBinaryList(LINKPATH);
    public static void add(BinaryProduct product){
        products.add(product);
        WriteBinaryProductList.writeFile(LINKPATH, products);
    }
    public static void display(){
        for (BinaryProduct product : products){
            product.show();
        }
    }
    public static void search(String nameSearch){
        String regex = ".*" + nameSearch + ".*";
        Pattern pattern = Pattern.compile(regex);
        ArrayList<BinaryProduct> result = new ArrayList<>();
        for (BinaryProduct product : products){
            if (pattern.matcher(product.getName().toLowerCase()).matches()){
                result.add(product);
            }
        }
        for (BinaryProduct product : result){
            product.show();
        }

    }
}
