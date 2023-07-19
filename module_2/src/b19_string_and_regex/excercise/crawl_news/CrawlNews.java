package b19_string_and_regex.excercise.crawl_news;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) throws IOException {
        URL link = new URL("https://dantri.com.vn/the-gioi.htm");
        URLConnection connection = link.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String dataLine = "";
        String line;
        while ((line = reader.readLine()) != null){
            dataLine += line;
        }

        //lấy đầu mục
        String regex1 = "\\<h[1-6].*?\\</h[1-6]\\>";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(dataLine);

        ArrayList<String> list = new ArrayList<>();
        while (matcher1.find()){
            String stringMatch = matcher1.group();
            list.add(stringMatch);
//            System.out.println(stringMatch);
        }

        //xử lý data
        ArrayList<String> listAnalyze = new ArrayList<>();
        String regex2 = "\\<a.*?\\</a\\>";
        Pattern pattern2 = Pattern.compile(regex2);
        for (String string : list){
            Matcher matcher2 = pattern2.matcher(string);
            if(matcher2.find()){
                String stringMatch = matcher2.group();
                listAnalyze.add(stringMatch);
            }
        }

        ArrayList<String> listAnalyzeFinal = new ArrayList<>();
        for (String string : listAnalyze){
            String[] stringList = string.split("[\\>\\<]");

            String title = stringList[2];
            title = title.replaceAll("\\&quot", "\"");
            listAnalyzeFinal.add(title);

            System.out.println(title);
        }
        //check số lượng chữ thông qua dấu cách
        //xóa dấu cách trước và cuối hàng


//        System.out.println(dataLine);
    }
}
