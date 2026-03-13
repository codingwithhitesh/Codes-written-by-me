import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class CreateFile
{
    public static void main(String[] args)
    {

        try {
            File Obj = new File("D:\\myfile.txt");

            // Creating File
            if (Obj.createNewFile()) {
                System.out.println("File created: " + Obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }




            FileWriter Writer = new FileWriter(Obj);

                // Writing File
                Writer.write("Files in Java are seriously good!!");
                Writer.close();

                System.out.println("Successfully written.");
            }

            // Exception Thrown
            catch (IOException e1) {
                System.out.println("An error has occurred.");
                e1.printStackTrace();
            }
        }
    }
