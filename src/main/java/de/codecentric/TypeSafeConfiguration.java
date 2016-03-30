package de.codecentric;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "example")
public class TypeSafeConfiguration {

    private String propertyName;

    private String propertyname;
    
    private String property_name;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(final String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyname() {
        return propertyname;
    }

    public void setPropertyname(final String propertyname) {
        this.propertyname = propertyname;
    }

    public String getProperty_name() {
        return property_name;
    }

    public void setProperty_name(final String property_name) {
        this.property_name = property_name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyConfiguration{");
        sb.append("propertyName='").append(propertyName).append('\'');
        sb.append(", propertyname='").append(propertyname).append('\'');
        sb.append(", property_name='").append(property_name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
