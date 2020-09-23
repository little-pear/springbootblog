package com.bai.service;

import com.bai.entity.Comment;

import java.util.List;

/**
 * @author bai
 * @create 2020-09-22-22:13
 */
public interface CommentService {

    // 获取整个评论列表
    List<Comment> listCommentByBlogId(Long blogId);

    // 进行评论数据的保存
    Comment saveComment(Comment comment);
}
