package me.wonwoo;

import org.junit.Test;

/**
 * Created by wonwoo on 2017. 2. 1..
 */
public class ConstructorObjectTests {

  @Test
  public void adminTest() {
    ConstructorObject constructorObject = ConstructorObject.of(1L, "wonwoo");
    ConstructorObjectNot constructorObjectNot = ConstructorObjectNot.of(1L, "wonwoo");

  }
}
