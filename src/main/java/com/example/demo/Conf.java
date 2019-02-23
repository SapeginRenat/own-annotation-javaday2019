package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf {
  @Bean
  public FrontEndWrapperAspect frontEndWrapperAspect() {
    return new FrontEndWrapperAspect();
  }
}
