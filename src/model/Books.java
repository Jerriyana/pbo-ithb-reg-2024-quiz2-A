package model;

class Books {
    private int id; 
    private String title;
    private String author;
    private String genre; 
    private int price;
    
    public Books(int id, String title, String author, String genre, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }                
}

/*
 * Model Class & Database
Books
< id: integer
title: string
author: string
genre: string
price: integer >
Users
< id: integer
name: string
email: string
password: string >
Transactions
< id: integer
user_id: integer FK
book_id: integer FK >
 */


