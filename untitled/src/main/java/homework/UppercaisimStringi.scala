package homework
import java.util.stream.Collectors

import scala.collection.JavaConverters
object UppercaisimStringi  {
implicit class UpperString(list: List[String]){

 def upperString:Unit={ val list1= list.foreach(t=>t.toUpperCase);println(list1)}
 //def upped(list2):java.util.List[String] = upped.stream().map(t=>t.toUpperCase).collect(Collectors.toList());

}}
