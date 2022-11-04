public class Car {
    private String nameOfCar;
    private int year;
    private String fuel;
    public  void setNameOfCar(String nameOfCar){
        this.nameOfCar=nameOfCar;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setFuel(String fuel){
        this.fuel=fuel;
    }
    String getNameOfCar(){
        return nameOfCar;
    }
    int getYear(){
        return year;
    }
    String getFuel(){
        return fuel;
    }
}
