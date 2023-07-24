package CaseStudy.model;
import CaseStudy.utils.ReadAndWriteData;
import CaseStudy.utils.RoundDouble;
import java.time.LocalDate;
import java.util.Objects;

public class Contractor extends Booking {
    private String contractorCode = "";
    private Double price;
    private Double deposite;

    public Contractor(String bookingCode, LocalDate checkInDate, LocalDate checkOutDate, String customerCode, String serviceCode, String contractorCode, Double price, Double deposite) {
        super(bookingCode, checkInDate, checkOutDate, customerCode, serviceCode);
        this.contractorCode = contractorCode;
        this.price = price;
        this.deposite = deposite;
    }
    public Contractor(String bookingCode, LocalDate checkInDate, LocalDate checkOutDate, String customerCode, String serviceCode, Double price, Double deposite) {
        super(bookingCode, checkInDate, checkOutDate, customerCode, serviceCode);
        this.price = price;
        this.deposite = deposite;

        int count = ReadAndWriteData.readContractorNumber();
        count++;
        contractorCode = "HD-" + (count);
        ReadAndWriteData.writeContractorNumber(count);
    }
    public Contractor(String contractorCode){
        super();
        this.contractorCode = contractorCode;
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
    public String toSave(){
        return
                bookingCode + ReadAndWriteData.SPLITKEY +
                checkInDate + ReadAndWriteData.SPLITKEY +
                checkOutDate + ReadAndWriteData.SPLITKEY +
                customerCode + ReadAndWriteData.SPLITKEY +
                serviceCode + ReadAndWriteData.SPLITKEY +
                contractorCode + ReadAndWriteData.SPLITKEY +
                price + ReadAndWriteData.SPLITKEY +
                deposite + ReadAndWriteData.SPLITKEY;
    }

    @Override
    public String toString() {
        return "Hợp đồng " + contractorCode + "\n" +
                "- Mã dịch vụ : " + serviceCode + "\n" +
                "- Mã khách hàng : " + customerCode + "\n" +
                "- Mã Booking : " + bookingCode + "\n" +
                "- Thời gian : " + checkInDate + " - " + checkOutDate + "\n" +
                "- Tổng chi phí :" + RoundDouble.roundDouble(price) + " VND\n" +
                "- Cọc trước :" + RoundDouble.roundDouble(deposite) + " VND";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Contractor that = (Contractor) o;
        return Objects.equals(contractorCode, that.contractorCode);
    }
}
