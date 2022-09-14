public class main {

    public static void main(String[] args) {

        Teacher t1=new Teacher("CENK TEACHER","111","BIO");
        Teacher t2 =new Teacher("JOSEPH TEACHER","222","MAT");
        Teacher t3=new Teacher("GÜLÇİN TEACHER","333","KİM");

        Course bio =new Course("BIOLOGY","101","BIO");
        bio.addTeacher(t1);
        Course mat =new Course("Mathematics","102","MAT");
        mat.addTeacher(t2);
        Course kimya =new Course("kimya","103","KİM");
        kimya.addTeacher(t3);

        Student s1 =new Student("EREN KAYA",1,"01",mat,bio,kimya);
        s1.addBulkExamNote(100,100,100);
        s1.isPass();

        Student s2 =new Student("CENKER AYDIN",1,"02",mat,bio,kimya);
        s2.addBulkExamNote(78,55,66);
        s2.isPass();
    }




}
