package CaseStudy.utils;

import java.time.LocalDate;

public class CheckAge {
    public static LocalDate stringToDate(String day){
        String[] list = day.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(list[2]), Integer.parseInt(list[1]), Integer.parseInt(list[0]));
        return localDate;
    }
    public static boolean checkAge(LocalDate birthday){
        LocalDate referenceTime = LocalDate.now().minusYears(18);
        return referenceTime.isAfter(birthday);
    }
}
