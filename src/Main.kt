class Main {
    companion object : ICallBack {
        @JvmStatic
        fun main(args: Array<String>) {
            var exit = false
            while (!exit) {
                println("==================\nGAME SUIT TERMINAL\n==================")
                println("Menu")
                println("1. Main 2 player")
                println("2. Exit")
                print("Silakan masukan pilihan : ")
                when (readLine().toString()) {
                    "1" -> {
                        print("Pemain pertama silakan masukan nama: ")
                        val pemain1 = readLine()?.toUpperCase()
                        println("Pemain pertama adalah $pemain1\n==========")
                        print("Pemain kedua silakan masukan nama : ")
                        val pemain2 = readLine()?.toUpperCase()
                        println("Pemain kedua adalah $pemain2\n==========")

                        do {
                            println("$pemain1 silakan pilih: (batu/gunting/kertas)")
                            val pemainPertama = readLine()

                            println("$pemain2 silakan pilih: (batu/gunting/kertas)")
                            val pemainKedua = readLine()

                            val control = Controler()
                            if (pemain1 != null) {
                                control.caraMain(pemain1, pemain2, pemainPertama, pemainKedua)
                            }

                            println("Main lagi? (Y/N)")
                            print("Masukan pilihan: ")
                            val mainLagi = readLine().toString()

                        } while (mainLagi == "y")
                    }
                    "2" -> exit = true
                }
            }
        }

        override fun hasilBalik(hasil: String) {
        }
    }
}
