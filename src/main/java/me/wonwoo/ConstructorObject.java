package me.wonwoo;

import lombok.RequiredArgsConstructor;

import javax.inject.Inject;

/**
 * Created by wonwoo on 2017. 2. 1..
 */
//@AllArgsConstructor(onConstructor = @__(@Inject))
//@NoArgsConstructor()
@RequiredArgsConstructor(staticName = "of", onConstructor = @__(@Inject))
public class ConstructorObject {
  private final Long id;
  private final String name;
}

class ConstructorObjectNot {
  private final Long id;
  private final String name;

  @Inject
  private ConstructorObjectNot(Long id, String name) {
    this.id = id;
    this.name = name;
  }
  public static ConstructorObjectNot of(Long id, String name) {
    return new ConstructorObjectNot(id, name);
  }
}