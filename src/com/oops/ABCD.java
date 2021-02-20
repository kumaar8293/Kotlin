package com.oops;

import java.util.Objects;

public class ABCD {

    public static void main(String[] args) {
        AA a1 = new AA("Sam", 12);
        AA a2 = new AA("Sam", 12);

        System.out.println(a1);
        System.out.println(a1.hashCode() + "  " + a2.hashCode());

    }
}


class AA {
    public AA(String name, int id) {
        this.name = name;
        this.id = id;

    }

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AA aa = (AA) o;
        return id == aa.id && Objects.equals(name, aa.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "AA{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
