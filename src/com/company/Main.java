package com.company;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try
        {
            Database mdl = new Database();
            Database db1 = (Database) mdl.Clone();
            db1.setIsim("stokTakip");
            db1.TabloEkle("stoklar");
            System.out.println(db1.getIsim());
            db1.TabloListesi();



        }catch (CloneNotSupportedException exc)
        {
            System.out.println(exc.getMessage());
        }
    }
}
