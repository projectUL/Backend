package com.example.demo.model;

import com.example.demo.ExtraClasses.Description;
import com.example.demo.ExtraClasses.Experience;
import com.example.demo.ExtraClasses.Project;
import com.example.demo.ExtraClasses.Skills;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document(collection="userProfile")
public class UserProfile {

    @Id
    private String id;
    String userEmail;
    Description description;
    Skills skills;
    List<Experience> experience = new ArrayList<Experience>();
    List<Project> projects = new ArrayList<Project>();



}
