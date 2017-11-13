package FCFS;
import java.util.*;
import java.io.*;

public class write {
public  void write(){
	try{
	String pathname="D:\\FCFS.txt";
	File filename=new File(pathname);
	/*InputStreamReader reader=new InputStreamReader(new FileInputStream(filename));

	BufferedReader br=new BufferedReader(reader);
	String line="";
	line=br.readLine();
	while(line!=null){line=br.readLine();}*/
	File writename=new File("D:\\FCFS.txt");
	writename.createNewFile();
	BufferedWriter out=new BufferedWriter(new FileWriter(writename));
	int[] data={6,2,1,3,9};
	Random random=new Random();
	for(int i=0;i<=99;i++)
	{
		int n=random.nextInt(5);
		int k=data[n];
		int l=i+1;
		out.write(l+" "+i+" "+k+"\r\n");
	}
	out.flush();
	out.close();
	}catch(Exception e){e.printStackTrace();}
}
}
