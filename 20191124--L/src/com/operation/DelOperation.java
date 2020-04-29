package com.operation;

import com.book.Book;
import com.book.BookList;

public class DelOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        System.out.println("请输入书名：");
        String name = scan.next();
        int i = 0;
        Book book = null;
        for (; i < bookList.getUsedSize(); i++) {
            book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        if (i == bookList.getUsedSize()) {
            System.out.println("没有该图书");
            return;
        }
        //下标i的书籍就是要删除的书籍
        for (int j = i; j < bookList.getUsedSize()-1; j++) {
            //后一个覆盖前一个
            //[j] ==>  [j+1]
            //10          18
            //bookList.getBook(j) = bookList.getBook(j+1);
            book = bookList.getBooks(j+1);
            bookList.setBooks(j,book);
        }
        int curSize = bookList.getUsedSize();
        bookList.setUsedSize(curSize-1);
        System.out.println("删除成功!");
    }
}
