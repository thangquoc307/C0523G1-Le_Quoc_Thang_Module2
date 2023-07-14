package b11_stack_queue.excercise.demergin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class EmployeeManager {
    private static ArrayList manList = new ArrayList();
    private static ArrayList womanList = new ArrayList();
    public static void addEmployee(String name, boolean isMan, String birthday){
        String format = "dd/MM/yyyy";
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(format);
        LocalDate date = LocalDate.parse(birthday, dateFormat);
        if(isMan) {
            manList.add(new Employee(name, isMan, date));
        }else {
            womanList.add(new Employee(name, isMan, date));
        }
    }
    private static void print(ArrayList list){
        for (int i = 0; i < list.size(); i++){
            Employee employee = (Employee) list.get(i);
            System.out.println("Name : " + employee.getName() +
                    "\nSex : " + employee.isMan() + "" +
                    "\nBirthday : " + employee.getBirthday() + "\n");
        }
    }
    private static void sort(ArrayList list){
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) ChronoUnit.DAYS.between(o1.birthday, o2.birthday);
            }
        });
    }
    public static void showAll(){
        System.out.println(womanList);
        System.out.println(manList);
        print(womanList);
        print(manList);
    }
    public static class Employee{
        private String name;
        private boolean isMan;
        private LocalDate birthday;

        public Employee(String name, boolean isMan, LocalDate birthday) {
            this.name = name;
            this.isMan = isMan;
            this.birthday = birthday;
        }

        public String getName() {
            return name;
        }

        public String isMan() {
            return isMan ? "Man" : "Woman" ;
        }

        public String getBirthday() {
            return birthday.toString();
        }
    }
}
