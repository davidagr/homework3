package homework

import homework.Seniority

class Employee(var salary:Int, var name:String="Senior Pomidor Developer",val seniority: Seniority) {

   def findseniority() :Employee.this.seniority.Value=salary match {
    case (salary<=10000) =>seniority.JUNIOR
    case(10000<salary<=20000)=>seniority.MIDDLE
    case(salary>20000)=>return seniority.SENIOR


   }
findseniority()

}
