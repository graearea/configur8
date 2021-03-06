
val orgName = "io.github.daviddenton"

val projectName = "configur8"

organization := orgName

name := projectName

description := "Nano-library which provides the ability to define typesafe (!) Configuration templates for applications"

scalaVersion := "2.12.0"

crossScalaVersions := Seq("2.10.4", "2.11.5", "2.12.0")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

licenses +=("Apache-2.0", url("http://opensource.org/licenses/Apache-2.0"))

pomExtra :=
  <url>http://{projectName}.github.io/</url>
    <scm>
      <url>git@github.com:daviddenton/{projectName}.git</url>
      <connection>scm:git:git@github.com:daviddenton/{projectName}.git</connection>
      <developerConnection>scm:git:git@github.com:daviddenton/{projectName}.git</developerConnection>
    </scm>
    <developers>
      <developer>
        <name>David Denton</name>
        <email>mail@daviddenton.github.io</email>
        <organization>{projectName}</organization>
        <organizationUrl>http://daviddenton.github.io</organizationUrl>
      </developer>
    </developers>

Seq(bintraySettings: _*)
