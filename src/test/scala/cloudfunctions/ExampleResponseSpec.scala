package cloudfunctions

import org.scalatest.flatspec.AnyFlatSpec

class ExampleResponseSpec extends AnyFlatSpec {
    "upperCaseName" should "make name uppercase" in {
        assert(ExampleResponse("test").upperCaseName == "TEST")
    }
}
