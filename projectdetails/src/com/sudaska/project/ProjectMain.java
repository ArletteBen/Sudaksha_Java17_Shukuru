package com.sudaska.project;


public class ProjectMain {
	public static void main(String[] args) {
		Project proj=new Project();
	proj.setProjId(45);
	proj.setTitle("etax");
		System.out.println(proj.getProjId()+" "+proj.getTitle());
		}
}
