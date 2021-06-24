//package models;
//
//public class UserTest {
//}
package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getUser_name() {
        User testUser = setupUser();
        assertEquals("John", testUser.getUsername());
    }

    @Test
    public void setUser_name() {
        User testUser = setupUser();
        testUser.setUsername("Mark");
        assertNotEquals("John", testUser.getUsername());
    }


    @Test
    public void setId() {
        User testUser = setupUser();
        testUser.setId(5);
        assertEquals(5, testUser.getId());
    }


    public User setupUser(){
        return new User("John","Editor","1");
    }


}

