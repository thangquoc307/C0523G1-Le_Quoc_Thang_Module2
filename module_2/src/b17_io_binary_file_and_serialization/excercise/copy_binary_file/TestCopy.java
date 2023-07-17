package b17_io_binary_file_and_serialization.excercise.copy_binary_file;

public class TestCopy {
    public static void main(String[] args) {

        String source = "b17_io_binary_file_and_serialization/excercise/copy_binary_file/WP_20170226_10_36_46_Pro.jpg";
        String target = "b17_io_binary_file_and_serialization/excercise/copy_binary_file/Copy_WP_20170226_10_36_46_Pro.jpg";

        CopyBinaryFile.copyBinaryFile(source, target);
    }
}
