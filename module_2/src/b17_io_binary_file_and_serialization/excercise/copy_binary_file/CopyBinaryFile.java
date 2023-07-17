package b17_io_binary_file_and_serialization.excercise.copy_binary_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyBinaryFile {
    public static void copyBinaryFile(String sourcePath, String targetPath){
        try {
            File source = new File(sourcePath);
            File target = new File(targetPath);
            if (!source.exists()){
                throw new FileNotFoundException();
            }
            if (target.exists()){
                throw new RuntimeException();
            }

            Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);

        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy File cần Copy");
        } catch (RuntimeException e){
            System.err.println("Đã tồn tại File target, ghi đè nó đấm chết");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
