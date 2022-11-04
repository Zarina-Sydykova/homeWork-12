public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.setStudent("Dinara");
        school.setAge(20);
        school.setGroup("Java-8");

        School school1 = new School();
        school1.setStudent("Jamal");
        school1.setAge(45);
        school1.setGroup("Java-4");

        School school2 = new School();
        school2.setStudent("Kutman");
        school2.setAge(16);
        school2.setGroup("Java-7");
        School [] schools = {school,school1,school2};



        Car car = new Car();
        car.setNameOfCar("Toyota carolla");
        car.setYear(2001);
        car.setFuel("Electric");

        Car car1 = new Car();
        car1.setNameOfCar("Honda Fit");
        car1.setYear(2013);
        car1.setFuel("Petrol");

        Car car2= new Car();
        car2.setNameOfCar("Hummer 3");
        car2.setYear(2022);
        car2.setFuel("Gas");
        Car [] cars = {car,car1,car2};



        Person person = new Person();
        person.setFullName("Kalikova Kanikey");
        person.setJobTitle("Teacher");
        person.setFamilyStatus("Single");

        Person person1 = new Person();
        person1.setFullName("Nurmatov Abu");
        person1.setJobTitle("Soccer");
        person1.setFamilyStatus("Married");

        Person person2 = new Person();
        person2.setFullName("Mirlanova Aysuluu");
        person2.setJobTitle("Student");
        person2.setFamilyStatus("Ringed");
        Person [] persons = {person,person1,person2};


        University university = new University();
        university.setName("Harvard");
        university.setAddress("Cambridge");
        university.setYear(1636);

        University university1 = new University();
        university1.setName("Manas university");
        university1.setAddress("Djal");
        university1.setYear(1995);

        University university2 = new University();
        university2.setName("ODTU");
        university2.setAddress("Ankara");
        university2.setYear(1956);
        University [] universities = {university,university1,university2};



        schoolMethod(schools);
        methodCar(cars);
        personMethod(persons);
        universitymethod(universities);

    }
    public static void schoolMethod(School [] schools){
        for (School school:schools) {
            System.out.println(school.getStudent());
            System.out.println(school.getAge());
            System.out.println(school.getGroup());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }
    public static void methodCar(Car [] cars){
        for (Car car:cars) {
            System.out.println(car.getNameOfCar());
            System.out.println(car.getYear());
            System.out.println(car.getFuel());

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void personMethod(Person [] persons){
        for (Person person:persons) {
            System.out.println(person.getFullName());
            System.out.println(person.getJobTitle());
            System.out.println(person.getFamilyStatus());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void universitymethod(University [] universities){
        for (University university:universities) {
            System.out.println(university.getName());
            System.out.println(university.getAddress());
            System.out.println(university.getYear());
        }
    }
}