package Test.giai_thuat;
import java.util.ArrayList;
import java.util.List;
public class Question04 {
    //Chương trình sửa lại xâu kí tự:
    //Cho một xâu kí tự s gồm nhiều từ. Trong đó mỗi từ sẽ được bắt đầu bởi một kí tự in hoa.
    //Vì một lí do gì đó, người ta quên chèn các khoảng trắng giữa các từ.
    public static void main(String[] args) {
        System.out.println(amendTheSentence("Hello"));
        System.out.println(amendTheSentence("Hello CodeGym"));
        System.out.println(amendTheSentence("DaNang"));
        System.out.println(amendTheSentence("CodeGymDaNang"));
        System.out.println(amendTheSentence("CodeMarathon"));

    }
    public static String amendTheSentence(String string){
        List<String> list = new ArrayList<>();
        String[] stringList = string.split("");
        for (int i = 0; i < stringList.length; i++){
            if (!stringList[i].equals(" ")){
                list.add(stringList[i]);
            }
        }

        String result = list.get(0).toLowerCase();

        for (int i = 1; i < list.size(); i++){
            if (list.get(i).equals(list.get(i).toUpperCase())){
                result += " ";
            }
            result += list.get(i);
        }
        return result.toLowerCase();
    }
}
