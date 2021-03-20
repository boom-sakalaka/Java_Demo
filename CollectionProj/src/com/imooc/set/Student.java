package com.imooc.set;

public class Student {
	private int stuld;
	private String name;
	private float score;
	
	
	public Student() {}
	
	public Student(int stuld,String name, float score) {
		this.setStuld(stuld);
		this.setName(name);
		this.setScore(score);
	}
	
	public int getStuld() {
		return stuld;
	}
	public void setStuld(int stuld) {
		this.stuld = stuld;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(score);
		result = prime * result + stuld;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj.getClass() == Student.class) {
			Student st = (Student)obj;
				return st.getName().equals(name) && st.getStuld() == stuld;
		}
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Ñ§ºÅ:"+ this.getStuld() +",ÐÕÃû:"+ this.getName() +",³É¼¨:"+ this.getScore() +"]";
	}
	
}
