package kz.pj.blog.repository;

import kz.pj.blog.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITagRepository extends JpaRepository<Tag, Long> {
}
