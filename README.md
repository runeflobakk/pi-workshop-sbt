Scala+SBT Raspberry Pi project skeleton
============================================

This is a simple project skeleton for developing with the [Pi4J](http://pi4j.com) library on the [Raspbery Pi](http://www.raspberrypi.org) using Scala 2.10 and SBT.

Building and running
----------------------

Running ```sbt assembly``` will create a single self-executing JAR which contains the required libraries for interfacing with the Pi hardware, in particular its GPIO pins. The resulting JAR can be SCPed to the Pi and run with ```sudo java -jar pi-workshop.jar``` (the ```sudo``` is needed for the required priviledges to use the Pi hardware).


    you@your-machine $ sbt assembly
    you@your-machine $ scp target/scala-2.10/pi-workshop.jar pi@192.168.2.2:~
    you@your-machine $ ssh pi@192.168.2.2              #replace with IP for your Pi
    
    pi@raspberrypi ~ $ sudo java -jar pi-workshop.jar


