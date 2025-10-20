package processor;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import downloader.ImageDownloader;

public class TaskProcessor {
	private ExecutorService executor = Executors.newCachedThreadPool();
	
	
	public List<String> executableTask(List<String> imageUrls) {
		List<String> list = imageUrls.stream().map(ImageDownloader::new).map(executor::submit).map(t -> {
			try {
				return t.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}).toList();
		executor.shutdown();
		return list;
	}
	
}
