case class Address(city: String, street: String)
val home = Address("Moscow", "sverdlova")
val work = Address("Moscow", "zarecnhaya")
val addresses: List[Address] = List(work, home)

addresses.sortBy(address => (address.city, address.street))

// тоже самое
addresses.sortBy(address => (address.city, address.street))(using Ordering.Tuple2(Ordering.String, Ordering.String))

val nums = Array(3,1,2,4)

nums.sortWith((a, b) => a % 2 < b % 2)