package org.example.polimorfismo2.models;


import java.util.ArrayList;

public class Dbs {
    private ISudent estudiantesDbs1 =  new Dbs1();
    private ISudent estudiantesDbs2 =  new Dbs2();
    private ISudent estudiantesDbs3 =  new Dbs3();

    public boolean addStudent(Student newStudent) {
        boolean bandera;
        if (estudiantesDbs1.save(newStudent) && estudiantesDbs2.save(newStudent) &&  estudiantesDbs3.save(newStudent)){
            System.out.println("Registro exitoso");
            bandera=true;
        }
        else {
            bandera=false;
            System.out.println("Error al registrar el registro");
        }
        return bandera;
    }
    public boolean updataStudent(Student editedStudent){
        boolean bandera=false;
        if (estudiantesDbs1.upDate(editedStudent) && estudiantesDbs2.upDate(editedStudent)&&estudiantesDbs3.upDate(editedStudent)){
            bandera=true;
        }
        return bandera;
    }
    public ArrayList<Student> getStudentDbs3(){return estudiantesDbs3.getStudent();}

    public ArrayList<Student> getStudentDbs1() {return estudiantesDbs1.getStudent();}

    public ArrayList<Student> getStudentDbs2() {return estudiantesDbs2.getStudent();}
}