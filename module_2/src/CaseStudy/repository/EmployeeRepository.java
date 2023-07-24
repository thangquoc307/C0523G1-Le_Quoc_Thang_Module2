package CaseStudy.repository;
import CaseStudy.model.Employee;
import CaseStudy.utils.ReadAndWriteData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Pattern;
public class EmployeeRepository implements IEmployeeRepository{
    private String link = "CaseStudy/data/employee.csv";
    private ReadAndWriteData readAndWriteData = new ReadAndWriteData();
    @Override
    public void addEmployee(Employee employee){
        ArrayList<String> list = new ArrayList<>();
        String string = "";
        string = employee.getCodeID() + ReadAndWriteData.SPLITKEY
                + employee.getName() + ReadAndWriteData.SPLITKEY
                + employee.getBirthday() + ReadAndWriteData.SPLITKEY
                + employee.isIsman() + ReadAndWriteData.SPLITKEY
                + employee.getiDCard() + ReadAndWriteData.SPLITKEY
                + employee.getTelephone() + ReadAndWriteData.SPLITKEY
                + employee.getEmail() + ReadAndWriteData.SPLITKEY
                + employee.getEducation() + ReadAndWriteData.SPLITKEY
                + employee.getPosition() + ReadAndWriteData.SPLITKEY
                + employee.getSalary();
        list.add(string);
        readAndWriteData.write(link, list, true);
    }
    @Override
    public ArrayList<Employee> getEmployee(){
        ArrayList<String> stringList = readAndWriteData.read(link);
        ArrayList<Employee> employeeList = new ArrayList<>();
        for(String string : stringList){
            String[]list = string.split(ReadAndWriteData.SPLITKEYREGEX);
            employeeList.add(new Employee(list[0], list[1], LocalDate.parse(list[2]), Boolean.parseBoolean(list[3]), list[4], list[5], list[6], list[7], list[8], Double.parseDouble(list[9])));
        }
        return employeeList;
    }
    @Override
    public int findEmployeeById(String idCode){
        ArrayList<Employee> employeesList = getEmployee();
        return employeesList.indexOf(new Employee(idCode));
    }
    @Override
    public ArrayList<Employee> findEmployeeByName(String name){
        ArrayList<Employee> employeeList = getEmployee();
        ArrayList<Employee> employeeSearchList = new ArrayList<>();
        String regex = "^.*" + name.toLowerCase() + ".*$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < employeeList.size(); i++){
            Boolean check = pattern.matcher(employeeList.get(i).getName().toLowerCase()).matches();
            if (check){
                employeeSearchList.add(employeeList.get(i));
            }
        }
        return employeeSearchList;
    }
    @Override
    public void editEmployee(int index, Employee employee) {
        ArrayList<Employee> employeesList = getEmployee();
        employeesList.set(index, employee);
        updateEmployee(employeesList);
    }

    @Override
    public void deleteEmployee(int index) {
        ArrayList<Employee> employeesList = getEmployee();
        employeesList.remove(index);
        updateEmployee(employeesList);
    }

    private void updateEmployee(ArrayList<Employee> employeesList){
        ArrayList<String> list = new ArrayList<>();
        String string = "";
        for (Employee employeeData : employeesList) {
            string = employeeData.getCodeID() + ReadAndWriteData.SPLITKEY
                    + employeeData.getName() + ReadAndWriteData.SPLITKEY
                    + employeeData.getBirthday() + ReadAndWriteData.SPLITKEY
                    + employeeData.isIsman() + ReadAndWriteData.SPLITKEY
                    + employeeData.getiDCard() + ReadAndWriteData.SPLITKEY
                    + employeeData.getTelephone() + ReadAndWriteData.SPLITKEY
                    + employeeData.getEmail() + ReadAndWriteData.SPLITKEY
                    + employeeData.getEducation() + ReadAndWriteData.SPLITKEY
                    + employeeData.getPosition() + ReadAndWriteData.SPLITKEY
                    + employeeData.getSalary();
            list.add(string);
        }
        readAndWriteData.write(link, list, false);
    }

}
