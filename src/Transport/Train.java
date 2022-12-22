package Transport;

public class Train extends Transport{
    private int costTravel;
    private int timeTravel;
    private String nameStationStartTravel;
    //
    private String nameStationFinishTravel;
    private int countVagonov;
    private String refill;
    private float refillConcentrat;
    public Train(String brend, String model,
                 int speed, String colour,
                 int dateOfCreation, String countryCreation,
                 int costTravel,int timeTravel,String nameStationStartTravel,
                 String nameStationFinishTravel,int countVagonov,String refill,float refillConcentrat){
        super(brend,model,speed,countryCreation,dateOfCreation,colour);
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
    @Override
    public void fuelPercentage(){
        this.refill=divideIntoVariants(refill,"Информация не указана");
        this.refillConcentrat=refillConcentrat;

    } public String getRefill() {
        return refill;
    }
    public float getRefillConcentrat() {
        return refillConcentrat;
    }

    public void setRefillConcentrat(float refillConcentrat) {
        this.refillConcentrat = refillConcentrat;
    }

    public void setRefill(String refill) {
        this.refill = divideIntoVariants(refill,getRefill());
    }

    @Override
    public String toString(){
        return getBrend()+" "+getModel()+", "+getYearCreat()+
                " года выпуска, сборка в "+getCountryCreation()
                +", "+getColour()+" цвета, max скорость- "+getSpeed()+"заправляется "+getRefill()+
                "концентрация топлива "+getRefillConcentrat()+
                ",конечная станция "+getNameStationFinishTravel()+", начальная станция "+getNameStationStartTravel()
                +"стоимость поездки "+ getCostTravel()+",время поездки "+getTimeTravel()+", всего"+getCountVagonov()+" вагонов";
    }
}
