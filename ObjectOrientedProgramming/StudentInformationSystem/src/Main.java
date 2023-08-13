public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","90500000000","HSTRY");
        Teacher t2 = new Teacher("Graham Bell","000000","PHY");
        Teacher t3 = new Teacher("Aziz Sancar","000001","CHM");


        Course history = new Course("History","101","HSTRY",t1);
        history.addTeacher(t1);

        Course physics = new Course("Physics","102","PHY",t2);
        physics.addTeacher(t2);

        Course chemistry = new Course("Chemistry","103","CHM",t3);
        chemistry.addTeacher(t3);



        Student s1 = new Student("Albert Einstein","1","A",history,physics,chemistry);
        s1.addBulkExamNote(100,78,50);  
        s1.isPass();

        Student s2 = new Student("Openheimer","2","A",history,physics,chemistry);
        s2.addBulkExamNote(98,1010,100);
        s2.isPass();
    }
}