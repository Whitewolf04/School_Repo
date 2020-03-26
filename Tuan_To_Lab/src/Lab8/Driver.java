package Lab8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Record record1 = new Record("Taylor Swift", "Call me maybe", "2013", 100);
		Record record2 = new Record("Michael Jackson", "Stayin' Alive", "1991", 150);
		Record record3 = new Record("Son Tung MTP", "Hay trao cho anh", "2019", 100);
		Record record4 = new Record("Ed Sheeran", "Castle on the Hill", "2017",120.4);
		Record record5 = new Record("Son Tung MTP", "Chac ai do se ve", "2014", 99.8);
		Record record6 = new Record("Viruss", "Thang Dien", "2018", 104.5);
		Record record7 = new Record("K-ICM", "Song gio", "2019", 76.8);
		Record record8 = new Record("Trinh Thang Binh", "Tam su tuoi 30", "2017", 98.9);
		Record record9 = new Record("HuyR", "Anh Thanh Nien", "2019", 100);
		Record record10 = new Record("B-Ray", "Cao Oc 20", "2019", 103.3);
		
		File myFile = new File("Lab8.bin");
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(myFile));
		} catch(IOException e) {
			System.out.println("Cannot open output stream");
		}
		
		try {
			oos.writeObject(record1);
			oos.writeObject(record2);
			oos.writeObject(record3);
			oos.writeObject(record4);
			oos.writeObject(record5);
			oos.writeObject(record6);
			oos.writeObject(record7);
			oos.writeObject(record8);
			oos.writeObject(record9);
			oos.writeObject(record10);
			oos.close();
		} catch(IOException e) {
			System.out.println("Cannot write object to the file");
		}
		
		ObjectInputStream ois = null;
		Record output;
		try {
			ois = new ObjectInputStream(new FileInputStream(myFile));
			for(int i = 0; i  < 10; i++) {
				output = (Record) ois.readObject();
				System.out.println(output.toString());
				System.out.println();
			}
			ois.close();
		}catch(IOException e) {
			System.out.println("Cannot open input stream to read");
		}catch(ClassNotFoundException e) {
			System.out.println("Incompatible class encountered!!");
		}
		
		
		record3.setArtist("Alan Walker");
		record3.setSongTitle("Fallen");
		record8.setArtist("B-Ray");
		record8.setSongTitle("Thuong Nhieu Hon La Noi");
		System.out.println("===================================");
		System.out.println("File after changed: \n");
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(myFile));
		} catch(IOException e) {
			System.out.println("Cannot open output stream");
		}
		
		try {
			oos.writeObject(record1);
			oos.writeObject(record2);
			oos.writeObject(record3);
			oos.writeObject(record4);
			oos.writeObject(record5);
			oos.writeObject(record6);
			oos.writeObject(record7);
			oos.writeObject(record8);
			oos.writeObject(record9);
			oos.writeObject(record10);
			oos.close();
		} catch(IOException e) {
			System.out.println("Cannot write object to the file");
		}
		
		try {
			ois = new ObjectInputStream(new FileInputStream(myFile));
			for(int i = 0; i  < 10; i++) {
				output = (Record) ois.readObject();
				System.out.println(output.toString());
				System.out.println();
			}
			ois.close();
		}catch(IOException e) {
			System.out.println("Cannot open input stream to read");
		}catch(ClassNotFoundException e) {
			System.out.println("Incompatible class encountered!!");
		}
		
	}

}
