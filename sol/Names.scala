package sol


/**
 * Names is a class that contains and modifies a val Array.
 *
 * @author cs18tas
 * @param nameList - an Array of Strings that is a private val
 */
class Names (nameList: Array[String]) {



  def clear(name: String) {
    val b = this.nameList.length
    //TODO: Your code should go here
    for (a <- 1 until b) {
      if (name.equals(this.nameList(a))) {
        this.nameList(a) = "CLEARED"
      }
    }
  }
}

/**
 * Names2 is a class that contains and modifies a list as a var.
 *
 * @author cs18tas
 * @param nameList - a private var list of Strings
 */
class Names2 (private var nameList: List[String]) {



  def clear(name: String) {

    this.nameList.map(x =>
      if (name.equals(x)) {
        "CLEARED"
      }
      else {
        x
      }
    )
  }
}


/**
 * Names3 is a class that contains a list of suspects as a val.
 *
 * @author cs18tas
 * @param nameList - a private val list of Strings
 */

class Names3 (nameList: List[String]) {
    //TODO: For this part, we want you to come up with the clear method signature yourself!

}
