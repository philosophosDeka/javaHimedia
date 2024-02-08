package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.vo.BookVo;

public class Application {
    public static void main(String[] args) {

        BookVo book1 = new BookVo();
        book1.printInfomation();

        BookVo book2 = new BookVo("자바의 정석", "도우출판", "남궁성");
        book2.printInfomation();

        BookVo book3 = new BookVo("홍길동전", "활빈당", "허균", 5000000, 0.5);
        book3.printInfomation();

    }
}
