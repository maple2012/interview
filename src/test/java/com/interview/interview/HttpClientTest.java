package com.interview.interview;

import com.interview.interview.util.HttpClientUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName com.interview.interview
 * @ClassName HttpClientTest
 * @Description
 * @Author XuFeng
 * @Date 2023-02-13 17:24:39
 */
@SpringBootTest
public class HttpClientTest {
    @Test
    public void test() {
        Map<String, String> headers = new HashMap<>();
        headers.put("size","everthing");
        Map<String, Object> pargram = new HashMap<>();
        pargram.put("file",new File("/Users/finley/新增维权公告表.sql"));
        String s = HttpClientUtil.postFile("http://127.0.0.1:9001/test-get",headers,pargram);
        System.out.println(s);
    }
}
