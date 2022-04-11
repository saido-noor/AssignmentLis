fun main() {
    var a = listOfString(listOf("Saido","Omar","Akuot","Philip","Nyawera","Trevor","Shanaya","Aisha","Noor","Swabrina"))
    println(a)
    var total = peoplesHeightMetre(listOf(2,5,3,4,9))
    println(total)

    var saido = Person("Saido",21,0.65,45.0)
    var cudra = Person("Cudra",20,1.15,96.1)
    var shanaya = Person("Shanaya",17,1.89,39.0)
    var shamim = Person("Shamim",25,2.40,40.0)

    var watu = listOf(saido,cudra,shanaya,shamim)
    var people = watu.sortedByDescending { d -> d.age }
    println(people)

    var pascaline = Person("Pascaline",23,1.60,50.0)
    var elizabet = Person("Elizabet",17,1.80,65.0)
    var peoples = listOf(pascaline,elizabet)
    var x = addMore(people.plus(peoples))
    println(x)

    var toyota = Vehicle("KCB2347", 320)
    var lambogiri = Vehicle("KTCA1003", 120)
    var cars = listOf(toyota,lambogiri)
    var c = Vehicle(listOf(toyota,lambogiri))
    println(c)

}
fun listOfString(names:List<String>): List<String> {
    var even = mutableListOf<String>()
    names.forEachIndexed { index ,a->
        if (index%2 == 0){
            even.add(a)
        }
    }

    return even
}
fun peoplesHeightMetre(heights: List<Int>):String{
    var x = heights.sum()
    var y = heights.average()
    var total = "$x, $y"
    return total
}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
fun addMore(morePeople:List<Person>):List<Any>{

    return morePeople
}
data class Vehicle(var registration: String, var mileage:Int)

fun Vehicle(cars:List<Vehicle>): Double {
    var avg=0.0
    cars.forEach { ca->ca.mileage
        avg+=ca.mileage

    }
    var totalAvg=avg/cars.count()
    return totalAvg
}
