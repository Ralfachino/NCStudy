package com.myCompany.controller;

import com.myCompany.model.User;
import com.myCompany.model.UserSearch;
import com.myCompany.service.FileIO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
public class RestUserController {
    @Value("${upload.path}")
    private String uploadPath;

    @PostMapping("/get-user")
    public List<String> getUser(@ModelAttribute UserSearch userSearch) throws FileNotFoundException {
        List<String> resultSearch = FileIO.fileSearch(userSearch.getFirstNameS(), userSearch.getLastNameS());
        if(resultSearch.isEmpty()) {
            resultSearch.add("User is not found");
            return resultSearch;
        }
        return FileIO.fileSearch(userSearch.getFirstNameS(), userSearch.getLastNameS());
    }

    @PostMapping("/upload")
    public List<String> handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        if(file != null) {
            String resultFileName = file.getOriginalFilename();
            File uploadDir = new File(uploadPath + resultFileName);

            return FileIO.fileRead(uploadDir);
        }
        return new ArrayList<String>();
    }

}
