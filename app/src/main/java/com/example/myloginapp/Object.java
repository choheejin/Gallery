package com.example.myloginapp;

import java.util.ArrayList;

//* 도영님께
// static 변수는 프로그램이 종료 전까지 살아있는 변수로, 이곳에 저장 후 사용예정*//
public class Object {
	static public ArrayList<GalleryInfo> art=new ArrayList<GalleryInfo>();
    static ArrayList<ExhibitionInfo> exhibition=new ArrayList<ExhibitionInfo>();
	static ArrayList<LocationInfo> location=new ArrayList<LocationInfo>();
	static ArrayList<ProvinceInfo> province=new ArrayList<ProvinceInfo>();
	static ArrayList<ReviewInfo> review=new ArrayList<ReviewInfo>();
	static ArrayList<UserInfo> userlist=new ArrayList<UserInfo>();
	static UserInfo user; //로그인한 사용자 정보를 담을 객체
}