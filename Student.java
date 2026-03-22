public class Student {
    public static void main(String[] args) {
        System.out.println("Pokemon Master!!");
    }
    private String name;
    private String branch;

    public Student(String name, String branch) {
            this.name = name;
        this.branch = branch;
    }

    public void study() {
        System.out.println(name + "is studying core Java.");
    }
}
// Class is the blueprint that defines properties (fields) and methods (functions).
// Class is a user defined data type having methods
// Object is an instance of a class that occupies memory
// Objects are used to call those methods.

