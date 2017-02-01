package me.wonwoo;

import lombok.SneakyThrows;
import lombok.experimental.var;
import lombok.val;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wonwoo on 2017. 2. 1..
 */
public class ValAndVarTests {
  @Test
  public void valVarTest() {
    val arrVal = Arrays.asList(1, 2, 3, 4, 5);
//    arrVal = new ArrayList<>();

//    var arrVar = Arrays.asList(1, 2, 3, 4, 5);
//    arrVar = new ArrayList<>();

    final List<Integer> arrVal1 = Arrays.asList(1, 2, 3, 4, 5);
//    arrVal1 = new ArrayList<>();

    List<Integer> arrVar1 = Arrays.asList(1, 2, 3, 4, 5);
    arrVar1 = new ArrayList<>();
    utf8ToString("asdf".getBytes());

  }

  @SneakyThrows(UnsupportedEncodingException.class)
  public String utf8ToString(byte[] bytes) {
    return new String(bytes, "UTF-81");
  }
}
