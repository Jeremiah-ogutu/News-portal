package dao;

import models.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sql20DepartmentDaoTest {

    @Before
    public  void setUp() throws  Exception{

    }

    @After
    public  void tearDown()throws Exception{

    }

    @Test
    public void getAll(){
        Department department = setUpDepartment();
        assertTrue(departmentDao.getAll().contains(department));
    }

    @Test
    public void FindById() {
        Department department = setUpDepartment();
        departmentDao.deleteById(department.getId());
    }

}
