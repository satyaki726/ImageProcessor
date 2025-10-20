package downloader;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
import java.util.concurrent.Callable;

public class ImageDownloader implements Callable<String> {

	private String imageUrl;
	private final String imagePath = "C:\\Users\\Satyaki Saha\\Downloads";
	
	public ImageDownloader(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		String fileName = "img_" + UUID.randomUUID() + ".jpg";
		URL imagePath = new URL(this.imageUrl);
		Path path = Paths.get(this.imagePath,fileName);
		
		try(InputStream inputStream = imagePath.openStream()){
			Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);
		}
		
		return fileName;
	}

}
