public class EmployeeManager {
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void getInforAllEmployee(){
        for (Employee e: employees
             ) {
            System.out.println(e.toString());
        }
    }

    public FullTimeEmployee[] getAllFullTime(){
        FullTimeEmployee[] fullTimeEmployee = new FullTimeEmployee[employees.length];
        int count = 0;
        for (Employee e: employees
             ) {
            if (e instanceof FullTimeEmployee){
                fullTimeEmployee[count]= (FullTimeEmployee) e;
                count++;
            }
        }
        return fullTimeEmployee;
    }

    public double getAVG(){
        int sum = 0;
        int count=0;
        for (Employee e: employees
             ) {
            if (e != null){
                sum += e.getSalaryOfEmployee();
                count++;
            }
        }
        return sum/count;
    }

    public FullTimeEmployee[] getFullTimeLowerAVG(){
        //lay danh sach nv fulltime
        FullTimeEmployee[] fullTimeEmployees = this.getAllFullTime();
        //tinh trung binh luong
        double avg = this.getAVG();
        // khai bao ds tra ve
        FullTimeEmployee[] fullTimeEmployee = new FullTimeEmployee[fullTimeEmployees.length];
        int count=0;
        for (FullTimeEmployee e:fullTimeEmployees
             ) {
            if (e != null)
                if (e.getSalaryOfEmployee() < avg){
                    fullTimeEmployee[count] = e;
                    count++;
                }
            }
        return fullTimeEmployee;
    }

    public void getTongThuong(){
        for (Employee e: employees
             ) {
            if (e instanceof Thuong)
                ((Thuong) e).themThuong();
        }
    }
}
