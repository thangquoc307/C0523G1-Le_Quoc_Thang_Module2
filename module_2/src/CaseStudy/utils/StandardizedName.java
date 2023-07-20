package CaseStudy.utils;

public class StandardizedName {
    public static String standardizedName(String name){
        name = name.replaceAll(" +", " ").trim();
        String[] wordList = name.split("");
        String nameStardized = wordList[0].toUpperCase();

        for (int i = 1; i < wordList.length; i++){
            if (wordList[i - 1].equals(" ")){
                nameStardized += wordList[i].toUpperCase();
            }else {
                nameStardized += wordList[i].toLowerCase();
            }
        }
        return nameStardized;
    }
}
