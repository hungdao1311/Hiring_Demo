package com.HiringManagement.demo.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Job {

    private @Id @GeneratedValue Long id;
    private String description;


    Job() {}

}
