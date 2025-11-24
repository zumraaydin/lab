public class Person {
    private int id;
    private String name;
    private int age;
    private int idCounter;
    public Person(){
        name ="selma";
        age= 0;
    }
    public Person(int id, String name, int age, int idCounter) {
        this.id = id;
        this.name = name;
        id= idCounter;
        this.age = age;
        this.idCounter = idCounter;
        idCounter++;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getIdCounter() {
        return idCounter;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;

    }
}

