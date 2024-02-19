package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO book1, BookDTO book2) {
        int category1 = book1.getCategory();
        int category2 = book2.getCategory();

        if (category1 > category2) {
            return -1;
        } else if (category1 > category2) {
            return 1;
        } else {
            return 0;
        }
    }
}
