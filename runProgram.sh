echo code\ now\ compiling,\ program\ will\ start\ momentarily
for y in $(ls -1 | grep "_pkg") 
    do
        javac -cp ".;mysql-connector-java-8.0.28.jar" $y/*.java
    done
java -classpath ".;mysql-connector-java-8.0.28.jar" main