package com.example.mybatissample.controller;

import com.example.mybatissample.mapper.ParentMapper;
import com.example.mybatissample.model.Parent;
import com.example.mybatissample.service.ParentService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class MyBatisController {

    private final ParentMapper parentMapper;

    @GetMapping("/")
    public String list(Model model) {
        List<Parent> parentList = parentMapper.selectAll();
        model.addAttribute("parentList", parentList);
        return "list";
    }
}
