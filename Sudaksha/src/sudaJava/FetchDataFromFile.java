package sudaJava;

public class FetchDataFromFile implements Runnable{
private String fileName;

	public FetchDataFromFile(String fileName) {
	this.fileName = fileName;
}

	public String getFileName() {
	return fileName;
}

	@Override
	public void run() {
	try {
		System.out.print("Fetching data from: "+fileName+" by "+Thread.currentThread().getName());
		Thread.sleep(3000);
		System.out.print("Read file successfully: "+fileName+" by "+Thread.currentThread().getName());
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}

}
