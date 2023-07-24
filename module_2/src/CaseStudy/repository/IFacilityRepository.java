package CaseStudy.repository;

import CaseStudy.model.IFacility;

import java.util.ArrayList;

public interface IFacilityRepository {
    ArrayList<IFacility> displayFacility();
    ArrayList<IFacility> displayVilla();
    ArrayList<IFacility> displayHouse();
    ArrayList<IFacility> displayRoom();
    void addNewFacility(ArrayList<IFacility> elementList, Boolean append);
    void displayFacilityNeedMaintenance();
    void deleteFacility(int index);
    public IFacility getFacilityById(String idCode);
}
