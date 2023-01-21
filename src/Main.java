public class Main {
    public static void main(String[] args) {

        Person [] person={
              new Programmer(),
                new Dancer(),
                new Singner()};


        for (Person method:person) {
            method.walk();

        }



}
}