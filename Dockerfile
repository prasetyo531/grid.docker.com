FROM openjdk:13-ea-19-jdk-alpine3.9

RUN apk add curl jq

# Workspace
WORKDIR /usr/share/udemy

ADD target/grid.docker.com-1.0.0.jar                                 grid.docker.com-1.0.0.jar
ADD target/grid.docker.com-1.0.0-tests.jar                           grid.docker.com-1.0.0-tests.jar
ADD target/libs                                                      libs

# in case of any other depedency
# please add that as well

#host machine url1
#host machine url2
#host machine url3

# add suite files / testng
ADD testng.xml                           testng.xml

ENTRYPOINT java -cp grid.docker.com-1.0.0.jar:grid.docker.com-1.0.0-tests.jar:libs/* -Dbrowser=$browser -Dhub_host=$hub_host org.testng.TestNG $module
#java -cp grid.docker.com-1.0.0.jar:grid.docker.com-1.0.0-tests.jar:libs/* -Dbrowser=chrome org.testng.TestNG ../testng.xml