object Painting {
   def main(args: Array[String]): Unit = {
      val height = 8
      
      println("Calculation of Room Paint Requirements")
      print("Enter room length: ")
      val length = readDouble()
      print("Enter room width: ")
      val width = readDouble()
      
      val wallArea = 2 * (length + width) * height // ignore doors
      val ceilingArea = length * width
      
      println(s"The wall area is $wallArea square feet.")
      println(s"The ceiling area is $ceilingArea square feet.")
   }
}
