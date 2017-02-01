package me.wonwoo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by wonwoo on 2017. 2. 1..
 */
public class DataObjectTests {

  @Test
  public void accountTest() {
    final DataObject dataObject = DataObject.of(1L);
    final DataObject dataObject1 = DataObject.of(2L);
//    DataObject dataObject2 = new DataObject();
    dataObject.setName("wonwoo");
    System.out.println(dataObject);
    assertThat(dataObject.canEqual(this), is(false));
    assertThat(dataObject.canEqual(dataObject1), is(true));
  }
}
