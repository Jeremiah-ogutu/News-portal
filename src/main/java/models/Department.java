package models;

import java.util.Objects;

public class Department {
//    private  int id;
    private  String department_name;
    private String no_of_Employees;
    private  String description;
    private int id;


    public  Department( String department_name, String no_of_Employees, String description) {
        this.department_name= department_name;
        this.description=description;
        this.no_of_Employees=no_of_Employees;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public String getno_of_Employees() {
        return no_of_Employees;
    }

    public String getDescription() {
        return description;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public void setno_of_Employees(String no_of_Employees) {
        no_of_Employees = no_of_Employees;
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
                no_of_Employees.equals(that.no_of_Employees) &&
                description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department_name, no_of_Employees, description);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
