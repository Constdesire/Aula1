fun main(args: Array<String>) {

    Loop@for (i in 1 .. 15) {

        for (j in 1 .. 15) {

            if (i == 2 && j == 9) break@Loop
            println("$i $j")

        }
    }
    println("Fim!")
}