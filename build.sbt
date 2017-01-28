name := "scalalib"

organization := "com.github.ornicar"

version := "5.7"

scalaVersion := "2.11.8"

licenses += "MIT" -> url("http://opensource.org/licenses/MIT")

resolvers ++= Seq(
  "sonatype" at "http://oss.sonatype.org/content/repositories/releases",
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.11",
  "org.specs2" %% "specs2-core" % "3.6" % "test"
)

scalacOptions := Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:_",
  "-Xfatal-warnings"
)