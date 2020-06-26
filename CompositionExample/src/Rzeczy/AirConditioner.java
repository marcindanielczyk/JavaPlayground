package Rzeczy;

public class AirConditioner {

    private String refNumber;
    private String model;
    private int power;
    private int noiseLevel;

    public AirConditioner(String refNumber, String model, int power, int noiseLeverl) {
        this.refNumber = refNumber;
        this.model = model;
        this.power = power;
        this.noiseLevel = noiseLevel;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(int noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    @Override
    public String toString() {
        return refNumber;
    }
}
