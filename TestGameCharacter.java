public class TestGameCharacter {

    GameCharacter c1 = new GameCharacter ( "warrior" , 1, 100);
    c1.takeDamage(30);
    c1.heal(10);

    System.out.println("health"+ c1.getHealth()+c1.getLevel());
    System.out.println (c1.getInfo());
}
