package me.wonwoo;

import org.junit.Test;

/**
 * Created by wonwoo on 2017. 2. 2..
 */
public class NonNullObjectTests {

  @Test
  public void nonNullTest() {
    NonNullObject nonNullObject = new NonNullObject();
    nonNullObject.print(null);
  }
}
