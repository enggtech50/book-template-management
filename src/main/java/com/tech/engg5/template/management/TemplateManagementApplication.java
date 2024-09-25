package com.tech.engg5.template.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateManagementApplication {

  public static void main(String[] args) {
    System.setProperty("APP_ID", "1000252");
    System.setProperty("APP_NAME", "book-template-management");
    SpringApplication application = new SpringApplication(TemplateManagementApplication.class);
    application.run(args);
  }
}
