package Test.hack_rank;
public class TimeToString {
    public static void main(String[] args) {
        System.out.println(timeInWords(5, 30));
    }
    public static String  timeInWords(int h, int m) {
        String hour = numbertoStringHour(h);
        if (m == 0){
            return hour + " o' clock";
        } else if (m < 30){
            return numberToStringMinute(m) + " past " + numbertoStringHour(h);
        } else if (m == 30){
            return "half past " + numbertoStringHour(h);
        } else {
            return numberToStringMinute(60 - m) + " to " + numbertoStringHour(h + 1);
        }
    }
    public static String numberToStringMinute(int i){
        switch (i){
            case 1: return "one minute";
            case 2: return "two minutes";
            case 3: return "three minutes";
            case 4: return "four minutes";
            case 5: return "five minutes";
            case 6: return "six minutes";
            case 7: return "seven minutes";
            case 8: return "eight minutes";
            case 9: return "nine minutes";
            case 10: return "ten minutes";
            case 11: return "eleven minutes";
            case 12: return "twelve minutes";
            case 13: return "thirteen minutes";
            case 14: return "fourteen minutes";
            case 15: return "quarter";
            case 16: return "sixteen minutes";
            case 17: return "seventeen minutes";
            case 18: return "eighteen minutes";
            case 19: return "nineteen minutes";
            case 20: return "twenty minutes";
            case 21: return "twenty one minutes";
            case 22: return "twenty two minutes";
            case 23: return "twenty three minutes";
            case 24: return "twenty four minutes";
            case 25: return "twenty five minutes";
            case 26: return "twenty six minutes";
            case 27: return "twenty seven minutes";
            case 28: return "twenty eight minutes";
            case 29: return "twenty nine minutes";
        }
        return "";
    }
    public static String numbertoStringHour(int h){
        switch (h){
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            case 20: return "twenty";
            case 21: return "twenty one";
            case 22: return "twenty two";
            case 23: return "twenty three";
            case 24: return "twenty four";
        }
        return "";
    }
}
