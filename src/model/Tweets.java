package model;

import java.security.Timestamp;
import java.sql.Date;

public class Tweets extends Articles {
	private int noOfComment;
	private int reTweet;
	private int quoteTweet;
	private int noOfLike;

	public Tweets(int id, String author, String content, Date timestamp, String link, int noOfComment, int reTweet,
			int quoteTweet, int noOfLike) {
		super(id, author, content, timestamp, link);
		this.noOfComment = noOfComment;
		this.reTweet = reTweet;
		this.quoteTweet = quoteTweet;
		this.noOfLike = noOfLike;
	}
}
