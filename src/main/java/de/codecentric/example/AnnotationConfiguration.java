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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnnotationConfiguration {

    @Value("${example.property-name:not set}")
    public String propertyDashName;

    @Value("${example.property.name:not set}")
    public String propertyPointName;

    @Value("${example.propertyName:not set}")
    public String propertyName;
    
    @Value("${example.propertyname:not set}")
    public String propertyname;

    @Value("${example.property_name:not set}")
    public String property_name;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AnnotationConfiguration{");
        sb.append("propertyDashName='").append(propertyDashName).append('\'');
        sb.append(", propertyPointName='").append(propertyPointName).append('\'');
        sb.append(", propertyName='").append(propertyName).append('\'');
        sb.append(", propertyname='").append(propertyname).append('\'');
        sb.append(", property_name='").append(property_name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
