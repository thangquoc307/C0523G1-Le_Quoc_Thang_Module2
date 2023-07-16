package b16_io_text_file.excercise.copy_file_text;

import java.io.IOException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        list = ReadAndWriteFile.readFile("b16_io_text_file/excercise/copy_file_text/filecopy.txt");
        ReadAndWriteFile.writeFile("b16_io_text_file/excercise/copy_file_text/filepaste.txt", list);
    }
}
