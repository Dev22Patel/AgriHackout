package com.lucky.agribackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name = "Pesticides")
public class Blog {

    @Id
    @Column(name="blogid")
    int id;
    @Column(name="blogtitle")
    String title;
    @Column(name="blogyturl")
    String youtubeurl;
    @Column(name="blogcontent")
    String content;
}
