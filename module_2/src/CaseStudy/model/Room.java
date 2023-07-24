package CaseStudy.model;
import CaseStudy.utils.ReadAndWriteData;
import CaseStudy.utils.RoundDouble;

public class Room extends Facility{
    private String freeService;
    public static String type = "Room";

    public Room(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType, String freeService) {
        super(serviceCode, serviceName, area, price, capacity, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toStringForSave() {
        return
                type + ReadAndWriteData.SPLITKEY +
                serviceCode + ReadAndWriteData.SPLITKEY +
                serviceName + ReadAndWriteData.SPLITKEY +
                area + ReadAndWriteData.SPLITKEY +
                price + ReadAndWriteData.SPLITKEY +
                capacity + ReadAndWriteData.SPLITKEY +
                rentType + ReadAndWriteData.SPLITKEY +
                freeService + ReadAndWriteData.SPLITKEY;
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return
                "Phòng " + serviceCode +"\n" +
                "- Mô tả : " + serviceName +"\n" +
                "- Diện tích sử dụng : " + area + " m2" +"\n" +
                "- Giá : " + RoundDouble.roundDouble(price) + " VND/" + rentType + "\n" +
                "- Sức chứa : " + capacity + " Người" +"\n" +
                "- Dịch vụ tặng kèm : " + freeService;
    }
}
