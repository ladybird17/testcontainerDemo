package com.example.demo;

import org.testcontainers.containers.PostgreSQLContainer;

/**
 * author : yjseo
 * <p>
 * date : 2022-09-20
 */
public class UnitedTestContainer extends PostgreSQLContainer<UnitedTestContainer> {
  private static final String IMAGE_VERSION = "postgres:12";
  private static UnitedTestContainer container;

  private UnitedTestContainer(){
    super(IMAGE_VERSION);
  }

  public static UnitedTestContainer getInstance(){
    if(container == null){
      container = new UnitedTestContainer()
          .withDatabaseName("study")
          .withUsername("yejin")
          .withPassword("1234")
          .withInitScript("db/001_INIT.sql");
    }
    return container;
  }
}
