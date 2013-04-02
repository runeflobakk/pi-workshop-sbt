import AssemblyKeys._




name := "SCALA-pi-workshop"

version := "1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.10.0"





assemblySettings

mainClass in assembly := Some("no.bekk.piworkshop.ScalaPi")

jarName in assembly := "pi-workshop.jar"

assembleArtifact in packageScala := true







libraryDependencies ++= Seq(
		    "com.pi4j" % "pi4j-core" % "0.0.5",
		    "com.pi4j" % "pi4j-service" % "0.0.5",
		    "com.pi4j" % "pi4j-gpio-extension" % "0.0.5",
		    "com.pi4j" % "pi4j-device" % "0.0.5"
)


libraryDependencies ++= Seq(
		    "junit" % "junit" % "4.11" % "test",
		    "org.specs2" %% "specs2" % "1.14" % "test"
)

