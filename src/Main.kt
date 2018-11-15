fun main(args: Array<String>){
    var listNumbers = arrayListOf(2,32,52,46,35,63,74,56,43,52,11,17)

    BubbleSort_FromApp(listNumbers)
    BubbleSort_MyImplementation(listNumbers)
}

fun BubbleSort_FromApp(list:ArrayList<Int>) {
    var listNumberMI = list
    var maxCantidadMI:Int = listNumberMI.count()
    var numberMI = 0
    var restMI = 0

    while (maxCantidadMI>1){

        for (i in (listNumberMI.size-1) downTo 1+restMI ){
            //If you change Asc to Desc change < to >
            if (listNumberMI[i]>listNumberMI[i-1]){
                numberMI = listNumberMI[i-1]
                listNumberMI[i-1] = listNumberMI[i]
                listNumberMI[i] = numberMI
            }
        }
        restMI++
        maxCantidadMI--
    }
    println(listNumberMI)
}

fun BubbleSort_MyImplementation(list:ArrayList<Int>) {
    var listNumberMI = list
    var maxCantidadMI:Int = listNumberMI.count()
    var numberMI = 0
    var restMI = 2

    while (maxCantidadMI>1){

        for (i in 0..listNumberMI.size-restMI ){
            //If you change Asc to Desc change < to >
            if (listNumberMI[i]>listNumberMI[i+1]){
                numberMI = listNumberMI[i+1]
                listNumberMI[i+1] = listNumberMI[i]
                listNumberMI[i] = numberMI
            }
        }
        restMI++
        maxCantidadMI--
    }
    println(listNumberMI)
}