package CaseStudy.repository;
import CaseStudy.model.PEmployee;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository{
    private String link = "CaseStudy/data/employee.csv";
    private Repository repository = new Repository();
    public void addEmployee(PEmployee employee){
        ArrayList<String> list = new ArrayList<>();
        String string = "";
        string = employee.getCodeID() + Repository.SPLITKEY
                + employee.getName() + Repository.SPLITKEY
                + employee.getBirthday() + Repository.SPLITKEY
                + employee.isIsman() + Repository.SPLITKEY
                + employee.getiDCard() + Repository.SPLITKEY
                + employee.getTelephone() + Repository.SPLITKEY
                + employee.getEmail() + Repository.SPLITKEY
                + employee.getEducation() + Repository.SPLITKEY
                + employee.getPosition() + Repository.SPLITKEY
                + employee.getSalary();
        list.add(string);
        repository.write(link, list);
    }
    public ArrayList<PEmployee> getEmployee(){
        ArrayList<String> stringList = repository.read(link);
        ArrayList<PEmployee> employeeList = new ArrayList<>();
        for(String string : stringList){
            String[]list = string.split("\\|");
            employeeList.add(new PEmployee(list[0], list[1], LocalDate.parse(list[2]), Boolean.parseBoolean(list[3]), list[4], list[5], list[6], list[7], list[8], Double.parseDouble(list[9])));
        }
        return employeeList;
    }
}
