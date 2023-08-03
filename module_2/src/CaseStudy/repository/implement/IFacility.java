package CaseStudy.repository.implement;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IFacility {
    ArrayList<CaseStudy.model.IFacility> displayFacility();
    ArrayList<CaseStudy.model.IFacility> displayVilla();
    ArrayList<CaseStudy.model.IFacility> displayHouse();
    ArrayList<CaseStudy.model.IFacility> displayRoom();
    void addNewFacility(ArrayList<CaseStudy.model.IFacility> elementList, Boolean append);
    void displayFacilityNeedMaintenance();
    void deleteFacility(int index);
    public CaseStudy.model.IFacility getFacilityById(String idCode);
    void markMaintainedFacility(String facilityId, LocalDate date);
}
