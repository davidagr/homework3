package homework

import java.time.{DayOfWeek, LocalDate}
import java.time.temporal.ChronoUnit
import java.util.stream.Collectors.{counting, groupingBy}
import java.util.stream.{Collectors, Stream}

class Friday13(start:Int,end:Int){
  def countingFridays(): Unit ={
    val startDate:LocalDate=LocalDate.ofYearDay(start,13)
    val endDate:LocalDate=LocalDate.ofYearDay(end,349)

    Iterator.iterate(startDate)((next: LocalDate) => next.plusMonths(1))
      .takeWhile(d => d.isBefore(endDate))
      .filter(d => d.getDayOfWeek == DayOfWeek.FRIDAY)
      .filter(d => d.getDayOfMonth == 13)
      .toList
      .groupBy(d => d.getYear)
      .mapValues(_.size)
      .toSeq
      .sortBy(_._2)
      .foreach(d => println(s"${d._2}=${d._1}"))
  }

}
