package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter5 {

	public static void main(String[] args) {
		Task task1 = new Task(LocalDate.of(2021, 10, 21), "牛乳を買う");
		Task task2 = new Task(LocalDate.of(2021, 9, 15), "○○社面談");
		Task task3 = new Task(LocalDate.of(2021, 12, 4), "手帳を買う");
		Task task4 = new Task(LocalDate.of(2021, 8, 10), "散髪に行く");
		Task task5 = new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く");

		List<Task> tasks = new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);
		tasks.add(task5);

		Comparator<Task> taskComperator = Comparator.comparing(Task::getDate);

		List<Task> sortList = tasks.stream().sorted(taskComperator).collect(Collectors.toList());

		for (Task task : sortList) {
			System.out.println(task.getDate() + ":" + task.getContent());
		}

	}

}
