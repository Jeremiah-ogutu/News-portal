package models;

import java.util.Objects;

public class Department {
//    private  int id;
    private  String department_name;
    private String No_of_Employees;
    private  String description;


    public  Department( String department_name, String no_of_employees, String description) {
        this.department_name= department_name;
        this.description=description;
        this.No_of_Employees=no_of_employees;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public String getNo_of_Employees() {
        return No_of_Employees;
    }

    public String getDescription() {
        return description;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public void setNo_of_Employees(String no_of_Employees) {
        No_of_Employees = no_of_Employees;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return department_name.equals(that.department_name) &&
                No_of_Employees.equals(that.No_of_Employees) &&
                description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department_name, No_of_Employees, description);
    }
}
