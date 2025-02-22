package dev.pixellogic.authguardian.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {


        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

        context.register(AppConfig.class);

        servletContext.addListener(new ContextLoaderListener(context));


        ServletRegistration.Dynamic servlet =
                servletContext.addServlet("servlet", new DispatcherServlet(context));


        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
