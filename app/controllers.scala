package controllers

import play._
import play.mvc._

object Application extends Controller {
    
    def index = {
        html.index("Your new Scala application is ready!")
    }
    
}
