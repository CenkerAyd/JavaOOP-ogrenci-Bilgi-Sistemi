public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int bio;
    int kimya;
    int mat;
    public Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note =0;
        this.bio =bio;
        this.kimya=kimya;
        this.mat=mat;


    }

   void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else {
            System.out.println(teacher.name +"Akdemisyeni ile ders uyuşmuyor");
        }
    }

    public void printTeacher(){
        if (teacher!=null){
            System.out.println(this.name +"dersinin akademisyeni :" +teacher.name);
        }else{
            System.out.println(this.name +"dersine akademisyen atanmamıştır.");
        }
    }
}
