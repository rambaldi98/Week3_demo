public class Main {
    public static void main(String[] args) {
        EmployeeManager kieuanh = new EmployeeManager();
        Employee[] employees = new Employee[5];
        employees[0] = new FullTimeEmployee("NV1", "n1", "01", "A2", 24, 12, 2, 2000);
        employees[1] = new FullTimeEmployee("NV2", "n1", "01", "A2", 24, 12, 2, 2000);
        employees[2] = new FullTimeEmployee("NV3", "n1", "01", "A2", 24, 12, 2, 2000);
        employees[3] = new PartimeEmployee("NV4", "n1", "01", "A2", 26, 2);
        employees[4] = new PartimeEmployee("NV5", "n1", "01", "A2", 26, 2);
        kieuanh.setEmployees(employees);
        System.out.println(kieuanh.getFullTimeLowerAVG());



    }
}
