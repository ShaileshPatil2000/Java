package Lab15_16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	
		int id;
		String name;
		public Demo(int id, String name)
		{
			this.id = id;
			this.name= name;
		}

	}

	class Serialization_Deserilization
	{
		public static void main(String[] args)
		{ 
			Demo object = new Demo(1, "Vaishnavi");
			String filename = "f.txt";
			
			
			try
			{ 
				
				FileOutputStream file = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(file);
				
				
				out.writeObject(object);
				
				out.close();
				file.close();
				
				System.out.println("Object has been serialized");

			}
			
			catch(IOException ex)
			{
				System.out.println("IOException is caught");
			}


			Demo object1 = null;

			
			try
			{ 
				
				FileInputStream file = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(file);
				
			
				object1 = (Demo)in.readObject();
				
				in.close();
				file.close();
				
				System.out.println("Object has been deserialized ");
				System.out.println("a = " + object1.id);
				System.out.println("b = " + object1.name);
			}
			
			catch(IOException ex)
			{
				System.out.println("IOException is caught");
			}
			
			catch(ClassNotFoundException ex)
			{
				System.out.println("ClassNotFoundException is caught");
			}

		}
	}



