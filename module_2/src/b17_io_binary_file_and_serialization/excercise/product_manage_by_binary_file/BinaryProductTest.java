package b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file;

import java.util.ArrayList;

public class BinaryProductTest {
    public static void main(String[] args) {
        ArrayList<BinaryProduct> productList = new ArrayList<>();
        productList.add(new BinaryProduct("A001", "Cam", 50000.0, "Chợ cồn", "Hàng lậu"));
        productList.add(new BinaryProduct("A002", "Chanh", 58000.0, "Chợ hàng", "Hàng không lậu lắm"));
        productList.add(new BinaryProduct("A003", "Xoài", 50800.0, "Chợ cồn", "Hàng bãi"));
        productList.add(new BinaryProduct("A004", "ổi", 56600.0, "Chợ hàng", "Hàng hết hạn"));
        productList.add(new BinaryProduct("A005", "Bưởi", 58000.0, "Chợ tam giác"));
        productList.add(new BinaryProduct("A006", "Quýt", 44000.0, "Siêu thị", "Hàng lậu"));

        String path = "b17_io_binary_file_and_serialization/excercise/product_manage_by_binary_file/data.txt";

        WriteBinaryProductList.writeFile(path, productList);
        ArrayList<BinaryProduct> listReader = ReadBinaryProductList.readBinaryList(path);
        for (BinaryProduct item : listReader){
            item.show();
        }
    }
}
