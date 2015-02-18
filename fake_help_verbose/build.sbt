// build.sbt for example 'fake_help_verbose'
// by George K. Thiruvathukal
//
// Generated by script/build.py
//
// This and the script may change at any time in the future,
// so please do not depend on the contents you see here.

name := "fake_help_verbose"

scalaSource in Compile := baseDirectory.value

// scalaSource in Test := baseDirectory.value

scalaVersion := "2.11.5"

resolvers += "loyolachicagocode@bintray" at "http://dl.bintray.com/loyolachicagocode/maven"

libraryDependencies += "edu.luc.cs" %% "introcs-scala-ui" % "0.1.11"
