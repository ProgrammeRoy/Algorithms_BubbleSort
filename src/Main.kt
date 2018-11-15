fun main(args: Array<String>){
    var listNumbers = arrayListOf(4,45,36,44,36,67,27,58,79,10)

    BubbleSort_FromApp(listNumbers)
    BubbleSort_MyImplementation(listNumbers)
}

fun BubbleSort_FromApp(list:ArrayList<Int>) {
    var listNumberMI = list
    var maxCantidadMI:Int = listNumberMI.count()
    var numberMI = 0
    var restMI = 2

    while (maxCantidadMI>1){

        for (i in (listNumberMI.size) downTo 2 ){
            //If you change Asc to Desc change < to >
            if (listNumberMI[i-1]<listNumberMI[i-2]){
                numberMI = listNumberMI[i-2]
                listNumberMI[i-2] = listNumberMI[i-1]
                listNumberMI[i-1] = numberMI
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