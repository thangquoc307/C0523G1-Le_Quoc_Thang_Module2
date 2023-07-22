package CaseStudy.repository;

import CaseStudy.model.IFacility;

public interface IFacilityRepository {
    void displayFacility(int index);
    void addNewFacility(IFacility element);
    void displayFacilityNeedMaintenance();
    void deleteFacility(int index);
}
