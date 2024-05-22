package workflow4s.wio.model

import scala.reflect.ClassTag

object ModelUtils {

  def prettifyName(name: String): String = name.capitalize.replaceAll("([a-z])([A-Z])", "$1 $2")

  def getPrettyNameForClass(ct: ClassTag[_]): String = {
    prettifyName(ct.runtimeClass.getSimpleName.stripSuffix("$"))
  }

}
