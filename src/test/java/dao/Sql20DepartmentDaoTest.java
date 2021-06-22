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
//    private  static  Connection conn;
//    private  static  Sql20DepartmentDao sql20DepartmentDao;
//
//    @Before
//    public  void setUp() throws  Exception{
//        String connectionString = "jdbc:h2:~/jadle.db;INIT=RUNSCRIPT from 'classpath:DB/create.sql'";
//        Sql2o sql2o = new Sql2o(connectionString, "", "");
//        sql20DepartmentDao = new Sql20DepartmentDao(sql2o);
//        conn = sql2o.open();
//
//    }
//
//    @After
//    public void tearDown() throws Exception{
//        sql20DepartmentDao.clearAll();
//        conn.close();
//    }
//
//    @Test
//    public void getAll() {
//        Department department = setUp(Sql20Department);
//        assertTrue(sql20DepartmentDao.getAll().contains(department));
//    }
//
////
////
////
////
////}
