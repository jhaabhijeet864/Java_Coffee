package Practical;

class Student {
    private int id;
    private String name;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(12201);
        s.setName("Abhijeet Jha");
        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
