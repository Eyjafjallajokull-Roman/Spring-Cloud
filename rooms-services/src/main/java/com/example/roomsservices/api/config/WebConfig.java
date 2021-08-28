package com.example.roomsservices.api.config;

import com.example.roomsservices.convertor.fromDTO.RoomFromDTOConvertor;
import com.example.roomsservices.convertor.toDTO.RoomToDTOConvertor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new RoomToDTOConvertor());
        registry.addConverter(new RoomFromDTOConvertor());
    }
}
