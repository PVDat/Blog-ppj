package kz.pj.blog.service.Impl;

import kz.pj.blog.model.Blog;
import kz.pj.blog.repository.IBlogRepository;
import kz.pj.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

}
