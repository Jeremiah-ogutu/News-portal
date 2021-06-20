package dao;

import models.Department;

import java.util.List;

public class Sql20DepartmentDao implements DepartmentDao {

    private final Sql20 sql20;
    public Sql20DepartmentDao(Sql20 sql20){
        this.sql20 =sql20;
    }

    @Override
    public Void add(Department department) {
     String sql = "INSERT INTO departments(department_names, description no_of_employees) VALUES (Department_desription,no_of_employees";
    }

    @Override
    public List<Department> getAll() {
        return null;
    }

    @Override
    public Department findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAll() {

    }
}
