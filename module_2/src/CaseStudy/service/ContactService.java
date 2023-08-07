package CaseStudy.service;
import CaseStudy.model.Contractor;
import CaseStudy.repository.BookingRepository;
import CaseStudy.repository.ContactRepository;
import CaseStudy.service.implement.IContact;
import CaseStudy.utils.EditContractor;
import CaseStudy.utils.ReadAndWriteData;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactService implements IContact {
    @Override
    public void displayAllContract() {
        ContactRepository contactRepository = new ContactRepository();
        ArrayList<Contractor> contractorList = contactRepository.displayAllContract();
        for (Contractor contractor : contractorList){
            System.out.println(contractor);
        }
    }
    @Override
    public void editContract() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào ID hợp động muốn thay đổi");
        String idContractor = scanner.nextLine().toUpperCase();

        BookingRepository bookingRepository = new BookingRepository();
        ArrayList<CaseStudy.model.Booking> bookingList = bookingRepository.displayBooking();
        ContactRepository contactRepository = new ContactRepository();
        ArrayList<Contractor> contractorList = contactRepository.displayAllContract();

        int indexContract = getContractorByCode(contractorList, idContractor);
        if (indexContract == -1){
            System.out.println("Không tìm thấy hợp đồng có mã : " + idContractor);
            return;
        } else {
            Contractor currentContractor = contractorList.get(indexContract);
            String bookingCode = currentContractor.getBookingCode();
            BookingService bookingService = new BookingService();
            int indexBooking = bookingService.getBookingByCode(bookingList, bookingCode);
            CaseStudy.model.Booking currentBooking = bookingList.get(indexBooking);

            ArrayList result = EditContractor.editContractor(currentBooking);
            if (result.size() == 0){
                return;
            } else {
                ReadAndWriteData readAndWriteData = new ReadAndWriteData();
                bookingList.set(indexBooking, (CaseStudy.model.Booking) result.get(0));
                contractorList.set(indexContract, (Contractor) result.get(1));

                ArrayList<String> dataStringBooking = new ArrayList<>();
                ArrayList<String> dataStringContractor = new ArrayList<>();

                for (CaseStudy.model.Booking booking : bookingList){
                    dataStringBooking.add(booking.toSave());
                }
                for (Contractor contractor : contractorList){
                    dataStringContractor.add(contractor.toSave());
                }

                readAndWriteData.write("CaseStudy/data/booking.csv", dataStringBooking, false);
                readAndWriteData.write("CaseStudy/data/contractor.csv", dataStringContractor, false);
            }
        }
    }
    private int getContractorByCode(ArrayList<Contractor> list, String code){
        for(int i = 0; i < list.size(); i++){
            if (code.equals(list.get(i).getContractorCode())){
                return i;
            }
        }
        return -1;
    }
}
