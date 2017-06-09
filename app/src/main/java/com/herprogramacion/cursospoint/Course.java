package com.herprogramacion.cursospoint;

/**
 * POJO para los cursos
 */
public class Course {
    private String name;
    private String description;
    private String author;
    private float rating;
    private int students;
    private int idImage;

    public Course(String name,
                  String description,
                  String author,
                  float rating,
                  int students,
                  int idImage) {
        this.name = name;
        this.description = description;
        this.author = author;
        this.rating = rating;
        this.students = students;

        this.idImage = idImage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public float getRating() {
        return rating;
    }

    public int getStudents() {
        return students;
    }

    public int getIdImage() {
        return idImage;
    }
}
