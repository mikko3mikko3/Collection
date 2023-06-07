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

		List<Task> task = new ArrayList<>();
		task.add(task1);
		task.add(task2);
		task.add(task3);
		task.add(task4);
		task.add(task5);

		Comparator<Task> taskComperator = Comparator.comparing(Task::getDate);

		List<Task> sortList = task.stream().sorted(taskComperator).collect(Collectors.toList());

		System.out.println(sortList);

	}

}
