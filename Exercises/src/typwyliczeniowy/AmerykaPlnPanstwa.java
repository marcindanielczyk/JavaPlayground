package typwyliczeniowy;

public enum AmerykaPlnPanstwa {
    ANTIGUA_I_BARBUDA("stolicaAntigua"),
    BAHAMY("stolicaBahamy"),
    BARBADOS("stolicaBarbados"),
    BELIZE("stolicaBelize");

    private final String stolica;

    AmerykaPlnPanstwa(String stolica){
        this.stolica = stolica;
    }

    public String getStolica(){
        return this.stolica;
    }

//    DOMINIKA,
//    DOMINIKANA,
//    GRENADA,
//    GWATEMALA,
//    HAITI,
//    HONDURAS,
//    JAMAJKA,
//    KANADA,
//    KOSTARYKA,
//    KUBA,
//    MEKSYK,
//    NIKARAGUA,
//    PANAMA,
//    SAINT_KITTS_I_NEVIS,
//    SAINT_LUCIA,
//    SAINT_VINCENT_I_GRENADYNY,
//    SALWADOR,
//    STANY_ZJEDNOCZONE
}
