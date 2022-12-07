package estudo;

public class Subject {
    private int curricYear;
    private int semester;
    private String subjectName;

    public Subject() {
    }

    public Subject(String subjectName, int curricYear, int semester) {
        this.subjectName = subjectName;
        this.curricYear = curricYear;
        this.semester = semester;
    }

    public int getCurricYear(){
        return curricYear;
    }

    public void setSubjectName(int curricYear) {
        this.curricYear = curricYear;
    }

    public int getSemester(){
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSubjectName(){
        return subjectName;
    }
    public void setCurricYear(String subjectName) {
        this.subjectName = subjectName;
    }
}
