package com.myCompany.controller;

import com.myCompany.model.User;
import com.myCompany.model.UserSearch;
import com.myCompany.service.FileIO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class UserController {


    @GetMapping("/start")
    public String userSubmit(Model model) {
        model.addAttribute("user", new User());
        return "start";
    }
    @PostMapping("/start")
    public String userSubmit(@ModelAttribute User user, HttpServletResponse response) throws IOException {

        List<String> fields = new ArrayList();
        fields.add(user.getFirstName());
        fields.add(user.getLastName());
        fields.add(user.getMiddleName());
        fields.add(user.getAge().toString());
        fields.add(user.getSalary().toString());
        fields.add(user.getEmail());
        fields.add(user.getJob());

        FileIO.fileWrite(fields);

        return "result";
    }

    @PostMapping("/search")
    public String getSearch(Model model) {
        model.addAttribute("usersearch", new UserSearch());
        return "search";
    }

}
