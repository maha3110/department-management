package edu.igl4.departmentManagement.model.id.Converter;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;


@Configuration
class Config implements RepositoryRestConfigurer {
    @Override
    public void configureConversionService(ConfigurableConversionService conversionService) {
        conversionService.addConverter(new HoraireIdConverter());
        conversionService.addConverter(new NoteIdConverter());
    }
}
