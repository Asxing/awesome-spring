package com.asxing.spring.chapter01.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Chapter01HelloworldApplication {


    public static void main(String[] args) {
        System.out.println("sfadfad");
        Chapter01HelloworldApplication chapter01HelloworldApplication = new Chapter01HelloworldApplication();
        System.out.println(chapter01HelloworldApplication.returnJson());
//        SpringApplication.run(Chapter01HelloworldApplication.class, args);
    }

    @RequestMapping(value = {"/", "/hello"})
    public String[] hello() {
        String[] names = new String[]{"1", "3"};
        String ss = "ss";
        return names;
    }

    @GetMapping(value = "json")
    public Result returnJson() {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("ok");
        return result;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private class Result {
        private Integer code;
        private String message;
    }


    private class ResultV1 extends ResultV2 {
        @Override
        void method1() {
        }
    }

    private static abstract class ResultV2 {
        abstract void method1();
    }

    public interface ResultV3 {
        void method2();
    }

    class ResultV4 implements ResultV3 {

        @Override
        public void method2() {

        }
    }
}
