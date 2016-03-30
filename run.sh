#!/bin/bash

script_name=$(basename $0)
project_dir=${0%/*}
properties_file=${project_dir}/src/main/resources/application.properties

info() {
  echo -e "${script_name}: $1\n"
}

write_properties_file() {
mkdir -p ${project_dir}/src/main/resources

cat > ${properties_file} << EOF
example.property-name=example.property-name
example.property_name=example.property_name
example.propertyname=example.propertyname
example.propertyName=example.propertyName
EOF

info "Wrote ${properties_file} with content: \n$(cat ${properties_file})"
}

remove_properties_file() {
  rm -f ${properties_file}
  rm -rf ${project_dir}/src/main/resources
}

set_variables() {
  export EXAMPLE_PROPERTY_NAME=EXAMPLE_PROPERTY_NAME
  export EXAMPLE_PROPERTYNAME=EXAMPLE_PROPERTYNAME
  info "Set the following environment variables: \nEXAMPLE_PROPERTY_NAME=${EXAMPLE_PROPERTY_NAME}\nEXAMPLE_PROPERTYNAME=${EXAMPLE_PROPERTYNAME}"
}

unset_variables() {
  unset EXAMPLE_PROPERTY_NAME
  unset EXAMPLE_PROPERTYNAME
}

run() {
  ${project_dir}/mvnw -q clean package
  java -Dspring.main.banner-mode=off -Dlogging.level.root=FATAL -jar ${project_dir}/target/example.jar
}

info "Running application without configuration"
run


info "Running application with environment variables"
set_variables
run
unset_variables

info "Running application with application.properties"
write_properties_file
run
remove_properties_file

info "Running application with environment variables and application.properties"
set_variables
write_properties_file
run
unset_variables
remove_properties_file
