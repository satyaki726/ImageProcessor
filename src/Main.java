import java.util.Arrays;
import java.util.List;

import processor.TaskProcessor;

public class Main {

	public static void main(String[] args) {
		List<String> urls = Arrays.asList(
				"https://plus.unsplash.com/premium_photo-1683910767532-3a25b821f7ae?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&q=80&w=1016",
				"https://images.unsplash.com/photo-1526779259212-939e64788e3c?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZnJlZSUyMGltYWdlc3xlbnwwfHwwfHx8MA%3D%3D&fm=jpg&q=60&w=3000",
				"https://images.unsplash.com/photo-1526779259212-939e64788e3c?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZnJlZSUyMGltYWdlc3xlbnwwfHwwfHx8MA%3D%3D&fm=jpg&q=60&w=3000");
		TaskProcessor taskProcessor = new TaskProcessor();
		
		long start = System.currentTimeMillis();
        List<String> results = taskProcessor.executableTask(urls);
        long end = System.currentTimeMillis();

        System.out.println("Downloaded files: " + results);
        System.out.println("Total time: " + (end - start) + " ms");

	}
}
