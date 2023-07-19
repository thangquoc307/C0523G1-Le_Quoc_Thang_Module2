package CaseStudy.model;

public class FHouse extends Facility{
    private String standard;
    private int level;
    public FHouse(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType, int usedTime, String standard, int level) {
        super(serviceCode, serviceName, area, price, capacity, rentType, usedTime);
        this.standard = standard;
        this.level = level;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
