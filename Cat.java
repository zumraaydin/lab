public class Cat {
    public int x;
    public  double direction;
    public String name;

    public Cat() {
        x = 0;
        direction = 180;
        name = "sofya";
    }

    public Cat(int x, double direction, String name) {
        this.x = x;
        this.direction = direction;
        this.name = name;
    }

    public void move (){
        x= x+  20;
    }
    public void move2(int a){
        x= x+a;

    }
    public void turn(double angle){
        direction = direction + angle;
    }
    public void status(){
        System.out.println("name"+name+ "x"+ x+ "direction"+direction);
    }

}



