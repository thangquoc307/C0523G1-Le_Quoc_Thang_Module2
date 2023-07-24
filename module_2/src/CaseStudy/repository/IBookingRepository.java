package CaseStudy.repository;

import CaseStudy.model.Booking;

import java.util.ArrayList;

public interface IBookingRepository {
    void createBooking(ArrayList<Booking> bookingList);
    ArrayList<Booking> displayBooking();
}
