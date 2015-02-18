// build.sbt for example 'g_c_d_basic'
// by George K. Thiruvathukal
//
// Generated by script/build.py
//
// This and the script may change at any time in the future,
// so please do not depend on the contents you see here.

name := "g_c_d_basic"

scalaSource in Compile := baseDirectory.value

// scalaSource in Test := baseDirectory.value

scalaVersion := "2.11.5"

resolvers += "loyolachicagocode@bintray" at "http://dl.bintray.com/loyolachicagocode/maven"

libraryDependencies += "edu.luc.cs" %% "introcs-scala-ui" % "0.1.11"
