package CaseStudy.model;

import java.io.Serializable;
import java.time.LocalDate;

abstract class Person implements Serializable {
    protected String codeID;
    protected String Name;
    protected LocalDate birthday;
    protected boolean isman;
    protected String iDCard;
    protected String telephone;
    protected String email;

    public Person(String codeID, String name, LocalDate birthday, boolean isman, String iDCard, String telephone, String email) {
        this.codeID = codeID;
        Name = name;
        this.birthday = birthday;
        this.isman = isman;
        this.iDCard = iDCard;
        this.telephone = telephone;
        this.email = email;
    }

    public Person(String codeID) {
        this.codeID = codeID;
    }

    public String getCodeID() {
        return codeID;
    }

    public void setCodeID(String codeID) {
        this.codeID = codeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isIsman() {
        return isman;
    }

    public void setIsman(boolean isman) {
        this.isman = isman;
    }

    public String getiDCard() {
        return iDCard;
    }

    public void setiDCard(String iDCard) {
        this.iDCard = iDCard;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
