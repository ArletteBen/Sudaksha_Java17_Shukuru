package com.sudaska.project;

public class Project {
private int projId;
private String title;
public int getProjId() {
	return projId;
}
public void setProjId(int projId) {
	this.projId = projId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
@Override
public String toString() {
	return "Project [projId=" + projId + ", title=" + title + "]";
}

}
