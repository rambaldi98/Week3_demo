public class PartimeEmployee  extends Employee{
    private int timework;

    public int getTimework() {
        return timework;
    }

    public void setTimework(int timework) {
        this.timework = timework;
    }

    public PartimeEmployee(String name, String code, String sdt, String email, int age, int timework) {
        super(name, code, sdt, email, age);
        this.timework = timework;
    }

    @Override
    public int getSalaryOfEmployee() {
        return timework*100;
    }

    @Override
    public String toString() {
        return "PT " + this.getName();
    }
}
