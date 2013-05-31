/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.homeworklib;

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class HomeworkTest {
    
    public HomeworkTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of homework method, of class Homework.
     */
    @Test
    public void testHomework() {
        System.out.println("homework");
        Vector inputArr = null;
        int sum = 0;
        int product = 0;
        Homework.homework(inputArr, sum, product);
    }
}