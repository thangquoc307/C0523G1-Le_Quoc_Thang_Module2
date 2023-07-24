package CaseStudy.repository;

import CaseStudy.model.Contractor;

import java.util.ArrayList;

public interface IContactRepository {
    ArrayList<Contractor> displayAllContract();
    void editContract(String contractId, Contractor contractor);

}
