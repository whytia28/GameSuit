class Controler {
    fun caraMain(
        pemain1: String?,
        pemain2: String?,
        pemainSatu: String?,
        pemainDua: String?
    ){

        if (pemainSatu == "batu" && pemainDua == "gunting"
                || pemainSatu == "gunting" && pemainDua == "kertas"
                || pemainSatu == "kertas" && pemainDua == "batu"){
                println("$pemain1 MENANG!")

            } else if (pemainDua == "batu" && pemainSatu == "gunting"
                || pemainDua == "gunting" && pemainSatu == "kertas"
                || pemainDua == "kertas" && pemainSatu == "batu"){
                println("$pemain2 MENANG!")

            } else if (pemain1 == pemain2){
                println("DRAW!")
            } else {
                println("Pilihan salah!!")
            }
    }
}