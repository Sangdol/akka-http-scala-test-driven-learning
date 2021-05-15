package com.example

import com.example.UserRegistry.ActionPerformed

import spray.json.DefaultJsonProtocol

/**
 * https://developer.lightbend.com/guides/akka-http-quickstart-scala/json.html
 *
 * Spray JSON https://github.com/spray/spray-json
 */
object JsonFormats {
  // import the default encoders for primitive types (Int, String, Lists etc)

  import DefaultJsonProtocol._

  // Without these `complete` code in UserRoute wouldn't compile (type-safe).
  // They are implicitly passed.
  implicit val userJsonFormat = jsonFormat3(User)
  implicit val usersJsonFormat = jsonFormat1(Users)

  implicit val actionPerformedJsonFormat = jsonFormat1(ActionPerformed)
}
