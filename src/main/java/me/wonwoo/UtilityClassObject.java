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
  public static UtilityClassObject of() {
    return new UtilityClassObject();
  }

  public static void main(String[] args) {
    of();
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