package CaseStudy.model;
import CaseStudy.utils.ReadAndWriteData;
import java.time.LocalDate;
import java.util.Objects;
public class Booking{
    protected String bookingCode;
    protected LocalDate checkInDate;
    protected LocalDate checkOutDate;
    protected String customerCode;
    protected String serviceCode;

    public Booking(String bookingCode, LocalDate checkInDate, LocalDate checkOutDate, String customerCode, String serviceCode) {
        this.bookingCode = bookingCode;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
    }

    public Booking(String serviceCode) {
        this.serviceCode = serviceCode;
    }
    public Booking() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(serviceCode, booking.serviceCode);
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "(" + checkInDate + " - " + checkOutDate + ") " + serviceCode + " : " + customerCode;
    }
    public String toSave(){
        return bookingCode + ReadAndWriteData.SPLITKEY +
                checkInDate + ReadAndWriteData.SPLITKEY +
                checkOutDate + ReadAndWriteData.SPLITKEY +
                customerCode + ReadAndWriteData.SPLITKEY +
                serviceCode;
    }
}
