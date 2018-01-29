package com.gameofthrones.ironbankstarternice.infra.config;

import com.gameofthrones.ironbankstarternice.infra.RavenProperties;
import com.gameofthrones.ironbankstarternice.infra.RavenSenderListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class Conf {
    @Bean
    @ConditionalOnProd
    @ConditionalOnProperty(value = "iron-bank.raven.recipients")
    @ConditionalOnMissingBean
    public RavenSenderListener ravenSenderListener(){
        return new RavenSenderListener();
    }
}
