package sudaJava;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CachedThreadPoolExample {
public static void main(String [] args) {
	ThreadPoolExecutor pool=(ThreadPoolExecutor) Executors.newCachedThreadPool();
	for(int i=1; i<=5;i++) {
		FetchDataFromFile fromFile=new FetchDataFromFile("File-"+i);
		System.out.println("A new file has been added to read: "+fromFile.getFileName());
		//submit task to executor
		pool.execute(fromFile);
	}
	pool.shutdown();
}
}
