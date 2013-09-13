name := """atomic-scala-examples"""

version := "1.0"

scalaVersion := "2.10.1"

mainClass in Compile := Some("ExampleRunner")

libraryDependencies := Seq(
  "org.scala-lang" % "scala-compiler" % "2.10.1",
  "org.scala-lang" % "scala-reflect" % "2.10.1",
  "org.scala-lang" % "scala-library" % "2.10.1"
)

// Note: These settings are defaults for Activator but can be changed.
Seq(
  scalaSource in Compile <<= baseDirectory / "app",
  sourceDirectory in Compile <<= baseDirectory / "app"
)
