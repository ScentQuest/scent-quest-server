package com.scentquest.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @since 2024. 05. 28
 * @author 윤승재
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

  /**
   * CORS 설정
   *
   * @since 2024. 05. 28
   * @param registry CORS 설정하기 위한 CorsRegistry타입 변수
   */
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry
        .addMapping("/**")
        .allowedOrigins("http://localhost:3000")
        .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS")
        .allowedHeaders("*")
        .allowCredentials(true);
  }
}