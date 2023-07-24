package CaseStudy.repository;

import CaseStudy.model.Contractor;
import CaseStudy.utils.ReadAndWriteData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ContactRepository implements IContactRepository{

    @Override
    public ArrayList<Contractor> displayAllContract() {
        ArrayList<Contractor> contractorList = new ArrayList<>();
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        ArrayList<String> stringList = readAndWriteData.read("CaseStudy/data/contractor.csv");

        for (String string : stringList){
            String[] strings = string.split(ReadAndWriteData.SPLITKEYREGEX);
            contractorList.add(new Contractor(strings[0], LocalDate.parse(strings[1]), LocalDate.parse(strings[2]), strings[3], strings[4], strings[5], Double.parseDouble(strings[6]), Double.parseDouble(strings[6])));
        }
        Collections.sort(contractorList, new Comparator<Contractor>() {
            @Override
            public int compare(Contractor o1, Contractor o2) {
                if (o1.getCheckInDate().equals(o2.getCheckInDate())){
                    if (o1.getCheckOutDate().isBefore(o2.getCheckOutDate())){
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (o1.getCheckInDate().isBefore(o2.getCheckInDate())) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return contractorList;
    }

    @Override
    public void editContract(String contractId, Contractor contractor) {

    }
}
