package CaseStudy.model;

public class FVilla extends Facility{
    private String standard;
    private Double poorArea;
    private int level;

    public FVilla(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType, int usedTime, String standard, Double poorArea, int level) {
        super(serviceCode, serviceName, area, price, capacity, rentType, usedTime);
        this.standard = standard;
        this.level = level;
        this.poorArea = poorArea;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Double getPoorArea() {
        return poorArea;
    }

    public void setPoorArea(Double poorArea) {
        this.poorArea = poorArea;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
