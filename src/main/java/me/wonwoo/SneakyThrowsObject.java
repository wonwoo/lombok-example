package me.wonwoo;

import lombok.Lombok;
import lombok.SneakyThrows;

/**
 * Created by wonwoo on 2017. 2. 2..
 */
public class SneakyThrowsObject {

  @SneakyThrows(ClassNotFoundException.class)
  public void classFind() {
    Class.forName("me.wonwoo.test");
  }
}

class SneakyThrowsObjectNot {
  public void classFind() {
    try {
      Class.forName("me.wonwoo.test");
    } catch (ClassNotFoundException e) {
      throw Lombok.sneakyThrow(e);
    }
  }
}
