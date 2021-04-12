public class FullTimeEmployee extends Employee implements Thuong {
    private int bonus;
    private int fine;
    private int salary;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalaryOfEmployee() {
        return salary + bonus - fine;
    }


    @Override
    public String toString() {
        return "FT " + this.getName();
    }

    public FullTimeEmployee(String name, String code, String sdt, String email, int age, int bonus, int fine, int salary) {
        super(name, code, sdt, email, age);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    @Override
    public void themThuong() {
        System.out.println("Thuong " + this.getName());
    }
}
