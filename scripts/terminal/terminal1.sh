# using runtime args for main method
cd ../../build
ls -ltr
java -cp . com.java.basics.terminal.App1 AB CD EFG # using -cp
java -classpath . com.java.basics.terminal.App1 AB CD EFG # using -classpath
java -classpath . com.java.basics.terminal.App1 "AB CD" EFG " 1 2 3 4 " # multiline