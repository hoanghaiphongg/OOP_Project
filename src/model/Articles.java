package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Articles {
    private int id;
    private String author;
    private String content;
    private List<String> tag = new ArrayList<>();
    private Date timestamp;
    private String link;

    public Articles(int id, String author, String content, Date timestamp, String link) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.timestamp = timestamp;
        this.link = link;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

   

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	

	public void addTag(String newTag) {
        this.tag.add(newTag);
    }

	@Override
	public String toString() {
		return "Articles [id=" + id + ", author=" + author + ", content=" + content + ", tag=" + tag + ", timestamp="
				+ timestamp + ", link=" + link + "]";
	}
	
}
