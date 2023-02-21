package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 500);
        Book book2 = new Book("First Java", 560);
        Book book3 = new Book("Head Java", 600);
        Book book4 = new Book("Java book", 450);
        Book[] bk = new Book[4];
        bk[0] = book1;
        bk[1] = book2;
        bk[2] = book3;
        bk[3] = book4;
        for (int i = 0; i < bk.length; i++) {
            Book b = bk[i];
            System.out.println(b.getBookName());
        }
        Book[] tmp = new Book[1];
        tmp[0] = bk[0];
        bk[0] = bk[3];
        bk[3] = tmp[0];
        for (int i = 0; i < bk.length; i++) {
            Book c = bk[i];
            System.out.println(c.getBookName());
        }
        for (int i = 0; i < bk.length; i++) {
            Book d = bk[i];
            if ("Clean code".equals(d.getBookName())) {
                System.out.println(d.getBookName());
            }
        }
    }
}
