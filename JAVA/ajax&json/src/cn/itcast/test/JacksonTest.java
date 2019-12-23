package cn.itcast.test;

import cn.itcast.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class JacksonTest {
    //java对象转为JSON字符串
    @Test
    public void test1() throws IOException {
        Person p = new Person();
        p.setName("zhangsan");
        p.setAge(23);
        p.setGender("男");

        ObjectMapper mapper = new ObjectMapper();

        String s = mapper.writeValueAsString(p);
        System.out.println(s);

        //写到d://a.txt
        mapper.writeValue(new File("d://a.txt"),p);
    }


    @Test
    public void test2() throws IOException {
        Person p = new Person();
        p.setName("zhangsan");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(p);

        System.out.println(s);
    }
}
