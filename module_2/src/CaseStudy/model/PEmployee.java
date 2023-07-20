package CaseStudy.model;

import java.time.LocalDate;
import java.util.Objects;

public class PEmployee extends Person{
    private String education;
    private String position;
    private Double salary;
    public PEmployee(String codeID, String name, LocalDate birthday, boolean isman, String iDCard, String telephone, String email, String education, String position, Double salary) {
        super(codeID, name, birthday, isman, iDCard, telephone, email);
        this.education = education;
        this.position = position;
        this.salary = salary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PEmployee pEmployee = (PEmployee) o;
        return Objects.equals(codeID, pEmployee.codeID);
    }

    @Override
    public String toString() {
        return
                "ID : " + codeID + " - " + Name + "\n" +
                " - Căn cước công dân : " + iDCard + "\n" +
                " - Chức vụ : " + position + "\n" +
                " - Học vấn : " + education + "\n" +
                " - Giới tính : " + (isman ? "Nam" : "Nữ") + "\n" +
                " - Năm sinh : " + birthday + "\n" +
                " - Mức lương : " + salary.toString() + " VND\n" +
                " - Điện thoại : " + telephone + " VND\n" +
                " - Email : " + email + " VND\n";
    }
}
