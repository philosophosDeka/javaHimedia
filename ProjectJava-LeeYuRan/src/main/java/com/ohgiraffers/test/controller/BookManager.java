package com.ohgiraffers.test.controller;

import com.ohgiraffers.hw2.model.comparator.AscCategory;
import com.ohgiraffers.hw2.model.comparator.DescCategory;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager {

    ArrayList<BookDTO> booklist;
    public BookManager() {
        booklist = new ArrayList<BookDTO>();
    }

    public void addBook(BookDTO book) {
        //전달받은 BookDTO 객체를 생성자 시 선언한 ArrayList 객체에 추가
        booklist.add(book);
        System.out.println("도서 저장이 성공적으로 되었습니다.");
    }

    public void deleteBook(int index) {
        //전달받은 도서 번호로 ArrayList 안에 있는 정보 삭제
        for (int i = 0; i < booklist.size(); i++) {
            if (booklist.get(i).getbNo() == index) {
                booklist.remove(i);
                System.out.println("도서가 성공적으로 삭제되었습니다.");
                break;
            } else {
                System.out.println("책 번호에 해당하는 도서를 찾을 수 없습니다.");
                break;
            }
        }
    }

    public int searchBook(String title) {
        //전달받은 도서 제목으로 도서를 검색하고 결과값 반환
        for (int i = 0; i < booklist.size(); i++) {
            BookDTO book = booklist.get(i);
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("도서 번호: " + book.getbNo());
                System.out.println("도서 제목: " + book.getTitle());
                System.out.println("도서 장르: " + book.getCategory());
                System.out.println("도서 저자: " + book.getAuthor());
                return i; // 도서를 찾았을 때 해당 도서의 인덱스 반환
            }
        }
        System.out.println("조회한 도서가 목록에 없습니다.");
        return -1; // 도서를 찾지 못했을 때 -1 반환
    }

    public void printBook(int index) {
        if (index != -1) {
            BookDTO book = booklist.get(index);
            System.out.println("도서 번호: " + book.getbNo());
            System.out.println("도서 제목: " + book.getTitle());
            System.out.println("도서 장르: " + book.getCategory());
            System.out.println("도서 저자: " + book.getAuthor());
        } else {
            System.out.println("조회된 도서가 목록에 없습니다.");
        }
    }


    public void displayAll() {
        //도서 목록 전체 출력
        if (booklist.isEmpty()) {
            System.out.println("출력 결과가 없습니다.");
        } else {
            for (BookDTO book : booklist) {
                System.out.println(book);
            }
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        //전달받은 번호를 기준으로 해당 카테고리순으로 정렬해서
        //ArrayList<BookDTO>에 담아서 리턴
        ArrayList<BookDTO> sortedList = new ArrayList<>(booklist); // 원본 리스트 복사

        switch (select) {
            case 1:
                Collections.sort(sortedList, new AscCategory());
                System.out.println("오름차순으로 정렬되었습니다.");
                break;
            case 2:
                Collections.sort(sortedList, new DescCategory());
                System.out.println("내림차순으로 정렬되었습니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        }
        return sortedList;

    }

    public void printBookList(ArrayList<BookDTO> br) {
        //전달받은 ArrayList<BookDTO>를 향상된 for문으로 이용하여 출력
        for (BookDTO book : br) {
            System.out.println(book);
        }
    }


}
