package CaseStudy.repository;

import CaseStudy.model.IFacility;
import CaseStudy.utils.ReadAndWriteData;

import java.util.ArrayList;

public class FacilityRepository implements IFacilityRepository{
    public static final String villaLink = "CaseStudy/data/villa.csv";
    public static final String houseLink = "CaseStudy/data/house.csv";
    public static final String roomLink = "CaseStudy/data/room.csv";
    @Override
    public void displayFacility(int index) {

    }

    @Override
    public void addNewFacility(IFacility element) {
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        ArrayList<String> list = new ArrayList<>();
        String link = "";
        System.out.println(element.getType());
        switch (element.getType()){
            case "Villa":
                link = villaLink;
                break;
            case "House":
                link = houseLink;
                break;
            case "Room":
                link = roomLink;
                break;
        }
        list.add(element.toStringForSave());
        readAndWriteData.write(link, list, true);
    }

    @Override
    public void displayFacilityNeedMaintenance() {

    }

    @Override
    public void deleteFacility(int index) {

    }
}
