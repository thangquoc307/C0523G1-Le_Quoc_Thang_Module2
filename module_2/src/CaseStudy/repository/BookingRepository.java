package CaseStudy.repository;

import CaseStudy.model.Booking;
import CaseStudy.utils.ReadAndWriteData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookingRepository implements IBookingRepository{
    private static String linkBooking = "CaseStudy/data/booking.csv";
    @Override
    public void createBooking(ArrayList<Booking> bookingList) {
        ArrayList<String> stringList = new ArrayList<>();
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        for (Booking booking : bookingList){
            stringList.add(booking.toSave());
        }
        readAndWriteData.write(linkBooking, stringList, true);
    }
    @Override
    public ArrayList<Booking> displayBooking() {
        String linkBooking = "CaseStudy/data/booking.csv";

        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        ArrayList<Booking> bookingList = new ArrayList<>();
        ArrayList<String> dataBooking = readAndWriteData.read(linkBooking);
        for (String string : dataBooking){
            String[] stringList = string.split(ReadAndWriteData.SPLITKEYREGEX);
            bookingList.add(new Booking(stringList[0], LocalDate.parse(stringList[1]), LocalDate.parse(stringList[2]), stringList[3], stringList[4]));
        }
        Collections.sort(bookingList, new Comparator<Booking>() {
            @Override
            public int compare(Booking o1, Booking o2) {
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
    public ArrayList<Booking> customDisplayBooking(String typeDisplay) {
        ArrayList<Booking> allBooking = displayBooking();
        ArrayList<Booking> customBooking = new ArrayList<>();
        for (Booking booking : allBooking){
            String type = booking.getServiceCode().substring(2,4);
            if (type.equals(typeDisplay)){
                customBooking.add(booking);
            }
        }
        return customBooking;
    }
}