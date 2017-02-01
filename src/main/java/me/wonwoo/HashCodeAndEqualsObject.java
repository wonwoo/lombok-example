package me.wonwoo;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by wonwoo on 2017. 2. 1..
 */
@EqualsAndHashCode(of = "id")
@ToString(exclude = "name", includeFieldNames = false)
public class HashCodeAndEqualsObject {
  private Long id;
  private String name;
}

