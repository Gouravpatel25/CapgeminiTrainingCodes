package genericsByGpt;

import java.util.ArrayList;

public class Team<T>{
	private String teamName;
	private ArrayList<T> members;
	
	Team(String teamName){
		this.teamName=teamName;
		members=new ArrayList<T>();
	}
	
	public void addMember(T member) {
		members.add(member);
	}
	
	public void showMember() {
		System.out.println("Team name: "+teamName);
		for(T member:members) {
			System.out.println(member);
		}
	}
	
}
