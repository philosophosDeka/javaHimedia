package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {}    //기본생성자

    public void mainMenu() {
        System.out.println("*** 도서 관리 프로그램 ***");
        while (true) {
            System.out.println("1.도서 추가 / 2.도서 삭제 / 3.도서 검색 후 출력 / 4.목록 전체 출력 / 5.카테고리순 정렬 출력 / 0.종료");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    BookDTO newBook = inputBook(); // inputBook() 메소드 호출하여 새로운 BookDTO 객체 생성
                    bm.addBook(newBook); // 생성된 객체를 addBook() 메소드에 전달하여 리스트에 추가
                    break;
                case 2:
                    System.out.println("삭제할 도서의 번호를 입력하세요:");
                    int index = sc.nextInt();
                    bm.deleteBook(index); // BookManager 클래스의 deleteBook 메소드에 인덱스 전달하여 호출
                    break;
                case 3:
                    String bookTitle = inputBookTitle(); // inputBookTitle() 메소드를 호출하여 반환된 도서 제목을 저장
                    bm.searchBook(bookTitle);   // 저장된 리스트 객체를 printBook() 메소드에 전달하여 출력
                    break;
                case 4:
                    bm.displayAll();    //전체 출력
                    break;
                case 5:
                    System.out.println("카테고리순 정렬 출력을 선택하셨습니다.");
                    System.out.print("1. 오름차순 / 2. 내림차순 : ");
                    int sortOrder = sc.nextInt();
                    ArrayList<BookDTO> sortedList = bm.sortedBookList(sortOrder);
                    bm.printBookList(sortedList);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");
                    break;
            }
        }
    }

    public BookDTO inputBook() {
        //BookDTO 객체의 필드 값을 키보드로 입력 받아 초기화하고 객체 리턴
        System.out.print("도서번호 : ");
        int bNo = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        System.out.print("도서 장르 (1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, title, author);
    }

    public String inputBookTitle() {
        //검색할 도서제목을 키보드로 입력 받아 리턴
        System.out.print("도서 제목을 입력하세요 : ");
        String title = sc.nextLine();

        return title;
    }
}
