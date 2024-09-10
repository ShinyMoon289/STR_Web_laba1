

public class Main {
    public static void main(String[] args){
        City city1 = new City();
        City city2 = new City("Minsk",1800000,6464.757);
        WriterInfo.PrintAllInfo(city1);
        WriterInfo.PrintAllInfo(city2);

    }
}
