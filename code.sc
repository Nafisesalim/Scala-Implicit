import scala.language.implicitConversions

class TourMagie(s:String) {
  def disparition( implicit animal1: String): Unit = {
    if (s == " a disparu")
      println(animal1 + s)
    else None
  }

  def metamorphose(animal2: String): Unit = {
    if (s == " a ete metamorphose")
      println(animal2 + s)
    else None
  }
}

implicit def tricks(s: String): TourMagie = new TourMagie(s)

implicit val test : String = "lapin"

" a disparu".disparition






/*
val magie1 = new TourMagie(" a disparu")
val magie2 = new TourMagie(" a ete metamorphose")
implicit val animal1 : String = "lapin"
implicit val animal2 : String = "Colombe"

magie1.disparition
magie2.metamorphose

*/




