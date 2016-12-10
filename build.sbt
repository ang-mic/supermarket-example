  // Project related information
  organization := "org.angmic"
  version := "0.0.1"
  name := "supermarket-example"

  // Scala language related information
  ivyScala := ivyScala.value map {
    _.copy(overrideScalaVersion = true)
  }                                     // Forces the Scala version
  scalaVersion := "2.12.0"
  scalacOptions := Seq(
    "-unchecked",
    "-deprecation",
    "-encoding",
    "utf8")

  //Packaging and excecution instractions
  enablePlugins(JavaAppPackaging)                             // Enables packaging  and spesifies the type of the package
  mainClass in Universal := Some("supermarket_SW.MainFrame") // Specifies the class with the 'main' methods
  executableScriptName := "start"

  // External dependencies of the project
  libraryDependencies ++= {
    // val akkaVersion = "2.4.9"
    Seq(
      "org.scalatest" % "scalatest_2.12" % "3.0.0" % "test",
      "com.typesafe" % "config" % "1.3.0",
      "org.swinglabs" % "swing-layout" % "1.0.3",
      "org.swinglabs" % "swingx" % "1.6.1",
      "junit" % "junit" % "4.12" % "test"
    )
  } 
