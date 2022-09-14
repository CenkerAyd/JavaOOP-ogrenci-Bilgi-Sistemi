public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course bio;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course bio,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.bio = bio;
        this.kimya = kimya;
        this.isPass = false;

    }


    public void addBulkExamNote(int mat , int biyo , int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (biyo >= 0 && biyo <= 100) {
            this.bio.note = biyo;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }



    public void isPass() {
        if (this.mat.note == 0 || this.bio.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {

       avarage= (this.mat.note +this.bio.note+this.kimya.note)/3;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Ortalaması : " +this.avarage);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.bio.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}

