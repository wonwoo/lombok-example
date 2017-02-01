package me.wonwoo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by wonwoo on 2017. 2. 1..
 */


public class GetSetObject {

//  @Setter(onParam = @__({@NotNull}), onMethod = @__({@NotNull}))
  @Setter(onMethod = @__({@NotNull}))
//  @Getter(value = AccessLevel.PUBLIC, onMethod = @__({@NonNull, @Id}))
  private Long id;
//  @Getter
  @Getter(value = AccessLevel.PUBLIC, lazy = true)
  private final String name = expensive();

  private String expensive() {
    return "wonwoo";
  }
}

class GetSetObjectOnParam {
  private Long id;

  public void setId(@NotNull Long id) {
    this.id = id;
  }
}

class GetSetObjectOnMethod {
  private Long id;

  @Id
  @Column(name = "seq")
  Long getId() {
    return id;
  }
}