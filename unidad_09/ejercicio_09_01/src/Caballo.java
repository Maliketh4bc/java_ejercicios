public class Caballo {

    private String name;
    private String color;
    private int age;
    private int wins;

    Caballo (String name, String color, int age, int wins){
        this.name = name;
        this.color = color;
        this.age = age;
        this.wins = wins;
    }

    public String getName(){
        return this.name;
    }

    public void cabalga(){
        System.out.println(this.name + " cabalga pila");
    }

    public void relincha(){
        System.out.println("jijijija");
    }

    public void rumia(){
        System.out.println("mmmmmmmmmm");
    }
}