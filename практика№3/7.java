/* Создать программу на языке Java для определения класса в некоторой предментой области. 
Описать свойства , конструктор, методы геттеры/сеттеры, перекрыть метод toString() для вывода полной информации об объекте в отформатированном виде:
 Деканат NameFaculty - факультет Room - аудитория corps -корпус , Telephone - контактный телефон , NameDean - фамилия декана */

package com.company.Dekanat;
import java.lang.String;
class test {

    public static void main(String[] args) {
        Dekanat UITS = new Dekanat("UITS", 220, 1, 2200987, "Skripnikov");
        System.out.println(UITS.toString());
    }
}
class Dekanat {
    private String NameFaculty;
    private int Room;
    private int corpus;
    private int Telephone;
    private String NameDean;

    public Dekanat(String NameFaculty, int Room, int corpus, int Telephone, String NameDean){
        this.NameFaculty=NameFaculty;
        this.Room=Room;
        this.corpus=corpus;
        this.Telephone=Telephone;
        this.NameDean=NameDean;
    }
    public String getNameFaculty() {
        return NameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        NameFaculty = nameFaculty;
    }
    public int getRoom() {
        return Room;
    }

    public void setRoom(int room) {
        Room = room;
    }
    public int getCorpus() {
        return corpus;
    }

    public void setCorpus(int corpus) {
        this.corpus = corpus;
    }
    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }
    public String getNameDean() {
        return NameDean;
    }

    public void setNameDean(String nameDean) {
        NameDean = nameDean;
    }

    public String toString() {
        return "NameFaculty" + " " + NameFaculty + "\n" + "Room" + " " + Room + "\n" + "corpus" + " " + corpus + "\n" + "Telephone" + " " + Telephone + "\n" + "NameDean" + " " + NameDean;
    }
}