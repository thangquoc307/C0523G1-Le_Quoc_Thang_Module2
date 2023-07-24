package CaseStudy.model;
import CaseStudy.utils.ReadAndWriteData;
import CaseStudy.utils.RoundDouble;

public class House extends Facility{
    private String standard;
    private int level;
    public static String type = "House";

    public House(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType, String standard, int level) {
        super(serviceCode, serviceName, area, price, capacity, rentType);
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
                standard + ReadAndWriteData.SPLITKEY +
                level + ReadAndWriteData.SPLITKEY;
    }
    @Override
    public String getType() {
        return type;
    }

    public String toString() {
        return
                "Nhà ở " + serviceCode +"\n" +
                "- Mô tả : " + serviceName +"\n" +
                "- Diện tích sử dụng : " + area + " m2" + "\n" +
                "- Giá : " + RoundDouble.roundDouble(price) + " VND/" + rentType + "\n" +
                "- Sức chứa : " + capacity + " Người" +"\n" +
                "- Tiêu chuẩn : " + standard +"\n" +
                "- Số tầng : " + level;
    }
}
