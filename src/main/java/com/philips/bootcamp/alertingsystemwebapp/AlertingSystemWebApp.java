/*
 * The copyright of this file belongs to Koninklijke Philips N.V., 2019.
 */
package com.philips.bootcamp.alertingsystemwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = "com.philips.bootcamp.domain")
@ComponentScan(basePackages = "com.philips.bootcamp")
public class AlertingSystemWebApp {

  public static void main(String[] args) {
    SpringApplication.run(AlertingSystemWebApp.class, args);

  }
}
