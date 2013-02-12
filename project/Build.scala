import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "playMyBatisSample"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
	"org.mybatis" % "mybatis" % "3.1.1",
	"org.mybatis" % "mybatis-guice" % "3.3",
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
