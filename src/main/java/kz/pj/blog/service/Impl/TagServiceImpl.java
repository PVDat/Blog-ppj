package kz.pj.blog.service.Impl;

import kz.pj.blog.model.Tag;
import kz.pj.blog.repository.ITagRepository;
import kz.pj.blog.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TagServiceImpl implements ITagService {

    @Autowired
    private ITagRepository tagRepository;

    @Override
    public List<Tag> findAll() {
        return null;
    }
}
