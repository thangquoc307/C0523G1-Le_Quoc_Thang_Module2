package CaseStudy.repository;
import CaseStudy.model.House;
import CaseStudy.model.Room;
import CaseStudy.model.Villa;
import CaseStudy.repository.implement.IFacility;
import CaseStudy.utils.CheckMaintainance;
import CaseStudy.utils.ReadAndWriteData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FacilityRepository implements IFacility {
    public static final String villaLink = "CaseStudy/data/villa.csv";
    public static final String houseLink = "CaseStudy/data/house.csv";
    public static final String roomLink = "CaseStudy/data/room.csv";
    @Override
    public ArrayList<CaseStudy.model.IFacility> displayFacility() {
        ArrayList<CaseStudy.model.IFacility> facilitieList = new ArrayList<>();
        facilitieList.addAll(displayVilla());
        facilitieList.addAll(displayHouse());
        facilitieList.addAll(displayRoom());
        return facilitieList;
    }
    @Override
    public ArrayList<CaseStudy.model.IFacility> displayVilla() {
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        ArrayList<CaseStudy.model.IFacility> facilitieList = new ArrayList<>();
        ArrayList<String> dataStringVilla = readAndWriteData.read(villaLink);
        for (String dataVilla : dataStringVilla){
            String[] text = dataVilla.split(ReadAndWriteData.SPLITKEYREGEX);
            facilitieList.add(new Villa(text[1], text[2], Double.parseDouble(text[3]), Double.parseDouble(text[4]), Integer.parseInt(text[5]), text[6], text[7], Double.parseDouble(text[8]), Integer.parseInt(text[9])));
        }
        return facilitieList;
    }
    @Override
    public ArrayList<CaseStudy.model.IFacility> displayHouse() {
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        ArrayList<CaseStudy.model.IFacility> facilitieList = new ArrayList<>();
        ArrayList<String> dataStringHouse = readAndWriteData.read(houseLink);
        for (String dataHouse : dataStringHouse){
            String[] text = dataHouse.split(ReadAndWriteData.SPLITKEYREGEX);
            facilitieList.add(new House(text[1], text[2], Double.parseDouble(text[3]), Double.parseDouble(text[4]), Integer.parseInt(text[5]), text[6], text[7], Integer.parseInt(text[8])));
        }
        return facilitieList;
    }
    @Override
    public ArrayList<CaseStudy.model.IFacility> displayRoom() {
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        ArrayList<CaseStudy.model.IFacility> facilitieList = new ArrayList<>();
        ArrayList<String> dataStringRoom = readAndWriteData.read(roomLink);
        for (String dataRoom : dataStringRoom){
            String[] text = dataRoom.split(ReadAndWriteData.SPLITKEYREGEX);
            facilitieList.add(new Room(text[1], text[2], Double.parseDouble(text[3]), Double.parseDouble(text[4]), Integer.parseInt(text[5]), text[6], text[7]));
        }
        return facilitieList;
    }
    @Override
    public void addNewFacility(ArrayList<CaseStudy.model.IFacility> elementList, Boolean append) {
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        ArrayList<String> stringVilla = new ArrayList<>();
        ArrayList<String> stringHouse = new ArrayList<>();
        ArrayList<String> stringRoom = new ArrayList<>();

        for(CaseStudy.model.IFacility building : elementList) {
            switch (building.getType()) {
                case "Villa":
                    stringVilla.add(building.toStringForSave());
                    break;
                case "House":
                    stringHouse.add(building.toStringForSave());
                    break;
                case "Room":
                    stringRoom.add(building.toStringForSave());
                    break;
            }
        }
        readAndWriteData.write(villaLink, stringVilla, append);
        readAndWriteData.write(houseLink, stringHouse, append);
        readAndWriteData.write(roomLink, stringRoom, append);
    }
    @Override
    public void displayFacilityNeedMaintenance() {
        CheckMaintainance.checkMaintainance();
    }
    @Override
    public void deleteFacility(int index) {
        ArrayList<CaseStudy.model.IFacility> facilities = displayFacility();
        facilities.remove(index);
        addNewFacility(facilities, false);
    }
    @Override
    public CaseStudy.model.IFacility getFacilityById(String idCode){
        ArrayList<CaseStudy.model.IFacility> facilities = displayFacility();
        for (int i = 0; i < facilities.size(); i++){
            if (idCode.equals(facilities.get(i).getServiceCode())){
                return facilities.get(i);
            }
        }
        return null;
    }

    @Override
    public void markMaintainedFacility(String facilityId, LocalDate date) {
        Map<String, LocalDate> maintainanceHistory = getMaintainanceHistory();
        maintainanceHistory.put(facilityId, date);

        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String key : maintainanceHistory.keySet()){
            stringArrayList.add(key + ReadAndWriteData.SPLITKEY + maintainanceHistory.get(key));
        }
        readAndWriteData.write("CaseStudy/data/maintenance.csv", stringArrayList, false);
    }
    public Map<String, LocalDate> getMaintainanceHistory(){
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        Map<String, LocalDate> mapMaintainance = new HashMap<>();
        ArrayList<String> dataMaintainance = readAndWriteData.read("CaseStudy/data/maintenance.csv");
        for (String string : dataMaintainance){
            String[] list = string.split(ReadAndWriteData.SPLITKEYREGEX);
            mapMaintainance.put(list[0], LocalDate.parse(list[1]));
        }
        return mapMaintainance;
    }
}
