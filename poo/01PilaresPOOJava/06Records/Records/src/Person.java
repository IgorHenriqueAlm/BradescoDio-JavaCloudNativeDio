// Declarção de atributos nos parametros e, todos atributos declarados são altomaticamente private,final e usado no construtor dele
public record Person(String name, int age) {
    
    public Person{
    }

    public Person(String name){
        this(name, 1);
    }

    public String getInfor() {
        return "name: " + name + " age: " + age;
    }
}
