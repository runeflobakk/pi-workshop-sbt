import AssemblyKeys._




name := "SCALA-pi-workshop"

version := "1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.10.0"

javacOptions in ThisBuild ++= Seq("-source", "1.7", "-target", "1.7")

javaHome := Some(file("/Library/Java/JavaVirtualMachines/jdk1.7.0_17.jdk/Contents/Home"))





assemblySettings

mainClass in assembly := Some("no.bekk.piworkshop.MyPi")

jarName in assembly := "pi-workshop.jar"

assembleArtifact in packageScala := false







libraryDependencies ++= Seq(
		    "com.pi4j" % "pi4j-core" % "0.0.5",
		    "com.pi4j" % "pi4j-service" % "0.0.5",
		    "com.pi4j" % "pi4j-device" % "0.0.5",
		    "com.pi4j" % "pi4j-gpio-extension" % "0.0.5",
		    "com.pi4j" % "pi4j-device" % "0.0.5"
)


libraryDependencies ++= Seq(
		    "junit" % "junit" % "4.11" % "test",
		    "org.specs2" %% "specs2" % "1.14" % "test"
)

