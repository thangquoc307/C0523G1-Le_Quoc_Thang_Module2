package CaseStudy.model;
import java.util.Objects;
abstract class Facility implements IFacility {
    protected String serviceCode;
    protected String serviceName;
    protected Double area;
    protected Double price;
    protected int capacity;
    protected String rentType;
    public Facility(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.capacity = capacity;
        this.rentType = rentType;
    }
    public Facility(String serviceCode){
        this.serviceCode = serviceCode;
    };
    public String toStringForSave(){
        return null;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(serviceCode, facility.serviceCode);
    }

    @Override
    public Double serviceFeePerDay() {
        switch (rentType){
            case "Năm":
                return price / 365;
            case "Tháng":
                return price / 30;
            case "Ngày":
                return price / 1;
            case "Giờ":
                return price * 24;
            default:
                return 0.0;
        }
    }
}
