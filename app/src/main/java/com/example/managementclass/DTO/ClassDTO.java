package com.example.managementclass.DTO;

public class ClassDTO {
    private int idClass;
    private String nameClass;
    private int numberStudent;
    private int idFaculty;

    public ClassDTO(int idClass, String nameClass, int numberStudent, int idFaculty) {
        this.idClass = idClass;
        this.nameClass = nameClass;
        this.numberStudent = numberStudent;
        this.idFaculty = idFaculty;
    }

    public ClassDTO() {
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getNumberStudent() {
        return numberStudent;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    public int getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(int idFaculty) {
        this.idFaculty = idFaculty;
    }
}
