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
     val presentTime : DateTime = DateTime.now(DateTimeZone.UTC)
     complete(response(presentTime))
   } ~ post {
     complete("Your Request is Received")
   }
  }
}