import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter10 {

	public static void main(String[] args) {
		List<Task> list = new ArrayList<>();
		list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
		list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
		list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
		list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
		list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

		//ストリーム、ラムダ式、メソッド参照を盛り込んだコードに！

		//未完了のタスクを抽出して並び替える
		List<Task> list2 = list.stream()
				.filter(f -> f.isDone() == false)
				.sorted(Task::compareTo)
				.collect(Collectors.toList());

		//並び替えた未完了タスクの個数を表示
		int count = list2.size();
		System.out.println("未完了のタスクの個数は" + count);

		System.out.println("【未完了のタスクを昇順に並び替えて一覧表示】");
		for (Task task : list2) {
			System.out.println(task.toString());
		}

	}

}
