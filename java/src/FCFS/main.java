package FCFS;

import java.util.*;

public class main {

	public static void main(String[] args) {
		List<Task> list = new ArrayList<Task>();
		write wd = new write();
		wd.write();
		read rd = new read();
		list=rd.read();
		fcfs f=new fcfs();
		f.fcfs(list);
		f.printList(list);

	}
}
