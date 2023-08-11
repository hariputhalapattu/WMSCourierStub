FROM openjdk:8
EXPOSE 87
ADD target/WMSCourierStub.jar WMSCourierStub.jar
ENTRYPOINT [ "java","-jar","/WMSCourierStub.jar" ]