# using runtime args with main method: understanding -cp usage
cd ../../build # move to build directory
ls -ltr # show content of build directory
echo "build directory: "
pwd
<<COMMENT
* app.jar is present under the current directory i.e. build.
* so in the below command we are using . or ./
* java will search and load the class com.java.basics.terminal.App1 from current directory
or in the jars present in the current directory.

COMMENT
java -classpath ./ com.java.basics.terminal.App1 AB CD EFG # using ./

java -classpath . com.java.basics.terminal.App1 AB CD EFG # using .

java -cp . com.java.basics.terminal.App1 AB CD EFG # using cp instead classpath (both are same)

java -cp .:./app.jar com.java.basics.terminal.App1 AB CD EFG # colon : acts as a separator, here saying to search class in current directory and the jar in current directory./app.jar
cd - # back to terminal directory

echo "terminal directory"
pwd

## Accessing jar with relative path
java -cp ../../build com.java.basics.terminal.App1 AB CD EFG # searching class in build directory
java -cp ../../build/app.jar com.java.basics.terminal.App1 AB CD EFG # searching class in app.jar only

## params with space
java -cp ../../build/app.jar com.java.basics.terminal.App1 "12 34 567" "8910" AB