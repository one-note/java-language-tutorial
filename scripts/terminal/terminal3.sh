# using JAVA_OPTS

# inline JAVA_OPTS
java -cp ../../build/app.jar -Dz=30 -Dw=40 com.java.basics.terminal.App2 # process p2

# Windows uses "%JAVA_OPTS% rather than "$JAVA_OPTS" which is UNIX/LINUX.

## GLOBAL JAVA_OPTS for a terminal or session or JVM
JAVA_OPTS="$JAVA_OPTS -Dx=10 -Dy=20"

java $JAVA_OPTS -cp ../../build/app.jar -Dz=30 -Dw=40 com.java.basics.terminal.App2 # process p1
java $JAVA_OPTS -cp ../../build/app.jar -Dz=30 -Dw=40 com.java.basics.terminal.App2 # process p2

# windows below
#set JAVA_OPTS="%JAVA_OPTS% -Dx=10 -Dy=20" # windows
#java %JAVA_OPTS% -cp ../../build/app.jar -Dz=30 -Dw=40 com.java.basics.terminal.App2 # process p1

