package CaseStudy.utils;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CheckDate {
    public static LocalDate stringToDate(String day){
        String[] list = day.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(list[2]), Integer.parseInt(list[1]), Integer.parseInt(list[0]));
        return localDate;
    }
    public static boolean checkAge(LocalDate birthday){
        LocalDate referenceTime = LocalDate.now().minusYears(18);
        return referenceTime.isAfter(birthday);
    }
    public static boolean checkOverlapTime(LocalDate timeAStart, LocalDate timeAEnd, LocalDate timeBStart, LocalDate timeBEnd){
        Long durationA = ChronoUnit.DAYS.between(timeAStart, timeAEnd);
        Long durationB = ChronoUnit.DAYS.between(timeBStart, timeBEnd);
        LocalDate firstDate;
        LocalDate lastDate;
        if (timeAStart.isBefore(timeBStart)){
            firstDate = timeAStart;
        } else {
            firstDate = timeBStart;
        }
        if (timeAEnd.isAfter(timeBEnd)){
            lastDate = timeAEnd;
        } else {
            lastDate = timeBEnd;
        }
        Long durationAB = ChronoUnit.DAYS.between(firstDate, lastDate);
        return durationAB > durationA + durationB;
    }
}
