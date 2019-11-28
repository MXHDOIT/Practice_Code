package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //获取Doucment对象，根据
        //获取student.xml的path
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();

        Document doc = Jsoup.parse(new File(path), "utf-8");

        Elements name = doc.getElementsByTag("name");

        System.out.println(name.size());

        Element e1 = name.get(0);

        System.out.println(e1.text());


    }
}
