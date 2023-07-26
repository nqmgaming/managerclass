package com.example.managementclass.DTO;

public class FacultyDTO {
    private int idFaculty;
    private String nameFaculty;

    public FacultyDTO() {
    }

    public FacultyDTO(int idFaculty, String nameFaculty) {
        this.idFaculty = idFaculty;
        this.nameFaculty = nameFaculty;
    }

    public int getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(int idFaculty) {
        this.idFaculty = idFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }
}
