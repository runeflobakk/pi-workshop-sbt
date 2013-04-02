package no.bekk.piworkshop

import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.execute.PendingUntilFixed
import org.specs2.execute.Pending

@RunWith(classOf[JUnitRunner])
class DummyTest extends Specification {
  
  skipAllIf(true)

  "I have no idea what this" should {
    "do" in {
      val dummy = new Dummy()
      dummy.doSomeCrap()
    }
  }
}