//package models;
//
//public class DepartmentTest {
//}

package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getD_name() {
        Department testDepartment = setupDepartment();
        assertEquals("Sports", testDepartment.getDepartment_name());
    }

    @Test
    public void setD_name() {
        Department testDepartment = setupDepartment();
        testDepartment.setDepartment_name("Business");
        assertNotEquals("Sports", testDepartment.getDepartment_name());
    }


//    @Test
//    public void getDescription() {
//        Department testDepartment = setupDepartment();
//        assertEquals("In charge of running sports segments", testDepartment.getDescription());
//    }

//    @Test
//    public void setDescription() {
//        Department testDepartment = setupDepartment();
//        testDepartment.setDescription("In charge of running business news");
//        assertNotEquals("In charge of running sports segments", testDepartment.getDescription());
//    }

//    @Test
//    public void getNo_of_employees() {
//        Department testDepartment = setupDepartment();
//        assertEquals(10, testDepartment.getno_of_Employees());
//    }

    @Test
    public void setNo_of_employees() {
        Department testDepartment = setupDepartment();
        testDepartment.setno_of_Employees("2");
        assertNotEquals(10, testDepartment.getno_of_Employees());
    }

    @Test
    public void setId() {
        Department testDepartment = setupDepartment();
        testDepartment.setId(5);
        assertEquals(5, testDepartment.getId());
    }


    public Department setupDepartment(){
        return new Department("Sports","In charge of running sports segments","10");
    }


}

