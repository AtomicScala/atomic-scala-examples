name := """atomic-scala-examples"""

version := "2.0"
// Note: update to 2nd edition -- not complete yet

scalaVersion := "2.11.4"

mainClass in Compile := Some("ExampleRunner")

libraryDependencies := Seq(
  "org.scala-lang" % "scala-compiler" % "2.11.4",
  "org.scala-lang" % "scala-reflect" % "2.11.4",
  "org.scala-lang" % "scala-library" % "2.11.4"
)

// Note: These settings are defaults for Activator but can be changed.
scalaSource in Compile <<= baseDirectory / "app"

sourceDirectory in Compile <<= baseDirectory / "app"

fork in run := true