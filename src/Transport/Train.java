package Transport;

public class Train extends Transport{
    private int costTravel;
    private int timeTravel;
    private String nameStationStartTravel;
    private String nameStationFinishTravel;
    private int countVagonov;
    public Train(String brend, String model,
                 int speed, String colour,
                 int dateOfCreation, String countryCreation,
                 int costTravel,int timeTravel,String nameStationStartTravel,
                 String nameStationFinishTravel,int countVagonov){
        super(brend,model,speed,colour,countryCreation,dateOfCreation);
        this.costTravel=divideIntoVariantsInt(costTravel,0);
        this.countVagonov=divideIntoVariantsInt(countVagonov,0);
        this.nameStationFinishTravel=divideIntoVariants(nameStationFinishTravel,"без имени");
        this.nameStationStartTravel=divideIntoVariants(nameStationStartTravel,"без имени");
    }

    public int getCountVagonov() {
        return countVagonov;
    }

    public int getCostTravel() {
        return costTravel;
    }

    public int getTimeTravel() {
        return timeTravel;
    }

    public String getNameStationFinishTravel() {
        return nameStationFinishTravel;
    }

    public String getNameStationStartTravel() {
        return nameStationStartTravel;
    }

    public void setCostTravel(int costTravel) {
        this.costTravel = costTravel;
    }

    public void setCountVagonov(int countVagonov) {
        this.countVagonov =divideIntoVariantsInt( countVagonov,getCountVagonov());
    }

    public void setNameStationFinishTravel(String nameStationFinishTravel) {

        this.nameStationFinishTravel=divideIntoVariants(nameStationFinishTravel,getNameStationFinishTravel());
    }

    public void setNameStationStartTravel(String nameStationStartTravel) {
        this.nameStationFinishTravel=divideIntoVariants(nameStationFinishTravel,getNameStationStartTravel());
    }

    public void setTimeTravel(int timeTravel) {
        this.timeTravel =divideIntoVariantsInt( timeTravel,getTimeTravel());
    }

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
}
