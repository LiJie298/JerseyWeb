package com.lijie.Module.jersey;

import com.google.inject.Scopes;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class MyModule extends JerseyServletModule {
    @Override
    protected void configureServlets() {
        bind(GuiceContainer.class);
        bind(JacksonJsonProvider.class).in(Scopes.SINGLETON);

        PackagesResourceConfig resourceConfig = new PackagesResourceConfig("com.lijie.resource");
        for (Class<?> resource : resourceConfig.getClasses()) {
            bind(resource);
        }

        serve("/*").with(GuiceContainer.class);
    }
}
