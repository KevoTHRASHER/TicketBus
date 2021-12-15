#	Ticket Bus App	

![alt text](https://raw.githubusercontent.com/KevoTHRASHER/TicketBus/main/images/Screenshot.png?raw=true)

CRUD App write in JAVA Language with SQL in MariaDB.


##	Compilation

In these case i use two libraries:

* MariaDB-JAVA-Client for Connect Java with MariaDB
* JCalendar for Date Calendar

-- Compile in GNU/Linux

javac -cp .:jcalendar-1.4.jar:mariadb-java-client-2.7.3.jar *.java

-- Run in GNU/Linux

java -cp .:jcalendar-1.4.jar:mariadb-java-client-2.7.3.jar Login

-- Compile in Windows

javac -cp ".;jcalendar-1.4.jar;mariadb-java-client-2.7.3.jar" *.java

-- Run in Windows

java -cp ".;jcalendar-1.4.jar;mariadb-java-client-2.7.3.jar" Login
