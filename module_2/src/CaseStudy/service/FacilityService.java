package CaseStudy.service;

import CaseStudy.model.House;
import CaseStudy.model.IFacility;
import CaseStudy.model.Room;
import CaseStudy.model.Villa;
import CaseStudy.repository.FacilityRepository;
import CaseStudy.utils.CheckCode;
import CaseStudy.utils.CreatHouse;
import CaseStudy.utils.CreateRoom;
import CaseStudy.utils.CreateVilla;

import java.util.Scanner;

public class FacilityService implements IFacilityService{
    FacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public void displayFacility() {

    }

    @Override
    public void addNewFacility() {
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true){
            System.out.println("Mời nhập vào ID dịch vụ : SVXX-YYYY");
            System.out.println("XX: VL nếu là Villa");
            System.out.println("XX: HO nếu là House");
            System.out.println("XX: RO nếu là Room");
            System.out.println("YYYY: Y là chữ số từ 0-9");
            System.out.println("Please nhập : ");
            id = scanner.nextLine().toUpperCase();
            IFacility facility = null;
            Boolean save = false;

            switch (CheckCode.checkFacility(id)){
                case 0:
                    facility = CreateVilla.createVilla(id);
                    facility = (Villa) facility;
                    save = true;
                    break;
                case 1:
                    facility = CreatHouse.createHouse(id);
                    facility = (House) facility;
                    save = true;
                    break;
                case 2:
                    facility = CreateRoom.createRoom(id);
                    facility = (Room) facility;
                    save = true;
                    break;
                default:
                    System.out.println("Nhập sai format rồi ba");
                    break;
            }
            if (save){
                facilityRepository.addNewFacility(facility);
                return;
            }
        }
    }

    @Override
    public void displayFacilityNeedMaintenance() {

    }

    @Override
    public void deleteFacility() {

    }
}
