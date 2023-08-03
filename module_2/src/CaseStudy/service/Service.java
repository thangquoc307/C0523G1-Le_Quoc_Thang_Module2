package CaseStudy.service;

import CaseStudy.service.implement.IService;

import java.util.ArrayList;

public class Service implements IService {
    @Override
    public void display(ArrayList<?> list) {
        for(Object element : list){
            System.out.println(element);
        }
    }

    @Override
    public void bookingVilla() {

    }

    @Override
    public void bookingHouse() {

    }

    @Override
    public void bookingRoom() {

    }

    @Override
    public void displayBookingList() {

    }

    @Override
    public void createNewContracts() {

    }

    @Override
    public void displayListContracts() {

    }

    @Override
    public void editContractor() {

    }

    @Override
    public void displayCustomerUseService() {

    }

    @Override
    public void displayCustomerGetVoucher() {

    }


}
