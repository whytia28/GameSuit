class Controler(val iCallBack: ICallBack) {
    fun caraMain(
        pemain1: String?,
        pemain2: String?,
        pemainSatu: String?,
        pemainDua: String?
    ) {
        if (pemainSatu == "batu" && pemainDua == "gunting"
            || pemainSatu == "gunting" && pemainDua == "kertas"
            || pemainSatu == "kertas" && pemainDua == "batu"
        ) iCallBack.printResult("$pemain1 Menang!")
        else if (pemainDua == "batu" && pemainSatu == "gunting"
            || pemainDua == "gunting" && pemainSatu == "kertas"
            || pemainDua == "kertas" && pemainSatu == "batu"
        ) iCallBack.printResult("$pemain2 Menang!")
        else if (pemainSatu == pemainDua) iCallBack.printResult("Draw!")
        else iCallBack.printResult("Pilihan salah!")
    }

}