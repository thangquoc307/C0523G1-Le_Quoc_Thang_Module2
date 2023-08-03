package CaseStudy.repository;

import CaseStudy.repository.implement.IBooking;
import CaseStudy.utils.ReadAndWriteData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Booking implements IBooking {
    private static String linkBooking = "CaseStudy/data/booking.csv";
    @Override
    public void createBooking(ArrayList<CaseStudy.model.Booking> bookingList) {
        ArrayList<String> stringList = new ArrayList<>();
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        for (CaseStudy.model.Booking booking : bookingList){
            stringList.add(booking.toSave());
        }
        readAndWriteData.write(linkBooking, stringList, true);
    }
    @Override
    public ArrayList<CaseStudy.model.Booking> displayBooking() {
        String linkBooking = "CaseStudy/data/booking.csv";

        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        ArrayList<CaseStudy.model.Booking> bookingList = new ArrayList<>();
        ArrayList<String> dataBooking = readAndWriteData.read(linkBooking);
        for (String string : dataBooking){
            String[] stringList = string.split(ReadAndWriteData.SPLITKEYREGEX);
            bookingList.add(new CaseStudy.model.Booking(stringList[0], LocalDate.parse(stringList[1]), LocalDate.parse(stringList[2]), stringList[3], stringList[4]));
        }
        Collections.sort(bookingList, new Comparator<CaseStudy.model.Booking>() {
            @Override
            public int compare(CaseStudy.model.Booking o1, CaseStudy.model.Booking o2) {
                if (o1.getCheckInDate().equals(o2.getCheckInDate())){
                    if (o1.getCheckOutDate().isAfter(o2.getCheckOutDate())){
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (o1.getCheckInDate().isAfter(o2.getCheckInDate())) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return bookingList;
    }
    public ArrayList<CaseStudy.model.Booking> customDisplayBooking(String typeDisplay) {
        ArrayList<CaseStudy.model.Booking> allBooking = displayBooking();
        ArrayList<CaseStudy.model.Booking> customBooking = new ArrayList<>();
        for (CaseStudy.model.Booking booking : allBooking){
            String type = booking.getServiceCode().substring(2,4);
            if (type.equals(typeDisplay)){
                customBooking.add(booking);
            }
        }
        return customBooking;
    }
}