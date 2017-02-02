package me.wonwoo;

import lombok.NonNull;

/**
 * Created by wonwoo on 2017. 2. 2..
 */
public class NonNullObject {

  public void print(@NonNull String name) {
    System.out.println(name);
  }
}

class NonNullObjectNot {
  public void print(String name) {
    if(name == null){
      throw new NullPointerException("name");
    }
    System.out.println(name);
  }
}