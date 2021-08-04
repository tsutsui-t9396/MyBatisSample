package com.example.mybatissample.service;

import com.example.mybatissample.mapper.ParentMapper;
import com.example.mybatissample.model.Parent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ParentService {

    private final ParentMapper parentMapper;

    public List<Parent> selectAll() {
        return parentMapper.selectAll();
    }
}
