//package dao;
//
//import models.Department;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.sql2o.Connection;
//import org.sql2o.Sql2o;
//
//import static org.junit.Assert.*;
//
//public class Sql20DepartmentDaoTest {
//    private static Connection conn;
//    private static Sql20DepartmentDao departmentDao;
//
//    @Before
//    public void setUp( ) throws Exception {
//        String connectionString = "jdbc:postgresql://localhost:5432/news_potal";
//        Sql2o sql2o = new Sql2o(connectionString, "moringa", "Access");
//        departmentDao= new Sql20DepartmentDao(sql2o);
//        conn = sql2o.open();
//
//
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        departmentDao.clearAll();
//        conn.close();
//    }




//    @Test
//    public void getAll() throws Exception {
//        Sql20DepartmentDaoTest department1 = setupDepartmentDao();
//        Sql20DepartmentDaoTest department2 = setupDepartment();
//        assertEquals(2, Sql20DepartmentDao.getAll().size());
//    }
//
//
//    @Test
//    public void findById() throws Exception {
//        Department department = setUp(sql20DepartmentDao);
//        assertTrue(sql20DepartmentDao.getAll().contains(department));
//    }

//
//}

//
//
//
//
//}
