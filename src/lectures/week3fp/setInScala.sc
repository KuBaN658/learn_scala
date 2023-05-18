val emptySet = Set()
val aSet = Set(10, 20, 30, 40)
val anotherSet = Set(30, 40, 50, 60)

println(aSet.isEmpty)
emptySet.isEmpty

aSet.head
aSet.tail

aSet.min
aSet.max

println(aSet.intersect(anotherSet))
println(aSet & anotherSet)

println(aSet ++ anotherSet)


