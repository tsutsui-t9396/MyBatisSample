package com.example.mybatissample.mapper;

import com.example.mybatissample.model.Parent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ParentMapper {

    List<Parent> selectAll();

    Long count();
}
