fun main()
{
    val obj = ArrayList<Student> (6)

    obj.add(Student())
    obj.add(Student("20012021010","CE","C","AB7","om ","joshi",21))
    obj.add(Student("20012021066","IT","A","AB4","Smit","Thakkar", 20))
    obj.add(Student("20012021053","CE","C","AB1","Sanjay","Sukhwani",22))
    obj.add(Student("20012021058","IT","B","AB6","Aryan ","Soni", 20))
    obj.add(Student("20012021070","CE-AI","C","AB15","Darshan","Vasoya",21))

    for (i in obj)
    {
        i.details()
        i.studentinfo()
    }

}
open class Person(private val fname: String, private val lname: String, private val age: Int)
{
    fun details() {
        println("First Name = $fname")
        println("Last Name = $lname")
        println("Age = $age")
    }
}

class Student(private val enroll: String,private val branch: String,private val Class: String,private val batch: String,fname: String,lname: String,age: Int) : Person(fname, lname, age)
{

    constructor() : this("Nun", "Nun", "Nun", "Nun", "Nun", "NuN", 0)
    {
        println("Secondary Constructor")
    }

    fun studentinfo()
    {
        println("Enrollment Number : $enroll")
        println("Branch : $branch")
        println("Class : $Class")
        println("Batch : $batch")
    }
}