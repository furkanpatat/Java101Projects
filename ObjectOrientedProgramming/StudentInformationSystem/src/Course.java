public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    Course(String name,String code,String prefix,Teacher teacher){
        this.name = name;
        this.teacher = teacher;
        this.code = code;
        this.prefix = prefix;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else{
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");
        }

    }
    void printTeacher(){
        this.teacher.print();
    }
}
