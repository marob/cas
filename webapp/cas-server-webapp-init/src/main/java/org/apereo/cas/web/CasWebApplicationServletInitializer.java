package org.apereo.cas.web;

import com.google.common.collect.ImmutableMap;
import org.apereo.cas.config.CasEmbeddedContainerConfiguration;
import org.apereo.cas.util.CasBanner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * This is {@link CasWebApplicationServletInitializer}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
public class CasWebApplicationServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
        return builder
                .sources(CasWebApplication.class)
                .properties(ImmutableMap.of(CasEmbeddedContainerConfiguration.EMBEDDED_CONTAINER_CONFIG_ACTIVE, Boolean.FALSE))
                .banner(new CasBanner());
    }
}
