# spring-session-gemfire-example

## Starting Locator

  gfsh start locator --name=locator1 \
  --enable-cluster-configuration=false  \
  --dir=$SERVER_DIR_LOCATION/$LOCATOR_1 \
  --port=15001 \
  --log-level=config \
  --J=-Dgemfire.jmx-manager=true \
  --J=-Xms256m \
  --J=-Xmx256m \
  --J=-Dcom.sun.management.jmxremote \
  --J=-Dcom.sun.management.jmxremote.port=15666 \
  --J=-Dcom.sun.management.jmxremote.ssl=false \
  --J=-Dcom.sun.management.jmxremote.authenticate=false \
  --J=-Dcom.sun.management.jmxremote.local.only=false
  
## Starting Server

   gfsh start server \
   --name=$NAME \
   --use-cluster-configuration=false \
   --server-port=0 \
   --classpath=/Users/leec43/.m2/repository/org/springframework/session/spring-session/1.3.1.RELEASE/spring-session-1.3.1.RELEASE.jar:/Users/leec43/.m2/repository/org/springframework/spring-core/4.2.8.RELEASE/spring-core-4.2.8.RELEASE.jar:/Users/leec43/.m2/repository/org/springframework/spring-expression/4.2.8.RELEASE/spring-expression-4.2.8.RELEASE.jar:/Users/leec43/.m2/repository/org/springframework/spring-web/4.2.8.RELEASE/spring-web-4.2.8.RELEASE.jar \
   --spring-xml-location=file:///Users/leec43/Desktop/session-demo/src/main/resources/gemfire-session-server.xml \
   --dir=$SERVER_DIR_LOCATION/$NAME \
   --locators=localhost[15001] \
   --J=-Xms256m \
   --J=-Xmx256m
