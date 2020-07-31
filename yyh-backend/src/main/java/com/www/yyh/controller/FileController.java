package com.www.yyh.controller;

import com.www.yyh.pojo.UploadFileEntity;
import com.www.yyh.utils.DownloadKit;
import com.www.yyh.utils.UploadKit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/file")
public class FileController {
    @PostMapping(value = "/upload", consumes = "multipart/*", headers = "content-type=multipart/form-data")
    public void fileUpload(MultipartFile multipartFile, HttpServletRequest request) {
        UploadFileEntity file = UploadKit.uploadFile(multipartFile, "D:\\uploadTest", true);
        System.out.println(file.toString());
    }

    @GetMapping(value = "/download")
    public void fileDownLoad(HttpServletResponse response) {
        try {
            DownloadKit.download(response, "D:\\tttt\\aaa.jpg", "aaa.jpg");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}