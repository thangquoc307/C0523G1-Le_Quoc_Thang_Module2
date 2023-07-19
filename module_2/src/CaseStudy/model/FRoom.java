package CaseStudy.model;

public class FRoom extends Facility{
    private String freeService;
    public FRoom(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType, int usedTime, String freeService) {
        super(serviceCode, serviceName, area, price, capacity, rentType, usedTime);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
