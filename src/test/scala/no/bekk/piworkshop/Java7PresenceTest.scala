package no.bekk.piworkshop

import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import java.nio.file.Path
import java.nio.file.LinkOption.NOFOLLOW_LINKS
import java.nio.file.Paths.{get => path}
import java.nio.file.Files.{exists => fileExists}

@RunWith(classOf[JUnitRunner])
class Java7PresenceTest extends Specification {

  "Java 7 NIO classes" should {
    "be available" in {
      fileExists(path("build.sbt"), NOFOLLOW_LINKS) should beTrue
    }
  }
}
