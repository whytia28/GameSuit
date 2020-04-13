class Main {
    companion object : ICallBack{
        @JvmStatic
        fun main(args: Array<String>) {
            var input: String

            do {
                println("==================\nGAME SUIT TERMINAL\n==================")
                println("Menu")
                println("1. Main 2 player")
                println("2. Exit")
                print("Silakan masukan pilihan : ")
                input = readLine().toString()
                when (input) {
                    "1" -> {
                        print("Pemain pertama silakan masukan nama: ")
                        val pemain1 = readLine()?.toUpperCase()
                        print("Pemain kedua silakan masukan nama : ")
                        val pemain2 = readLine()?.toUpperCase()

                        do {
                            print("$pemain1 silakan pilih (batu/gunting/kertas): ")
                            val pemainPertama = readLine()?.toLowerCase()

                            print("$pemain2 silakan pilih (batu/gunting/kertas): ")
                            val pemainKedua = readLine()?.toLowerCase()

                            val control = Controler(this)
                            if (pemain1 != null) {
                                control.caraMain(pemain1, pemain2, pemainPertama, pemainKedua)
                            }

                            println("Main lagi? (Y/N)")
                            print("Masukan pilihan: ")
                            val mainLagi = readLine().toString()

                        } while (mainLagi == "y")
                    }
                    "2" -> {
                        println("======== Good Bye ========")
                    }
                }
            } while (input != "2")
        }

        override fun printResult(result: String) {
            print("Hasil: ")
            println(result)
        }
    }
}
