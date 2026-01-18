package com.clearsolutions;

public class Helper {

  public static void main(String[] args) {
      HelperReader.loadProperties("department-sql.properties");
      String prop = HelperReader.getProperty("getDepartmentById");
      System.out.println(prop);

  }
}
