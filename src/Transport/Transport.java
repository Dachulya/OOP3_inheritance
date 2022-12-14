package Transport;

public class Transport {
    protected String brend;
    protected String model;
    protected int yearCreat;
    protected String countryCreation;
    protected int speed;

    private String colour;
    public static String divideIntoVariants(String value,String defaultValue){
        if (value==null || value.isBlank()){
            return defaultValue;
        }else {
            return value;}}
    public static int divideIntoVariantsInt(int value, int defaultValue){
        if (value==0 || value<0){
            return defaultValue;
        }else {
            return value;}
    }

    public Transport(int speed) {
        this.speed = speed;
    }

    public Transport(String brend, String model, int yearCreat, String countryCreation, int speed) {
        this.brend=divideIntoVariants(brend,"Информация не указана");

        this.model=divideIntoVariants(model,"Информация не указана");

        this.yearCreat = yearCreat;

        this.countryCreation=divideIntoVariants(countryCreation,"Информация не указана");

        this.yearCreat=yearCreat;

        this.colour=divideIntoVariants(colour,"не указан");

    }

    public String getBrend() {
        return brend;
    }

    public String getModel() {
        return model;
    }

    public int getYearCreat() {
        return yearCreat;
    }

    public String getCountryCreation() {
        return countryCreation;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColour() {
        return colour;
    }

    public void setSpeed(int speed) {
        this.speed =divideIntoVariantsInt( speed,getSpeed();
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
