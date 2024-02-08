package com.ohgiraffers.section01.object.book;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    public Book() {}

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /* toString() 오버라이딩 */
    @Override
    public String toString() {
        return "BookVo [" +
                "number=" + this.number +
                ", title=" + title +
                ", author=" + author +
                ", price=" + price +
                "]";
    }

    /* equals() 오버라이딩 */
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Book other = (Book)obj;
        if (this.number != other.number) {
            return false;
        }
        /* title 필드가 null인 경우 다른 인스턴스의 title이 null이 아니면 false 반환*/
        if (this.title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!this.title.equals(other.title)) {
            /* title 필드가 null이 아닌 경우
            * 두 인스턴스의 title 필드값이 같아야 한다.
            * 그렇지 않은 경우 flase 반환
            *
            * String 클래스가 equals() 메소드를 오버라이딩 해두었기 때문에
            * 문자열의 내용이 같은지 비교하도록 재정의 되어
            * this.title과 other.author의 문자열이 같은 내용을 가지고 있는지를 확인한다. */
            return false;
        }
        /* 작가의 경우도 마찬가지로 비교한다. */
        if (this.author == null) {
            if (other.author != null) {
                return false;
            }
        } else if (!this.author.equals(other.author)) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        /* 모든 조건을 통과하면 두 인스턴스의 모든 필드는 같은 값을 가지므로 true 반환 */
        return true;
    }

    /* hashCode() 오버라이딩 */
    @Override
    public int hashCode() {
        int result = 1;
        /* 필드마다 곱해줄 소수값 선언
        * 31은 소수이기 때문에 연산 시 동일한 hashCode값이 나오지 않을 확률을 증가시킨다.
        * 31이 통상적인 관례이며 String 클래스의 hashCOde에서도 사용한 값이다. */
        final  int PRIME = 31;
        /* 31과 필드값을 이용하여 새로운 hashCOde를 연산한다.
        * 여기서 포인트는 필드값이 같은 경우 동일한 hashCode를 반환하면 된다. */
        result = PRIME * result + this.number;

        /* String 클래스의 hashCode 메소드는 이미 재정의 되어있다.
        * 같은 값을 가지는 문자열은 동일한 hashCode값을 반환한다.
        * */
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.price;

        return result;
    }
}
