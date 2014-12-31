name := """PlayWithSecureSocial"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.webjars" % "bootstrap" % "3.2.0",
  "org.webjars" % "flot" % "0.8.0"
)

libraryDependencies ++= Seq(
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  "ws.securesocial" %% "securesocial" % "master-SNAPSHOT" withSources,
  "ws.securesocial" %% "securesocial" % "master-SNAPSHOT" classifier "assets"
)

resolvers += Resolver.sonatypeRepo("snapshots")
