package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

    @Test
    public void testAdd() {
        List l = new List();
        l.add(1);                        // Call method to test
        assertTrue(l.getLength() == 1);  // The logical check
    }

    @Test
    public void testRemove() {
        List l = new List();
        l.add(5);
        l.add(8);
        l.add(43);
        assertTrue(l.remove()==43);
        assertTrue(l.getLength()==2);
    }

    @Test
    public void testGet() {
        List l = new List();
        l.add(2);
        l.add(8);
        l.add(38);
        l.add(45);
        l.add(77);
        assertTrue(l.get(0)==77);
        assertTrue(l.get(l.getLength()-1)==2);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        List list = new List();
        list.add(3);
        list.add(34);
        // Get a list then ...
        list.get(-1); // Exception!!!
    }

    @Test
    public void testCopy() {
        List l = new List();
        l.add(56);
        l.add(9);
        l.add(33);
        List l2 = l.copy();
        assertTrue(l2.get(0)==33);
        assertTrue(l.getLength()==l2.getLength());
        assertTrue(l.get(1)==l2.get(1));
        assertTrue(l.get(2)==l2.get(2));
    }

    @BeforeClass
    public static void beforeClass(){  //First of all
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){  // Last of all
        System.out.println("After class");
    }

    @Before
    public void before(){  //Before each test method
        System.out.println("Before");
    }

    @After
    public void after(){  //After each test method
        System.out.println("After");
    }

}
