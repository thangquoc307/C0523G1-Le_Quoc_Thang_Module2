package CaseStudy.repository;

import CaseStudy.model.PCustomer;

import java.util.ArrayList;

public class CustomerRepository implements ICustomerRepository{
    private Repository repository = new Repository();
    private String link = "CaseStudy/data/customer.csv";
    public void addCustomer(PCustomer customer){
        ArrayList<String> list = new ArrayList<>();
        String string = "";
        string = customer.getCodeID() + Repository.SPLITKEY
                + customer.getName() + Repository.SPLITKEY
                + customer.getBirthday().getDayOfMonth() + "/" + customer.getBirthday().getMonth() + "/" + customer.getBirthday().getYear() + Repository.SPLITKEY
                + customer.isIsman() + Repository.SPLITKEY
                + customer.getiDCard() + Repository.SPLITKEY
                + customer.getTelephone() + Repository.SPLITKEY
                + customer.getEmail() + Repository.SPLITKEY
                + customer.getCustomerType() + Repository.SPLITKEY
                + customer.getAdress();
        list.add(string);
        repository.write(link, list);
    }
}
