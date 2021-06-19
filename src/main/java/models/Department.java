package models;

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
}
