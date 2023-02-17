fun main(){

    fun main() {
        val school = "akirachix"
        println(school[0] + "" +school[2] + school[3])
        name("Ivy",26)
        length("AdaLab")
        stmt("Ivy")
    }
    fun name(name:String,age:Int):String{
        val stmt = "Hi my name is $name and I am $age"
        println(stmt)
        return stmt
    }


    fun length(length: String): Int{
        val length= length.length
        println(length)
        return length
    }

    fun stmt(text:String){
        val name = "Ivy"
        if (name.equals("Ivy"))
            println("That's me")
        else {
            println("I don't know who that is")
        }
    }










}