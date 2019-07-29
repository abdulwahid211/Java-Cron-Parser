# Tandem SDET Test - Cron Parser

 A Java application that reads the Cron expression from the terminal

 
(User Input terminal)
  
 ``` 
 */15 0 1,15 * 1-5 /usr/bin/find
 ``` 
 
 then convert the expression and output it like:
 
 (Terminal Output)
   
  ``` 
  ***
  Minutes:  0 15 30 45
  Hours: 0
  Day of month: 1 15
  Month:  1 2 3 4 5 6 7 8 9 10 11 12
  Day of Week:  1 2 3 4 5
  Command: /usr/bin/find
  ***
  ``` 


# Basic Installation 
* Java 8
* Intellij idea environment (strongly suggested) or Eclipse 

# Video Demo 

See here, [here](https://youtu.be/Nkx2RjI3ldM)


# Usage

* The source codes can be found in ``` src ``` directory 
* The main method to run the app can be found in ``` Main.java ``` 


