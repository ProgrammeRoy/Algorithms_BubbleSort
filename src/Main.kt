fun main(args: Array<String>){
    var listNumbers = arrayListOf(4,45,36,44,36,67,27,58,79,10)
    var maxCantidad:Int = listNumbers.count()
    var number:Int = 0
    var rest: Int = 2

    while (maxCantidad>1){

        for (i in 0..listNumbers.size-rest ){
            if (listNumbers[i]<listNumbers[i+1]){
                number = listNumbers[i+1]
                listNumbers[i+1] = listNumbers[i]
                listNumbers[i] = number
            }
        }
        rest++
        maxCantidad--
    }

    println(listNumbers)
}