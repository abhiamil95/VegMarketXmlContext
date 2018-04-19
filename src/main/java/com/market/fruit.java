package com.market;

import java.util.List;
import java.util.Map;

public class fruit {

	private String name; 
	private List<String> li;
	private Map<String,String> namemap;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getLi() {
		return li;
	}
	public void setLi(List<String> li) {
		this.li = li;
	}
	public Map<String, String> getNamemap() {
		return namemap;
	}
	public void setNamemap(Map<String, String> namemap) {
		this.namemap = namemap;
	}
	public fruit() {}
	public void dispnameUsingExternalFile()
	{
		System.out.println("using External file"+name);
	}
	public void display()
	{
		String fin= new String();
		if(li!=null && li.size() >0)
		{
			for(int i=0;i<li.size();i++)
			{
				fin+=". name:"+li.get(i);
			}
		}
		if(namemap!=null && namemap.size() >0)
		{
			for(Map.Entry<String, String> fr:namemap.entrySet())
			{
				fin+=fr.getKey()+"==>"+fr.getValue()+"::";
			}
		}
		System.out.println("fruits are:"+fin);
	}
}
