//$Id$
/**
 * 
 */
package com.notes.depth;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bala-16089
 *
 */
public class PageInfo 
{
	private String title;
	private String img_path;
	private List<String> content = new ArrayList<>();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	public List<String> getContent() {
		return content;
	}
	public void setContent(List<String> content) {
		this.content = content;
	}
	
}
