package com.xkcoding.properties.controller;

import cn.hutool.core.lang.Dict;
import lombok.extern.slf4j.Slf4j;

import com.xkcoding.properties.property.ApplicationProperty;
import com.xkcoding.properties.property.DatabaseProperty;
import com.xkcoding.properties.property.DeveloperProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:49
 */
@Slf4j
@RestController
public class PropertyController {
  private final ApplicationProperty applicationProperty;
  private final DeveloperProperty developerProperty;
  private final DatabaseProperty databaseProperty;

  public PropertyController(ApplicationProperty applicationProperty,
      DeveloperProperty developerProperty,
      DatabaseProperty databaseProperty) {
    this.applicationProperty = applicationProperty;
    this.developerProperty = developerProperty;
    this.databaseProperty = databaseProperty;
  }

  @GetMapping("/property")
  public Dict index() {
    log.info("{}", databaseProperty);
    return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
  }
}
