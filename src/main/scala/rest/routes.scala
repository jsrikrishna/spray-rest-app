package rest

import spray.routing.HttpService
import spray.routing.Route
import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import spray.httpx.SprayJsonSupport.{ sprayJsonMarshaller, sprayJsonUnmarshaller }

/**
 * @author sjalipar
 */
trait RestRoutes extends HttpService{
  import restJsonProtocol._
  
  val route : Route = pathPrefix("example"){
   get{ 
     complete {
       val presentTime : DateTime = DateTime.now(DateTimeZone.UTC)
       response(presentTime)
     }
   } ~ post {
     complete("Hi - Your Request is Received")
   }
  }
}