package sudaJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookTaskMain {

	public static void main(String[] args) {
		List<BookTask> bookList=new ArrayList<BookTask>();
		
		bookList.add(new BookTask(3,"un petit pousse qui danse","arl",34.0));
		bookList.add(new BookTask(4,"poile de carrotte","niw",36.0));
		bookList.add(new BookTask(5,"barbe rouge","niw",36.0));
//System.out.println(bookList.get(0));
Map<Integer, BookTask> bookMap = bookList.stream()
.collect(Collectors.toMap(BookTask::getBookId, bookTask -> bookTask));
System.out.println(bookMap);
HashMap<Integer, BookTask>map=new HashMap<Integer, BookTask>();
for(int i=0; i<bookList.size(); i++) {
		map.put(bookList.get(i).getBookId(), bookList.get(i));
}
System.out.println("map "+map);
}
}