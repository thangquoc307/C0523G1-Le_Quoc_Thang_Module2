package CaseStudy.model;

import CaseStudy.utils.ReadAndWriteData;

import java.math.BigDecimal;

public class Villa extends Facility{
    private String standard;
    private Double poorArea;
    private int level;
    public static String type = "Villa";

    public Villa(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType, String standard, Double poorArea, int level) {
        super(serviceCode, serviceName, area, price, capacity, rentType);
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
                poorArea + ReadAndWriteData.SPLITKEY +
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
                "- Diện tích sử dụng : " + area + " m2" +"\n" +
                "- Diện tích bể bơi : " + poorArea + " m2" +"\n" +
                "- Giá : " + new BigDecimal(price).toPlainString() + " / " + rentType + "\n" +
                "- Sức chứa : " + capacity + " Người" +"\n" +
                "- Tiêu chuẩn : " + standard +"\n" +
                "- Số tầng : " + level;
    }
}
