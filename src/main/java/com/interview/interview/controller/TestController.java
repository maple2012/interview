package com.interview.interview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName com.interview.interview.controller
 * @ClassName TestController
 * @Description
 * @Author XuFeng
 * @Date 2023-02-13 18:47:01
 */
@RestController
public class TestController {
    @PostMapping("/test-get")
    public String testGet(HttpServletRequest request){
        String size = request.getHeader("size");
        MultipartResolver resolver = new StandardServletMultipartResolver();
        MultipartHttpServletRequest mRequest = resolver.resolveMultipart(request);
        Map<String, MultipartFile> fileMap = mRequest.getFileMap();
        String[] files = request.getParameterValues("file");
        return "xxx";
    }


}
