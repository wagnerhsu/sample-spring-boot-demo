package com.xkcoding.properties.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "database")
@Component
public class DatabaseProperty {
  private String driverName = null;

  private String url = null;

  private String username = null;

  private String password = null;
}
