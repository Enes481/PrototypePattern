package com.company;

import java.util.ArrayList;

public class Database  implements java.lang.Cloneable{
    private String isim;
    private ArrayList m_Tabloları = new ArrayList();

    public Database()
    {
        isim = "model";
        m_Tabloları.add("sysusers");
        m_Tabloları.add("sysindexes");
        m_Tabloları.add("sysfiles");
    }


    public void TabloEkle(String isim)
    {
        m_Tabloları.add(isim);
    }

    public void TabloListesi()
    {
        for(int i=0;i<=m_Tabloları.size()-1;i++)
        {
            System.out.println(m_Tabloları.get(i));
        }
    }

    //klonlama işlemi
    public Object Clone() throws CloneNotSupportedException{
        return new Database();
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public ArrayList getM_Tabloları() {
        return m_Tabloları;
    }

    public void setM_Tabloları(ArrayList m_Tabloları) {
        this.m_Tabloları = m_Tabloları;
    }
}
