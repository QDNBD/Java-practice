package com.operation;

import com.book.Book;
import com.book.BookList;

public class ReturnOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        //查找图书是否存在
        System.out.println("输入要归还的书名：");
        String name = scan.next();
        int i = 0;
        Book book = null;
        for (; i < bookList.getUsedSize(); i++) {
            book = bookList.getBooks(i);
            if (book.getName().equals(name)){
                break;
            }
        }
        if (i == bookList.getUsedSize()){
            System.out.println("没有此图书");
            return;
        }
        book = bookList.getBooks(i);
        if (book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println("此书归还成功");
        }else {
            System.out.println("此书没有被借阅");
        }
    }
}
