package CaseStudy.repository;
import CaseStudy.model.Customer;
import CaseStudy.utils.ReadAndWriteData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class CustomerRepository implements ICustomerRepository{
    private ReadAndWriteData readAndWriteData = new ReadAndWriteData();
    private String link = "CaseStudy/data/customer.csv";



    public void addCustomer(Customer customer){
        ArrayList<String> list = new ArrayList<>();
        String string = "";
        string = customer.getCodeID() + readAndWriteData.SPLITKEY
                + customer.getName() + readAndWriteData.SPLITKEY
                + customer.getBirthday() + readAndWriteData.SPLITKEY
                + customer.isIsman() + readAndWriteData.SPLITKEY
                + customer.getiDCard() + readAndWriteData.SPLITKEY
                + customer.getTelephone() + readAndWriteData.SPLITKEY
                + customer.getEmail() + readAndWriteData.SPLITKEY
                + customer.getCustomerType() + readAndWriteData.SPLITKEY
                + customer.getAdress();
        list.add(string);
        readAndWriteData.write(link, list, true);
    }
    @Override
    public ArrayList<Customer> getCustomer() {
        ArrayList<String> stringList = readAndWriteData.read(link);
        ArrayList<Customer> customerList = new ArrayList<>();
        for(String string : stringList){
            String[]list = string.split(ReadAndWriteData.SPLITKEYREGEX);
            customerList.add(new Customer(list[0], list[1], LocalDate.parse(list[2]), Boolean.parseBoolean(list[3]), list[4], list[5], list[6], list[7], list[8]));
        }
        return customerList;
    }

    @Override
    public void editCustomer(int index, Customer customer) {
        ArrayList<Customer> customerList = getCustomer();
        customerList.set(index, customer);
        updateCustomer(customerList);
    }

    @Override
    public void deleteCustomer(int index) {
        ArrayList<Customer> customerList = getCustomer();
        customerList.remove(index);
        updateCustomer(customerList);
    }

    @Override
    public int findCustomerById(String idCode) {
        ArrayList<Customer> customerList = getCustomer();
        return customerList.indexOf(new Customer(idCode));
    }
    @Override
    public Customer getCustomerById(String idCode) {
        ArrayList<Customer> customerList = getCustomer();
        int index = customerList.indexOf(new Customer(idCode));
        return customerList.get(index);
    }

    @Override
    public ArrayList<Customer> findCustomerByName(String name) {
        ArrayList<Customer> customerList = getCustomer();
        ArrayList<Customer> customerSearchList = new ArrayList<>();
        String regex = "^.*" + name.toLowerCase() + ".*$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < customerList.size(); i++){
            Boolean check = pattern.matcher(customerList.get(i).getName().toLowerCase()).matches();
            if (check){
                customerSearchList.add(customerList.get(i));
            }
        }
        return customerSearchList;
    }
    private void updateCustomer(ArrayList<Customer> customerList){
        ArrayList<String> list = new ArrayList<>();
        String string = "";
        for (Customer customerData : customerList) {
            string = customerData.getCodeID() + readAndWriteData.SPLITKEY
                    + customerData.getName() + readAndWriteData.SPLITKEY
                    + customerData.getBirthday() + readAndWriteData.SPLITKEY
                    + customerData.isIsman() + readAndWriteData.SPLITKEY
                    + customerData.getiDCard() + readAndWriteData.SPLITKEY
                    + customerData.getTelephone() + readAndWriteData.SPLITKEY
                    + customerData.getEmail() + readAndWriteData.SPLITKEY
                    + customerData.getCustomerType() + readAndWriteData.SPLITKEY
                    + customerData.getAdress();
            list.add(string);
        }
        readAndWriteData.write(link, list, false);
    }
}
