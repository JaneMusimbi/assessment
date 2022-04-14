fun main(){
    var t=CurrentAccount("95912","Equity",5000.00)
    t.deposit(4000.0)
    t.withdrawals(4000)
    var j="Account number 234 with balance 6000.00 is operated by Equity"
    println(j)

    var product="Category"
    when(product){
        "layermash"-> println("groceries")
        "juice"->println("Hygiene")
        "food"->println("other")

    }
}
open class CurrentAccount(var accountnumber:String, var accountname:String,balance:Double){
    fun deposit(amount: Double) {
        var newbalance= 5000.00+amount
        println(newbalance)
    fun withdrawals (amount: Int){
        var withdrawalamount= 5000.00-amount
        println(withdrawalamount)
    fun details(){
        var w="Account number $x with balance $y is operated by $z"

    }

    }

    }

}
class SavingAcconut(accountnumber: String,accountname: String,balance: Double):CurrentAccount(accountnumber,accountname,balance){
 fun keeptrack (withdrawals: Int.){
     fun withdrawal(){

     }

 }
}
data class product(val name:String,val weight:Double,val price:Double,val category:String,)

var z="Banana"
 println(z.indices[])

