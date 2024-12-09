package com.klef.jfsd.exam;

import com.klef.jfsd.exam.model.Comment;
import com.klef.jfsd.exam.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService CommentService;

    @GetMapping("/comments")
    public List<Comment> getAllComments() {
        return CommentService.fetchAllComments();
    }
}
