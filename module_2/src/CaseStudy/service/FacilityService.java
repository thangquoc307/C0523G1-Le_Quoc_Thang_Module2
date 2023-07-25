package CaseStudy.service;

import CaseStudy.model.*;
import CaseStudy.repository.FacilityRepository;
import CaseStudy.utils.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FacilityService implements IFacilityService{
    FacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public void displayFacility() {
        ArrayList<IFacility> facilitiesList = facilityRepository.displayFacility();
        for (IFacility element : facilitiesList){
            System.out.println(element);
        }
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
            if (indexOfID(id) != -1){
                System.out.println("ID " + id + " đã sử dụng, mời kiếm cái ID khác nghe");
            }
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
                ArrayList<IFacility> facilitiesList = new ArrayList<>();
                facilitiesList.add(facility);
                facilityRepository.addNewFacility(facilitiesList, true);
                return;
            }
        }
    }
    @Override
    public void displayFacilityNeedMaintenance() {
        facilityRepository.displayFacilityNeedMaintenance();
    }
    @Override
    public void deleteFacility() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã công trình bạn muốn xóa");
        String id = scanner.nextLine().toUpperCase();
        int index = indexOfID(id);
        if (index == -1){
            System.out.println("Làm gì có công trình nào mã " + id + " ba");
        } else {
            facilityRepository.deleteFacility(index);
        }
    }

    @Override
    public void markMaintainedFacility() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào mã phòng bảo trì");
        String builtCode = scanner.nextLine().toUpperCase();
        LocalDate date;

        IFacility facility = facilityRepository.getFacilityById(builtCode);
        if (facility == null){
            System.out.println("Làm gì có phòng nào có mã " + builtCode + " bà noại");
            return;
        } else {
            while (true) {
                System.out.println("Mời nhập vào ngày bảo trì DD/MM/YYYY");
                String stringDate = scanner.nextLine();
                if (!CheckCode.time(stringDate)){
                    break;
                }
                date = CheckDate.stringToDate(stringDate);
                facilityRepository.markMaintainedFacility(builtCode, date);
                return;
            }
        }
    }

    private int indexOfID(String id){
        ArrayList<IFacility> facilitiesList = facilityRepository.displayFacility();
        int index = -1;
        for (int i = 0; i < facilitiesList.size(); i++){
            if (facilitiesList.get(i).getServiceCode().equals(id)){
                index = i;
            }
        }
        return index;
    }
}
