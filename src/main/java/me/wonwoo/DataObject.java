package me.wonwoo;

import lombok.Data;

/**
 * Created by wonwoo on 2017. 2. 1..
 */
@Data(staticConstructor = "of")
public class DataObject {
  private final Long id;
  private String name;
}
