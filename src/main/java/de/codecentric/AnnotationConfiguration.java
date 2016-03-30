package de.codecentric;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnnotationConfiguration {

    @Value("${example.property-name ?: not set}")
    public String propertyDashName;

    @Value("${example.property.name ?: not set}")
    public String propertyPointName;

    @Value("${example.propertyName ?: not set}")
    public String propertyName;
    
    @Value("${example.propertyname ?: not set}")
    public String propertyname;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AnnotationConfiguration{");
        sb.append("propertyDashName='").append(propertyDashName).append('\'');
        sb.append(", propertyPointName='").append(propertyPointName).append('\'');
        sb.append(", propertyName='").append(propertyName).append('\'');
        sb.append(", propertyname='").append(propertyname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
