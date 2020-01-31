package kz.pj.blog.repository;


import kz.pj.blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IBlogRepository extends JpaRepository<Blog, Long>{
}
