package cloudfunctions

import com.google.cloud.functions.{HttpFunction, HttpRequest, HttpResponse}
import com.google.gson.Gson

class ExampleFunction extends HttpFunction {

  /**
    * Gson instance for service
    * @type Gson
    */
  val gson: Gson = new Gson

  /**
    * Passthrough method for Google Cloudfunctions. Echos
    * query parameter `name` back to user, by default
    * world, enclosed in a serialized `ExampleResponse`
    * object.
    */
  override def service(
      httpRequest: HttpRequest,
      httpResponse: HttpResponse
  ): Unit = {
    httpResponse
      .getWriter
      .write(
        gson.toJson(
          ExampleResponse(
            httpRequest
              .getFirstQueryParameter("name")
              .orElse("World")
          )
        )
      )
    ()
  }
}
