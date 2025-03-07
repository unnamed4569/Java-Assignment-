public class Assignment10 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) { 
            this.age = newAge;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    public static void main(String[] args) {
        Assignment10 person = new Assignment10();
        person.setName("Sajan Lama");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
