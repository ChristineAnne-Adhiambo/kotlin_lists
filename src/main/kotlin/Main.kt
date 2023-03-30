fun main() {
    var all = indices(mutableListOf("I am","brake","breeze","towns",
        "city","Mary","seven","Kellie","countries","laptops"))
    var team = people(mutableListOf(112.0,330.0,140.0,197.0,229.0))

    var atts = people("John",15,10.0,29.8)
    var details =atts.details()
    var additional=  atts.added()
    var allOfThem= listOf(details,additional)
    println("this is $additional")

    var fare = car("TZ307",365.0)
    fare.mile()


}

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices ie index 2,4,6 etc

fun indices(names:List<String>):List<String>{

    var empty = mutableListOf<String>()
    for (x in names){
        if (names.indexOf(x)%2==0)
            empty+=x
    }
    return empty
}


//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun people(height:List<Double>):Double{

    println(height.average())
    println(height.sum())
    return (height.average())
    return (height.sum())
}



//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class people (var name:String, var age:Int, var height:Double, var weight:Double){
    open fun details(){
        var personOne = people("Japan",21,169.0,55.0)
        var personTwo = people("Akira",16,169.0,49.0)
        var personThree = people("Israel",23,156.0,57.0)
        var personFour = people("Hazel",20,180.0,50.0)

        var persons = listOf(personOne,personTwo,personThree,personFour)


        val smallPerson = persons.sortedByDescending { people -> people.age}
        println(smallPerson)
    }

// Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

    fun added() {
        var personFive=people("Eunice",22,154.0,58.0)
        var personSix= people("Ineza",20,172.0,53.0)
        var others = listOf(personFive,personSix)

        println(others)


    }



}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class car (var registration:String,var milleage:Double){
    fun mile():Double {
        var carBenz = car("Ke123", 123.0)
        var carToyota = car("Ke103", 409.0)
        var carSubaru = car("Ug205", 768.0)
        var all = mutableListOf(carBenz, carToyota, carSubaru)
        println(all)
        var total = 0.0
        for (y in all){

            total += y.milleage
        }
        var average = total/all.size

        return average
    }





}