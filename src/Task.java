
//comparableインターフェースを実装
import java.time.LocalDate;

public class Task implements Comparable<Task> {
	private LocalDate date;
	private String task;
	private boolean done; //追加・・・完了はtrue、未完了はfalse

	public Task(LocalDate date, String task, boolean done) {
		this.date = date;
		this.task = task;
		this.done = done;
	}

	//dateを取得
	public LocalDate getDate() {
		return this.date;
	}

	//taskを取得
	public String getTask() {
		return this.task;
	}

	//doneを取得
	public boolean isDone() {
		return this.done;
	}

	//compareToメソッドをオーバーライド
	//日付で並び替えるため、LocalDateのcompareToを使う
	@Override
	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}

	@Override
	public String toString() {
		return this.date + " " + this.task;
	}

}
