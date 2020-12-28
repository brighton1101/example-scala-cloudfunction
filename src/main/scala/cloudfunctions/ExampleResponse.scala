package cloudfunctions

case class ExampleResponse(
    name: String
) {
    def upperCaseName: String = {
        name.toUpperCase
    }
}
