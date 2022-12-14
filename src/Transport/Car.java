package Transport;

public class Car extends Transport{
    /*private  String brend;
    private  String model;
    private int maxSpeed;
    private String colour;
    private final int dateOfCreation;
    private final String countryCreation;*/
    public Car(String brend, String model,
               int speed, String colour,
               int dateOfCreation, String countryCreation){
        super(brend,model,speed,colour,countryCreation,dateOfCreation);
        /*this.brend=divideIntoVariants(brend,"Информация не указана");
        this.model=divideIntoVariants(model,"Информация не указана");
        if (maxSpeed>0){
            this.maxSpeed=maxSpeed;}
        this.colour=divideIntoVariants(colour,"не указан");
        this.countryCreation=divideIntoVariants(countryCreation,"Информация не указана");
        this.dateOfCreation=dateOfCreation;*/


    }
    /*public String getBrend() {
        return brend;
    }
    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getColour() {
        return colour;
    }
    public int getDateOfCreation() {
        return dateOfCreation;
    }
    public String getCountryCreation() {
        return countryCreation;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed>0 && maxSpeed!=0){
            this.maxSpeed = maxSpeed;}
    }

    public void setColour(String colour) {
        this.colour = divideIntoVariants(colour,getColour());
    }*/


    public String toString(){
        return getBrend()+" "+getModel()+", "+getYearCreat()+
                " года выпуска, сборка в "+getCountryCreation()
                +", "+getColour()+" цвета, max скорость- "+getSpeed();
    }
    public static String divideIntoVariants(String value,String defaultValue){
        if (value==null || value.isBlank()){
            return defaultValue;
        }else {
            return value;}}
}
