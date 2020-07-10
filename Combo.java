import java.awt.Desktop;
import java.net.URI;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import java.util.concurrent.TimeUnit;

public class Combo 
{ 
    public static void main(String[] args)  throws Exception
    {         
      
        String link = args[0]; 
          
Desktop d = Desktop.getDesktop();
d.browse(new URI(link));

TimeUnit.SECONDS.sleep(4);

BufferedImage screencapture = new Robot().createScreenCapture(
           new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );

  
     File file = new File("screencapture.jpg");
     ImageIO.write(screencapture, "jpg", file);


 
    } 
    }
    
