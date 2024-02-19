package com.ohgiraffers.test.model.dto;

public class BookDTO {

    private int bNo;        //도서 번호
    private int category;   //도서분류코드
    private String title;   //도서 제목
    private String author;  //도서 저자

    BookDTO() {}

    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return this.bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String strCategory;
        switch (category) {
            case 1:
                strCategory = "인문";
                break;
            case 2:
                strCategory = "자연과학";
                break;
            case 3:
                strCategory = "의료";
                break;
            case 4:
                strCategory = "기타";
                break;
            default:
                strCategory = "기타";
                System.out.println("잘못된 분류로 기타로 설정됩니다.");
                break;
        }
        return "BookDTO[" +
                "bNo=" + bNo +
                ", category=" + category + "|" + strCategory +
                ", title=" + title +
                ", author=" + author +
                "]";
    }
}
