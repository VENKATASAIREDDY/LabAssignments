
import java.io.*;
class CopyDataThread extends Thread{
	
	String source;
	String destination;
	public CopyDataThread(String source,String destination) {
		this.source=source;
		this.destination=destination;
	}
	
	public void run() {
		int counter=0;
		
		try {
			FileReader fr=new FileReader(source);
			FileWriter fw =new FileWriter(destination,true);
			int a=0;
			while((a=fr.read())!=-1) {
				fw.write((char)a);
				fw.flush();
				counter++;
				if(counter==10) {
					System.out.println("10 characters copied");
					counter=0;
					Thread.sleep(5000);
				}
			}
			fw.close();
			fr.close();
			System.out.println("Competed!!!");
			
		} catch (IOException | InterruptedException e) {
			System.out.println(e);
		} 
	}
}

public class FileProgram {

	public static void main(String[] args) {
		CopyDataThread copy=new CopyDataThread("E:source.txt","E:destination.txt");
		copy.start();
	}

}
