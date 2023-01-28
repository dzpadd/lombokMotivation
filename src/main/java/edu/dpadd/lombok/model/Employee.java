package edu.dpadd.lombok.model;

public class Employee {

    private String name;
    private int box;
    private double salary;

    public Employee() {
    }

    public String getName() {
        return this.name;
    }

    public int getBox() {
        return this.box;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Employee)) return false;
        final Employee other = (Employee) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getBox() != other.getBox()) return false;
        if (Double.compare(this.getSalary(), other.getSalary()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Employee;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getBox();
        final long $salary = Double.doubleToLongBits(this.getSalary());
        result = result * PRIME + (int) ($salary >>> 32 ^ $salary);
        return result;
    }

    public String toString() {
        return "Employee(name=" + this.getName() + ", box=" + this.getBox() + ", salary=" + this.getSalary() + ")";
    }
}
