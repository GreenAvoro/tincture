import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Main {

	public static void main(String[] args) {

		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.create();
		} catch (Exception e) {

		}
		
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, Display.getWidth(), 0, Display.getHeight(), -1, 1);
		
		
		while (!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			
			
			
			
			Display.update();

		}
		Display.destroy();

	}

}
