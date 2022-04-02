package com.savin.one.employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id,
                    String firstName,
                    String lastName,
                    int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(){}

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(int percent){
        salary = salary + (salary * percent / 100);
        return  salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(this.getClass().equals(object.getClass()))) return false;

        Employee employee = (Employee) object;
        return this.id == employee.id && this.salary == employee.salary && this.firstName.equals(employee.firstName) &&
                this.lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + id;
        result = 31 * result + salary;
        result = 31 * result + (firstName == null? 0 : firstName.hashCode());
        result = 31 * result + (lastName == null? 0 : lastName.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
