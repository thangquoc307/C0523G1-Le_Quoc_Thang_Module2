package CaseStudy.model;

import java.util.Date;

public class Contractor extends Booking {
    private String contractorCode;
    private Double price;
    private Double deposite;

    public Contractor(String bookingCode, Date bookingDate, Date checkInDate, Date checkOutDate, String customerCode, String serviceCode, String contractorCode, Double price, Double deposite) {
        super(bookingCode, bookingDate, checkInDate, checkOutDate, customerCode, serviceCode);
        this.contractorCode = contractorCode;
        this.price = price;
        this.deposite = deposite;
    }

    public String getContractorCode() {
        return contractorCode;
    }

    public void setContractorCode(String contractorCode) {
        this.contractorCode = contractorCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDeposite() {
        return deposite;
    }

    public void setDeposite(Double deposite) {
        this.deposite = deposite;
    }
}
