public class Main {
    public static void main(String[] args) throws Exception {
        var male = new Person("joão");
        male.incAge();
        var famale = new Person("Maria");
        male.incAge();

        System.out.println("male namem: " + male.getName() + " age: " + male.getAge());
        System.out.println("famale namem: " + famale.getName() + " age: " + famale.getAge());
    }
}
