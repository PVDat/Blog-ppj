package kz.pj.blog.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "blog_tag",
            joinColumns = {@JoinColumn(name = "blog_id")},
            inverseJoinColumns = {@JoinColumn(name = "tag_id")}
    )
    private List<Tag> tagList;

    public Blog() {
    }

    public Blog(String tittle, String description, String content) {
        this.title = tittle;
        this.description = description;
        this.content = content;
    }


}
