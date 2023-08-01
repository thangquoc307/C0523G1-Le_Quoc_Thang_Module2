package Test.giai_thuat;
import java.util.regex.Pattern;
public class Question15 {
    //Viết phương thức để kiểm tra cách đặt tên ở Java, cho 4 loại: “package”, “class”, “field”, “method”.
    //- Tên package: snake_case.
    //- Tên class: PascalCase.
    //- Tên field and method: camelCase.
    //Input: 2 tham số String.
    //- Dòng đầu tiên: Tên file cần kiểm tra.
    //- Dòng thứ 2: Loại file bao gồm 4 loại: “package”, “class”, “field”, “method” (không quan tâm kí tự hoa, thường).
    public static void main(String[] args) {
        System.out.println(checkName("HelloWorld", "class"));
        System.out.println(checkName("HelloWorld", "CLASS"));
        System.out.println(checkName("HelloWorld", "cLAss"));
        System.out.println(checkName("helloWorld", "cLAss"));
        System.out.println(checkName("helloWorld", "field"));

    }
    public static Boolean checkName(String string, String type){
        type = type.toLowerCase();
        String regex = "";
        switch (type){
            case "package":
                regex = "^[a-z_]+$";
                break;
            case "class":
                regex = "^[A-Z][a-zA-Z]*$";
                break;
            case "field":
            case "method":
                regex = "^[a-z][a-zA-Z]*$";
                break;
        }
        return Pattern.compile(regex).matcher(string).matches();
    }
}
