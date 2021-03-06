package kz.pj.blog.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToMany(targetEntity = Blog.class)
    private List<Blog> blogList;
    public Tag(){
    }
}
