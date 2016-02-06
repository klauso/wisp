import com.github.retronym.SbtOneJar._

oneJarSettings

name := "wisp"

version := "0.0.4"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"


scalacOptions ++= Seq("-feature")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")


libraryDependencies ++= Seq(
			"org.json4s" %% "json4s-jackson" % "3.3.0",
            "org.json4s" %% "json4s-ext" % "3.3.0",
			"net.databinder" %% "unfiltered-filter" % "0.8.3",
			"net.databinder" %% "unfiltered-jetty" % "0.8.3",
			"com.quantifind" %% "sumac" % "0.3.0",
			"org.apache.commons" % "commons-math3" % "3.4.1",
			"commons-io" % "commons-io" % "2.4")


