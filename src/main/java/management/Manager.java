package management;

import management.Employee;


public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNumber, double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public double raiseSalary(Double raisedAmount) {
        return salary += raisedAmount;
    }

}

