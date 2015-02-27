// build.sbt for example 'fake_help_verbose'
// by George K. Thiruvathukal
//
// Generated by script/build.py
//
// This and the script may change at any time in the future,
// so please do not depend on the contents you see here.

name := "fake_help_verbose"

// This allows us to keep the source code and tests in the base directory instead
// of the usual src/{main,test}/scala folder structure. Makes it easier for CS1
// students!

scalaSource in Compile := baseDirectory.value
scalaSource in Test := baseDirectory.value

scalaVersion := "2.11.5"

// UI library provided by George K. Thiruvathukal and Andy Harrington (based on C# book)
// Thanks to Konstantin for the Bintray integration!

resolvers += "loyolachicagocode@bintray" at "http://dl.bintray.com/loyolachicagocode/maven"
libraryDependencies += "edu.luc.cs" %% "introcs-scala-ui" % "0.1.11"

// JUnit Support
libraryDependencies += "com.novocode" % "junit-interface" % "0.11"

// ScalaTest Support
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1"

