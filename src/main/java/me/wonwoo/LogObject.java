package me.wonwoo;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by wonwoo on 2017. 2. 2..
 */
//@Log
//@Log4j
//@Log4j2
//@JBossLog
//@CommonsLog
@Slf4j
public class LogObject {

  public void print() {
    logger.info("hello world");
  }
}

class LogObjectNot {
  private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(LogObjectNot.class);
//  private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(LogObjectNot.class);
//  private static final org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger(LogObjectNot.class);
//  private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogObjectNot.class);
//  private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(LogObjectNot.class);
}
