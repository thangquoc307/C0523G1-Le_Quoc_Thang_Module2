package CaseStudy.model;

public interface IFacility {
    String toStringForSave();
    String getType();
    String getServiceCode();
    String getServiceName();
    Double serviceFeePerDay();
}
