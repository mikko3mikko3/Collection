package practice;

import java.time.LocalDate;

public class Task {
	protected LocalDate date;
	protected String content;

	public Task(LocalDate date, String content) {
		this.date = date;
		this.content = content;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return date + ":" + content;
	}

}
