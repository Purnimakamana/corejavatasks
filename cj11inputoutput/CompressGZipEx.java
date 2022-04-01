package cj11inputoutput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class CompressGZipEx {
	public static void main(String[] args) {
		CompressGZipEx zipObj = new CompressGZipEx();
		zipObj.gzipMyFile();
	}
	public void gzipMyFile() {
		byte[] buffer = new byte[1024];
		try {
			GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream("E:\\Demo.txt"));
			FileInputStream fis = new FileInputStream("E:\\Demo.txt");
			int length;
			while((length = fis.read(buffer))>0) {
				gos.write(buffer,0,length);
			}
			fis.close();
			gos.finish();
			gos.close();
			System.out.println("File Compressed!!!");
		}
		catch(IOException ioe){
	        ioe.printStackTrace(); 
		}
	}

}
