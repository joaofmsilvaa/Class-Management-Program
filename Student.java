package estudo;

public class Student {
    private String fName;
    private String Lname;
    private int nAluno;

    public Student() {
    }

    public Student(int nAluno, String fName, String lname) {
        this.fName = fName;
        Lname = lname;
        this.nAluno = nAluno;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public int getnAluno() {
        return nAluno;
    }

    public void setnAluno(int nAluno) {
        this.nAluno = nAluno;
    }

}

