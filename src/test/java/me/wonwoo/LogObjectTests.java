package me.wonwoo;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Created by wonwoo on 2017. 2. 2..
 */
public class LogObjectTests {

  Logger logger = Logger.getLogger(this.getClass().getName());
  @Test
  public void logTest() {
    LogObject logObject = new LogObject();
    logObject.print();
    logger.info("hello");
  }
}