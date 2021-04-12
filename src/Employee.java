public abstract class Employee {
    private String name;
    private String code;
    private String sdt;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, String code, String sdt, String email, int age) {
        this.name = name;
        this.code = code;
        this.sdt = sdt;
        this.email = email;
        this.age = age;
    }

    public abstract int getSalaryOfEmployee();
}
