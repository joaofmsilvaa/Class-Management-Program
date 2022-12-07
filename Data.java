package estudo;

import java.util.ArrayList;

public class Data {
    private ArrayList<Student> stus;
    private ArrayList<Subject> subs;
    //private Student2 stu;


    public Data() {
        this.subs = new ArrayList<Subject>();
        this.stus = new ArrayList<Student>();
        //this.stu = new Student2();
        this.addInitialStu();
        this.addInitialSubs();
    }


    public void addInitialStu(){
        this.stus.add(new Student(1,"Tiago","Panazete"));
        this.stus.add(new Student(2,"Joao", "Silva"));
        this.stus.add(new Student(3,"Nuno", "Rodrigues"));
        this.stus.add(new Student(4,"Bruno", "Estevao"));
    }

    public void addInitialSubs(){
        this.subs.add(new Subject("Digital Systems",1,1));
        this.subs.add(new Subject("Data bases",1,2));
        this.subs.add(new Subject("Programming languages",2,1));
        this.subs.add(new Subject("Computer networks",2,2));
        this.subs.add(new Subject("web applications development",3,1));
        this.subs.add(new Subject("Systems administration",3,2));
    }


    public ArrayList<Subject> getSubs(){
        return this.subs;
    }

    public void addstu(Student newStu) {
        this.stus.add(newStu);

    }

    public void addsub(Subject newSub) {
        this.subs.add(newSub);

    }

    public ArrayList<Student> getStus(){
        return this.stus;
    }

    public void rmstu(int index){
        this.stus.remove(index);
    }

    public void rmSub(int index){
        this.subs.remove(index);
    }

    public void setNstud(int i,int id,String fName,String lName){
        this.stus.set(i,new Student(id,fName,lName));
    }

    public void setNsub(int i,int year,int semester,String name){
        this.subs.set(i,new Subject(name,year,semester));
    }

}