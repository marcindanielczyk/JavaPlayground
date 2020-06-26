package typwyliczeniowy;

public enum AmerykaPlnPanstwa2 implements ZwracaczStolicy{
    ANTIGUA_I_BARBUDA{
        @Override
        public String getStolica() {
            return "stolicaAntigua";
        }
    },
    BAHAMY{
        @Override
        public String getStolica() {
            return "stolicaBahamy";
        }
    },
    BARBADOS{
        @Override
        public String getStolica() {
            return "stolicaBarbados";
        }
    },
    BELIZE{
        @Override
        public String getStolica() {
            return "stolicabelize";
        }
    };


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
