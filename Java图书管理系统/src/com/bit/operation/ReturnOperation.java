package com.bit.operation;

import com.bit.book.BookList;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要归还的书籍名称");
        String name = in.next();
        int i = 0;
        for (i = 0; i < bookList.getSize(); i++) {
            if(bookList.getBooks(i).getName().equals(name))
                break;
        }

        if(i>=bookList.getSize()){
            System.out.println("没有此书籍");
            return;
        }

        if(bookList.getBooks(i).isBorrowed() == false){
            bookList.getBooks(i).setBorrowed(true);
            System.out.println("归还成功");
        }else{
            System.out.println("归还失败");
        }
    }
}
