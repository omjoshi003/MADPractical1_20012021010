fun main()
{
    val obj = ArrayList<Laptop> (6)

    obj.add(Laptop())
    obj.add(Laptop("Core i9",4,4000,"Acer Laptop",1,50000))
    obj.add(Laptop("Core i5",4,1000,"Lenovo Laptop",1,65000))
    obj.add(Laptop("Core i3",8,1000,"Asus Laptop",1,75000))
    obj.add(Laptop("Ryzen 9",18,2000,"Dell Laptop",1,85000))
    obj.add(Laptop("Ryzen 7",4,10000,"Dell Laptop",1,100000))

    for (i in obj)
    {
        i.laptop()
        println("-------------")
    }

}
open class Product(private var name: String, private var qty: Int, private var amt: Int)
{

    fun product()
    {
        println("\n Laptop Details : \n")
        println("Name : $name")
        println("Qty : $qty")
        println("Amount : $amt")
    }
}

class Laptop(
    private var cpu: String, private var ram: Int, private var hdd: Int,
    name: String, qty: Int, amt: Int
) : Product(name, qty, amt)
{

    constructor() : this("None", 0, 0, "None", 0, 0)
    {
        println("Secondary Constructor")
    }

    fun laptop()
    {
        product()
        println("CPU Name : $cpu")
        println("RAM Size : $ram GB")
        println("HDD Size : $hdd GB")
    }
}
