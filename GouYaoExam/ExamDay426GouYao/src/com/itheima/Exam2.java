package com.itheima;

import java.util.ArrayList;

public class Exam2 {
    /*
    1.设计一个Movie类，私有成员变量：title（片名），director（导演），
    type（类型），并生成相应的get/set方法。

    2.定义测试类，在main方法中完成以下要求：

    2.1创建三个Movie对象，分别为” 唐山大地震”，”冯小刚”，”灾难”；
    ”羞羞的铁拳”，” 宋阳”，” 喜剧”； ”集结号”，” 冯小刚”，”历史”；

    2.2将以上3个对象添加到list集合中

    2.3遍历集合，将导演为“冯小刚”的电影按照如下格式打印到控制台上。

     */
    public static void main(String[] args) {
        Movie movie1  =  new Movie("唐山大地震","冯小刚","灾难");
        Movie movie2  =  new Movie("羞羞的铁拳","宋阳","喜剧");
        Movie movie3  =  new Movie("集结号","冯小刚","历史");
        ArrayList<Movie> list = new ArrayList<>();
        list.add(movie1);
        list.add(movie2);
        list.add(movie3);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getDirector().equals("冯小刚")){
                list.get(i).show();
            }
        }
    }
}
class Movie{
    private String title;
    private String director;
    private String type;

    public Movie() {
    }

    public Movie(String title, String director, String type) {
        this.title = title;
        this.director = director;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void show(){
        System.out.println(title+"-"+director+"-"+type);
    }
}
