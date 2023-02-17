public class Runner {

    public static void main(String[] args){
        Planet planet1 = new Planet("Mercury", 43.22);
        System.out.println(planet1.getName());
        System.out.println(planet1.getSize());
        System.out.println(planet1.explode());

        System.out.println(planet1.getName() + " is " + planet1.getSize());
        System.out.println(planet1.explode());
    }
}
