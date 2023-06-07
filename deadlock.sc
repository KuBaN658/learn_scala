class Account(val id: Int, val name: String, var balance: Int) {
  override def toString: String = s"На счету [ $name ] имеется [ $balance ]"
}

def send(fromAcc: Account, toAcc: Account, amount: Int) = {
  def approveSending() = {
    fromAcc.balance -= amount
    toAcc.balance += amount

    println(s"$fromAcc | $toAcc")
  }

  if (fromAcc.id < toAcc.id) fromAcc.synchronized {
    toAcc.synchronized {
      approveSending()
    }
  } else toAcc.synchronized {
    fromAcc.synchronized {
      approveSending()
    }
  }
}

val alice = new Account(1, "Alice", 100)
val bob = new Account(2, "Bob", 200)

val t1 = new Thread {
  for (_ <- 0 to 5) send(alice, bob, 10)
}
val t2 = new Thread {
  for (_ <- 0 to 5) send(bob, alice, 20)
}

t1.join()
t2.join()