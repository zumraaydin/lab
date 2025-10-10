public class StaticLifeTime {
    static int counter=0;

    void incrementCounter(){
        counter++;
        System.out.println("counter="+ counter);

    }
    public static void main (String[]args){
        StaticLifeTime obje1 = new StaticLifeTime();
        StaticLifeTime obje2 = new StaticLifeTime();

        obje1.incrementCounter();
        obje2.incrementCounter();
    }
}
