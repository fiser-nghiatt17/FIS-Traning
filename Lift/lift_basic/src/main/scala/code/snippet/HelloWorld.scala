package code.snippet 
import _root_.net.liftweb._
import http._
import SHtml._
import js._
import JsCmds._
import common._
import util._
import Helpers._

import scala.xml.NodeSeq
class HelloWorld extends StatefulSnippet {
   private var defaultUsername = "nghia"
   private var defaultPassword = "123"

   private var username = "";
   private var password = "";

   def dispatch = {
    case "render" => render
  }

   def render = {
      def validate() {
         if(username == defaultUsername && password == defaultPassword){
            S.notice("Thanks")
            S.redirectTo("welcome")
         }
      }
      "id=username" #> SHtml.text(username, username = _) &
      "id=password" #>  SHtml.password(password, password = _) &
      "type=submit" #> submit("Log in", validate _)
   }
}

