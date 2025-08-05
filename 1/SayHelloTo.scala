
object SayHelloTo {
   /* The function sayHelloTo is placed inside an "object" called SayHelloTo */
   def sayHelloTo(who: String) = { 
    println("Hello, "+ who)
   }
   /* This is the main function that is the entry point. 
      args is an array of command line arguments as strings.
      */
   def main(args: Array[String]) = {
      // Iterate through the arguments one by one and call sayHelloTo on eacy
      for (name <- args) { sayHelloTo(name) }
   }
}