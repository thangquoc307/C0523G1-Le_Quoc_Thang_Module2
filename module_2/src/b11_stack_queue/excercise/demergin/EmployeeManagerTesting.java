package b11_stack_queue.excercise.demergin;

public class EmployeeManagerTesting {
    public static void main(String[] args) {
        EmployeeManager.addEmployee("Mai Cơn Chắc Thắng", true, "30/07/1994");
        EmployeeManager.addEmployee("Lê Ô Na Đơ Văn Thắng", true, "30/02/2001");
        EmployeeManager.addEmployee("Chờ Rít Ti A Nô Thắng", false, "21/05/1990");
        EmployeeManager.addEmployee("Ba Rẳc Ô Ba Thắng", false, "10/04/2005");
        EmployeeManager.addEmployee("Kim Di Thắng", true, "01/01/2025");

        EmployeeManager.showAll();

    }
}