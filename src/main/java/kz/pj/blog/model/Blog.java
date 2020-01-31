package kz.pj.blog.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String description;
    private String content;

    public Blog() {
    }

    public Blog(String tittle, String description, String content) {
        this.title = tittle;
        this.description = description;
        this.content = content;
    }


}
