package com.gameofthrones.ironbankstarternice.infra;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@ConfigurationProperties("iron-bank.raven")
@Data
public class RavenProperties {
    private String recipients;
}
