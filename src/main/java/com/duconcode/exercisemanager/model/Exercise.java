package com.duconcode.exercisemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Exercise implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String movementKind;
    private String muscleGroup;
    private String tutorialLink;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String exerciseCode;

    public Exercise() {}

    public Exercise(Long id, String name, String movementKind, String muscleGroup, String tutorialLink, String imageUrl,
            String exerciseCode) {
        this.name = name;
        this.movementKind = movementKind;
        this.muscleGroup = muscleGroup;
        this.tutorialLink = tutorialLink;
        this.imageUrl = imageUrl;
        this.exerciseCode = exerciseCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovementKind() {
        return movementKind;
    }

    public void setMovementKind(String movementKind) {
        this.movementKind = movementKind;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public String getTutorialLink() {
        return tutorialLink;
    }

    public void setTutorialLink(String tutorialLink) {
        this.tutorialLink = tutorialLink;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getExerciseCode() {
        return exerciseCode;
    }

    public void setExerciseCode(String exerciseCode) {
        this.exerciseCode = exerciseCode;
    }

    @Override
    public String toString() {
        return "Exercise{" + "id=" + id + ", name='" + name + '\'' + ", movementKind='" + movementKind + '\'' + ", muscleGroup='"
                + muscleGroup + '\'' + ", tutorialLink='" + tutorialLink + '\'' + ", imageUrl='" + imageUrl + '\'' + ", exerciseCode='"
                + exerciseCode + '\'' + '}';
    }
}
