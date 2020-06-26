package typwyliczeniowy;

public class MetodaAmeryka {


    String panstwoStolica(AmerykaPlnPanstwa panstwo) {
        if (panstwo == AmerykaPlnPanstwa.ANTIGUA_I_BARBUDA) {
            return "Saint John's";
        } else if (panstwo == AmerykaPlnPanstwa.BAHAMY) {
            return "Nassau";
        } else if (panstwo == AmerykaPlnPanstwa.BARBADOS){
            return "Bridgetown";
        }
        return null;
    }
}
