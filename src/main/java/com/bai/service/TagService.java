package com.bai.service;

import com.bai.entity.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author bai
 * @create 2020-09-17-15:03
 */
public interface TagService {

    // 新增标签
    Tag saveTag(Tag tag);

    // 标签查询
    Tag getTag(Long id);

    // 根据标签名称判断是否重名
    Tag getTagByName(String name);

    // 标签分页处理
    Page<Tag> listTag(Pageable pageable);

    // 获取到所有的标签
    List<Tag> listTag();

    // 获取到标签前几条
    List<Tag> listTagTop(Integer size);

    // 获取到所有标签的ID
    List<Tag> listTag(String ids);

    // 标签修改
    Tag updateTag(Long id, Tag tag);

    // 标签删除
    void deleteTag(Long id);
}
