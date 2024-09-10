import java.security.InvalidParameterException;
class City {
    private String Name;
    private int Population;
    private double Area;     //please set area in sq km!!
    public String getName()
    {
        return Name;
    }
    public void setName(String newn){
        Name=newn;
    }

    public int getPopulation(){
        return Population;
    }
    public void setPopulation(int newpop){
        try{
            if(newpop<0)
            {
                throw new InvalidParameterException("Negative value not allowed!");
            }
            else Population=newpop;
        }
        catch (InvalidParameterException e){
            System.out.println(e.toString());
        }
    }

    public double getArea(){
        return Population;
    }
    public void setArea(double newArea){
        try{
            if(newArea<0)
            {
                throw new InvalidParameterException("Negative value not allowed!");
            }
            else Area=newArea;
        }
        catch (InvalidParameterException e){
            System.out.println(e.toString());
        }
    }

    public City(){      //default constructor
        Area=300.545;
        Population=300000;
        Name="Muhosransk";
    }
    public City(String newName,int newPop,double newArea){
        setArea(newArea);
        setPopulation(newPop);
        setName(newName);
    }

}