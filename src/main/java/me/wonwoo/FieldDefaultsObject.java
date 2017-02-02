package me.wonwoo;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

/**
 * Created by wonwoo on 2017. 2. 2..
 */
@RequiredArgsConstructor
@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public class FieldDefaultsObject {
  @NonFinal Long id;
  String name;
}

class FieldDefaultsObjectNot {
  private Long id;
  private final String name;

  public FieldDefaultsObjectNot(String name) {
    this.name = name;
  }
}
