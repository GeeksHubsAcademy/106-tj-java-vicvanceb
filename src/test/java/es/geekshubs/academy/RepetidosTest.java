package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RepetidosTest {

  private Salto salto;

  @Before
  public void setUp() throws Exception {
    this.salto = new Salto();
  }

  @After
  public void tearDown() throws Exception {
    this.salto = null;
  }

  @Test public void test1 () {
    final int expected = -1;
    final int result = salto.apply(null);
    assertEquals(expected, result);  
  }

  @Test public void test2 () {
    final int expected = -1;
    final int result = salto.apply(Arrays.asList());
    assertEquals(expected, result); 
  }

  @Test public void test3 () {
    final int expected = 1;
    final int result = salto.apply(Arrays.asList(1));
    assertEquals(expected, result); 
  }

  @Test public void test4 () {
    final int expected = 2;
    final int result = salto.apply(Arrays.asList(1, 0, 2));
    assertEquals(expected, result);  
  }

  @Test public void test5 () {
    final int expected = 2;
    final int result = salto.apply(Arrays.asList(1, 2, 2));
    assertEquals(expected, result); 
  }

  @Test public void test6 () {
    final int expected = 2;
    final int result = salto.apply(Arrays.asList(1, 2, 2, 9));
    assertEquals(expected, result);
  }

  @Test public void test7 () {
    final int expected = 20;
    final int result = salto.apply(Arrays.asList(1, 2, 2, 1, 10));
    assertEquals(expected, result); 
  }

  @Test public void test8 () {
    final int expected = 10;
    final int result = salto.apply(Arrays.asList(1, 2, 2, 1, 5, 7));
    assertEquals(expected, result); 
  }

  @Test public void test9 () {
    final int expected = 630;
    final int result = salto.apply(Arrays.asList(1, 2, 2, 1, 7, 10, 45));
    assertEquals(expected, result); 
  }

  @Test public void test10 () {
    final int expected = 1260;
    final int result = salto.apply(Arrays.asList(1, 2, 2, 1, 7, 10, 45, 0, 2));
    assertEquals(expected, result); 
  }

  @Test public void test11 () {
    final int expected = 100;
    final int result = salto.apply(Arrays.asList(10, 0, 5, 1, 2));
    assertEquals(expected, result);  
  }

  @Test public void test12 () {
    final int expected = -25;
    final int result = salto.apply(Arrays.asList(-5, 0, 5));
    assertEquals(expected, result); 
  }

  @Test public void test13() {
    final int expected = 8;
    final int result = salto.apply(Arrays.asList(2, 0, -2, 0, -2));
    assertEquals(expected, result);  
  }
  
}