package com.telusko.demo;

public class Alien {
private int aid;
private String name;
public int getAid() {
	return aid;
}
@Override
public String toString() {
	return "Alien [aid=" + aid + ", name=" + name + ", lang=" + lang + "]";
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLang() {
	return lang;
}
public void setLang(String lang) {
	this.lang = lang;
}
private String lang;
}
