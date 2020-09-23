package com.bai.service;

import com.bai.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author bai
 * @create 2020-09-17-15:03
 */
public interface TypeService {

    // 新增分类
    Type saveType(Type type);

    // 分类查询
    Type getType(Long id);

    // 根据分类名称判断是否重名
    Type getTypeByName(String name);

    // 分类分页处理
    Page<Type> listType(Pageable pageable);

    // 获取到所有的分类
    List<Type> listType();

    // 获取到分类的前几个
    List<Type> listTypeTop(Integer size);

    // 分类修改
    Type updateType(Long id, Type type);

    // 分类删除
    void deleteType(Long id);

}
