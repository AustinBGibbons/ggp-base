name := "ggp-base"

version := "0.1"

scalaVersion := "2.9.2"

resolvers ++= Seq(
            // other resolvers here
            "spray repo" at "http://repo.spray.io",
            "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
            // if you want to use snapshot builds (currently 0.2-SNAPSHOT), use this.
            "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.6.1" % "test"
)
