public class StudentClassForAssignmentFeb24 {

    private String name;
    private int age;
    private int classNumber;
    public StudentClassForAssignmentFeb24(String name,int age,int classNumber){
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "StudentClassForAssignmentFeb24{" +
                "age='" + age + '\'' +
                ", name=" + name +
                ", className=" + classNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
}
