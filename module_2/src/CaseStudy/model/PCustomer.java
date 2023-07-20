package CaseStudy.model;

import java.time.LocalDate;

public class PCustomer extends Person{
    private String customerType;
    private String adress;
    public PCustomer(String codeID, String name, LocalDate birthday, boolean isman, String iDCard, String telephone, String email, String customerType, String adress) {
        super(codeID, name, birthday, isman, iDCard, telephone, email);
        this.customerType = customerType;
        this.adress = adress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
