import sbt._

import Keys._

object Root extends Build {

  lazy val root = Project(
    id = "root",
    base = file("."),
    aggregate = Seq(ggp_base)
  )

  lazy val ggp_base = Project(
    id = "ggp-base",
    base = file("ggp-base")
  )
}
