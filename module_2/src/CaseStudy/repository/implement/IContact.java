package CaseStudy.repository.implement;

import CaseStudy.model.Contractor;

import java.util.ArrayList;

public interface IContact {
    ArrayList<Contractor> displayAllContract();
    void editContract(String contractId, Contractor contractor);

}
