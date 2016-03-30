package de.codecentric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(Application.class);

        final TypeSafeConfiguration typeSafeConfiguration = ctx.getBean(TypeSafeConfiguration.class);
        final AnnotationConfiguration annotationConfiguration = ctx.getBean(AnnotationConfiguration.class);

        System.out.println(typeSafeConfiguration);
        System.out.println(annotationConfiguration.toString());
    }
}
