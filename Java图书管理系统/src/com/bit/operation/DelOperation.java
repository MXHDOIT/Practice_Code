package com.bit.operation;

import com.bit.book.BookList;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要删除的书籍名称");
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

        for(int j = i;j < bookList.getSize()-1;j++){
            bookList.setBooks(j+1,bookList.getBooks(j));
        }

        bookList.setSize(bookList.getSize()-1);
        System.out.println("删除成功");
    }
}
