package kz.pj.blog.service;

import kz.pj.blog.model.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITagService {
    List<Tag> findAll();
}
