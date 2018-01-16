package higherorderfuncpack


data class Heroine(
    var name: String = "",
    var age: Int = 0,
    var beautyRate: Int = 0,
    var noOfFilm: Int = 0,
    var typeOfFilm: String = "Hollywood",
    var category: Category,
    var salary: Int,
    var place: String
){
    override fun toString(): String {
        return "Heroine(name='$name', age=$age, beautyRate=$beautyRate, noOfFilm=$noOfFilm, typeOfFilm='$typeOfFilm', category=$category, salary=$salary, place='$place')"
    }
}

data class Category(
        var noOfFilm: Int = 0,
        var typeOfCategory: String = "Action",
        var rating: Int = 0
){
    override fun toString(): String {
        return "Category(noOfFilm=$noOfFilm, typeOfCategory=$typeOfCategory, rating=$rating)"
    }
}

class Filter{

    var heroines = mutableListOf<Heroine>(
            Heroine("Scartlet",24,4,30,"Hollywood",
                    Category(20,"Action",4),30000,"USA"),
            Heroine("Angelina",40,10,50,"Hollywood",
                    Category(20,"Horror",4),30000,"USA"),
            Heroine("Emma",30,6,20,"Hollywood",
                    Category(20,"Romance",4),30000,"USA"),
            Heroine("Karina",40,5,23,"Bollywood",
                    Category(20,"Drama",4),30000,"England")
    )

    //1. FILTER
    // find who acts in hollywood
    fun predicate(){
        var list: List<Heroine> = heroines
                .filter{h -> h.typeOfFilm.equals("Hollywood")}
        list.forEach{
            println(it)
        }
    }
    //2. MAP
    //find who is young heroine names below 30
    fun findYoungHeroine(){
        //var youngHeroine: List<String?> = heroine.filter{  it.age == 30 }
         //       .map (Heroine::name)

        var youngHeroine = heroines.filter { it.age >= 30 }.map (Heroine::name )
        youngHeroine.forEach {
            println(it.toString())
        }

    }

    //3. COUNT
    // find count of young heroine 30 and below
    fun countOfYoungHeroine(){
        var count = heroines.asSequence().filter { it.age >= 30 }.count()
        println(" young heroines count  is : " + count)
    }

    //4. FIND,
    fun findFirst(){
        var name = heroines.find { it.name.startsWith("A") }
        println("first found name is : " + name)
    }


    // 5. ANY,
    // find anybody england
    fun findAny(){
        var any = heroines.any { it.place == "England" }
        println(" Anybody is " + any)
    }

    // 6. ALL, xxx
    fun findAll(){
        var all = heroines.all { it.age >= 30 }
        println(" I found : " + all )
    }

    // 7. FLATMAP,
    fun doFlatMap(){
        var flat = heroines.flatMap { it.name.toList() }
        println(" flattened names are : " + flat)
    }
    // 8. FLATTEN,

    // 9. GROUPBY,
    // grouped by age and also who is USA
    fun groupByAge(){
        var groups = heroines.filter { it.place == "USA" }.groupBy { it.age }
        groups.forEach{
            println(" groups are : " + it)
        }
    }

    //10. sortedBy
    fun sortedByName(){
        var names = heroines.sortedBy { it.name }.map(Heroine::name)
        println(" names : " + names)
    }



    fun passCode(){
        //{h: Heroine -> h.beautyRate < 6}
        var passCodeParaFun = { heroines.filter { it.beautyRate < 10 }.sortedBy { it.name }.map(Heroine::name)}
        println(passCodeParaFun())
        val sum = { x: Int, y: Int ->
            println("Computing the sum of $x and $y")
            x + y
            }
            println(sum(1, 2))
    }


}

//data class Person(var name:String, var age:Int)
//val people = listOf(Person("Alice", 29), Person("Bob", 31))


fun main(args:Array<String>){
    var highOrderfunc = Filter()
    //highOrderfunc.predicate()
    //highOrderfunc.findYoungHeroine()
    //highOrderfunc.countOfYoungHeroine()
    //highOrderfunc.groupByAge()
    //highOrderfunc.findAny()
    //highOrderfunc.findAll()
    //highOrderfunc.doFlatMap()
    //highOrderfunc.sortedByName()
    //highOrderfunc.passCode()
    highOrderfunc.findFirst()

    //var p = people.filter { it.age > 30 }
    //println(" p : $p")


}
