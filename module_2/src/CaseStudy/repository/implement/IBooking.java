package CaseStudy.repository.implement;

import CaseStudy.model.Booking;

import java.util.ArrayList;

public interface IBooking {
    void createBooking(ArrayList<Booking> bookingList);
    ArrayList<Booking> displayBooking();
}
