package CaseStudy.model;

import java.time.LocalDate;
import java.util.Objects;
public class Customer extends Person{
    private String customerType;
    private String adress;
    public Customer(String codeID, String name, LocalDate birthday, boolean isman, String iDCard, String telephone, String email, String customerType, String adress) {
        super(codeID, name, birthday, isman, iDCard, telephone, email);
        this.customerType = customerType;
        this.adress = adress;
    }

    public Customer(String codeID) {
        super(codeID);
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(codeID, customer.codeID);
    }

    @Override
    public String toString() {
        return
        "ID : " + codeID + " - " + Name + "\n" +
                " - Căn cước công dân : " + iDCard + "\n" +
                " - Xếp hạng : " + customerType + "\n" +
                " - Giới tính : " + (isman ? "Nam" : "Nữ") + "\n" +
                " - Năm sinh : " + birthday + "\n" +
                " - Điện thoại : " + telephone + "\n" +
                " - Email : " + email + "\n" +
                " - Địa chỉ : " + adress;
    }
}
