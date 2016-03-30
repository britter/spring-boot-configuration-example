/*
 * Copyright 2016 codecentric AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.codecentric.example;

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
        final StringBuilder sb = new StringBuilder("TypeSafeConfiguration{");
        sb.append("propertyName='").append(propertyName).append('\'');
        sb.append(", propertyname='").append(propertyname).append('\'');
        sb.append(", property_name='").append(property_name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
