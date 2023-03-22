package ru.netology.pm;
public class PosterManager {
    private String[] films = new String[0];
    private int limit;

    public PosterManager () {
        this.limit = 7;
    }

    public PosterManager (int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }
    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLenght;
        if (films.length < 10) {
            resultLenght = films.length;
        } else {
            resultLenght = 10;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[films.length -1 - i];
        }
        return tmp;

    }


}
