fun main() {
    print("Enter transfer amount in kopeiki: ")
    val amount = readln().toLong()
    var commission: Long = (amount * 75) / 10000

    if (commission <= 3500) {
        commission = 3500
    }

    println("Commission: $commission")
}