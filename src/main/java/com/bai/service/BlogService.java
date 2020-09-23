package com.bai.service;

import com.bai.entity.Blog;
import com.bai.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author bai
 * @create 2020-09-19-15:49
 */
public interface BlogService {

    // 根据ID来查询博客
    Blog getBlog(Long id);

    Blog getAndConvert(Long id);

    // 根据分页以及条件进行博客的查询
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    // 从最新的开始查询博客内容
    List<Blog> listRecommendBlogTop(Integer size);

    // 全局搜索博客内容
    Page<Blog> listBlog(String query, Pageable pageable);

    // 根据ID查询博客内容
    Page<Blog> listBlog(Long tagId, Pageable pageable);

    // 博客的新增
    Blog saveBlog(Blog blog);

    // 根据年份来查找博客内容
    Map<String, List<Blog>> archiveBlog();

    // 博客的总数量
    Long countBlog();

    // 博客的修改
    Blog updateBlog(Long id, Blog blog);

    // 博客的删除
    void deleteBlog(Long id);

    // 根据分页进行博客的查询
    Page<Blog> listBlog(Pageable pageable);

}
