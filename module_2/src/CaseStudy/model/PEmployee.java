package CaseStudy.model;

import java.util.Date;

public class PEmployee extends Person{
    private String education;
    private String position;
    private Double salary;
    public PEmployee(String codeID, String name, Date birthday, boolean isman, String iDCard, String telephone, String email, String education, String position, Double salary) {
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
}
