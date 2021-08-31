package com.example.userservices.api.config;

import com.example.userservices.convertor.fromDTO.UserFromDTOConvertor;
import com.example.userservices.convertor.toDTO.UserToDTOConvertor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new UserFromDTOConvertor());
        registry.addConverter(new UserToDTOConvertor());
    }
}
