import com.github.retronym.sbtxjc.test.BaseScriptedTestBuild
import com.github.retronym.sbtxjc.SbtXjcPlugin
import sbt._
import Keys._

object build extends BaseScriptedTestBuild {
  lazy val root = Project(
    id = "main",
    base = file("."),
    settings = Defaults.defaultSettings ++ scriptedTestSettings ++ SbtXjcPlugin.xjcSettings ++ SbtXjcPlugin.fluentApiSettings ++ Seq(
      resolvers += "Java Net" at "http://download.java.net/maven/2/"
    )
  )
}