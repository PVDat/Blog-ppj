package kz.pj.blog.service;

import kz.pj.blog.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBlogService {

    void save(Blog blog);

    void delete(Long id);

    List<Blog> findAll();
}
