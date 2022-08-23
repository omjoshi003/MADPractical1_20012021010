fun main()
{
    val obj = ArrayList<Student> (6)

    obj.add(Student())
    obj.add(Student("30002001001","CE","C","AB7","Rahul","Agarwal",19))
    obj.add(Student("T20012021050","IT","D","AB14","Om","Patel", 22))
    obj.add(Student("20112022222","CE","A","AB2","Chirag","Patel",19))
    obj.add(Student("20012022123","IT","D","AB5","Droan","Acharya", 18))
    obj.add(Student("21112022010","CE-AI","B","AB6","Rohan","Patel",17))

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

    constructor() : this("NaN", "NaN", "NaN", "NaN", "NaN", "NaN", 0)
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