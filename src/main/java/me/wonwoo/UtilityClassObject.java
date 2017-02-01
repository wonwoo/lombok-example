package me.wonwoo;

import lombok.experimental.UtilityClass;

/**
 * Created by wonwoo on 2017. 2. 1..
 */
@UtilityClass
public class UtilityClassObject {
  public static String name() {
    return "wonwoo;";
  }
}

class UtilityClassObjectNot {
  private UtilityClassObjectNot() {
    throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
  }
  public static String name() {
    return "wonwoo;";
  }
}