package com.greedy.level02.normal.book.model.vo;

public class BookVo {

    String title;
    String publisher;
    String author;
    int price;
    double discountRate;

    /* setters */
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    /* getters */
    public String getTitle() { return title; }
    public String getPublisher() { return publisher; }
    public String getAuthor() { return author; }
    public int getPrice() { return price; }
    public double getDiscountRate() { return discountRate; }

    /* 기본 생성자 */
    public BookVo() {}

    /* 필드 3가지를 초기화하는 생성자 */
    public BookVo(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    /* 모든 필드를 초기화하는 생성자 */
    public BookVo(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }
    public void printInfomation() {
        System.out.println(this.title + " " +
                            this.publisher + " " +
                            this.author + " " +
                            this.price + " " +
                            this.discountRate);
    }
}
//    public void printInfomation() {
//        System.out.println("BookVo [ title = " + this.title +
//                ", publisher = " + this.publisher +
//                ", author = " + this.author +
//                ", price = " + this.price +
//                ", discountRate" + this.discountRate +
//                " ]");
//    }
