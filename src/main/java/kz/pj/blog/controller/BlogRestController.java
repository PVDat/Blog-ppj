package kz.pj.blog.controller;


import kz.pj.blog.model.Blog;
import kz.pj.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
public class BlogRestController {

    @Autowired
    private IBlogService blogService;

    @PostMapping("/newBlog")
    public ResponseEntity<Blog> addBlog(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity<>(blog, HttpStatus.CREATED);
    }

    @GetMapping("/blogList")
    public ResponseEntity<List<Blog>> getBlogList() {
        List<Blog> blogList = blogService.findAll();
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @PutMapping("/updateBlog")
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @DeleteMapping("/deleteBlog/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable("id") long id) {
        blogService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
