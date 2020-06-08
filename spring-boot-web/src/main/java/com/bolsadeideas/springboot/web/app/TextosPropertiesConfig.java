package com.bolsadeideas.springboot.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({ @PropertySource("classpath:textos.properties")// Justamente el classpath aqui es src/main/resources
})
public class TextosPropertiesConfig {

}
