package com.bit.book;

public class BookList {
    public  Book[] books = new Book[10];
    private int size;

    public BookList() {
        books[0]=new Book("三国","罗",13,"小说");
        books[1]=new Book("西游记","吴",15,"小说");
        books[2]=new Book("水浒","施",19,"小说");
        this.size = 3;
    }

    public void setBooks(int pos,Book book){
        this.books[pos] = book;
    }

    public Book getBooks(int pos){
        return books[pos];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
