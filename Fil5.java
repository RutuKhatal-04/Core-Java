/*Reading/Writing using a random access file*/

import java.io.*;
class Fil5
{
        public static void main(String args[])
        {
                RandomAccessFile file=null;
                try
                {
                        file=new RandomAccessFile("sample.txt","rw");
                        file.writeChar('X');
                        file.writeInt(555);
                        file.writeDouble(3.1412);

                        file.seek(0);
                        System.out.println(file.readChar());
                        System.out.println(file.readInt());
                        System.out.println(file.readDouble());

                        file.seek(2);
                        System.out.println(file.readInt());

                        file.seek(file.length());
                        file.writeBoolean(false);

                        file.seek(4);
                        System.out.println(file.readBoolean());
                        file.close();
                }
                catch(IOException e)
                {
                       System.out.println(e);
                }
        }
}
