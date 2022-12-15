package Transport;


public class Bus extends Transport {
    private int countPlace;
    private String refill;
    private float refillConcentrat;


    public int getCountPlace() {
        return countPlace;
    }


    public Bus(String brend, String model,
               int speed, String colour,
               int dateOfCreation, String countryCreation,
               int countPlace,String refill,float refillConcentrat){
        super(brend,model,speed,countryCreation,dateOfCreation,colour);
        this.countPlace=divideIntoVariantsInt(countPlace,0);

}

    public static int divideIntoVariantsInt(int value, int defaultValue){
        if (value==0 || value<0){
            return defaultValue;
        }else {
            return value;}
    }
    public String toString(){
        return getBrend()+" "+getModel()+", "+getYearCreat()+
                " года выпуска, сборка в "+getCountryCreation()
                +", "+getColour()+" цвета, max скорость- "
                +getSpeed()+"количество посадочных"+getCountPlace;
    }
    @Override
    public void fuelPercentage(){
        this.refill=divideIntoVariants(refill,"Информация не указана");
        this.refillConcentrat=refillConcentrat;
    }
    public String getRefill() {
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

}
