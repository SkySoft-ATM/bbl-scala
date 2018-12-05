name := "bbl-scala"

version := "0.1"

scalaVersion := "2.12.7"

lazy val akkaVersion = "2.5.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
)
