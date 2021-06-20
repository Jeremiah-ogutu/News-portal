package dao;

import models.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql20DepartmentDaoTest<Sql2oDepartmentDao> {
    private Connection conn;
    private Sql2oDepartmentDao departmentDao;

    @Before
    public  void setUp() throws  Exception{

    }

    @After
    public  void tearDown()throws Exception{

    }

    @Test
    public void addingDepartmentSetsId()throws Exception{
        Department department = setUpDepartment();
        assertNotEquals(0,testRestaurant.getId());
    }

    @Test
    public void FindById() {
        Department department = setUpDepartment();
        departmentDao.deleteById(department.getId());
    }

}
