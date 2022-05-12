rm -rf build # delete directory if exists
mkdir build # create directory
#javac  -d ./build/ ./src/**/**/**/**/*.java
find ./src/ -type f -name "*.java" | xargs javac -cp ./src/ -d ./build/ # this may not work in windows. try using git bash and see of it works
cd build
jar -cvf app.jar .
cd -