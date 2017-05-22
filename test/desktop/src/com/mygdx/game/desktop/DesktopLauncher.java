package com.mygdx.game.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Window;


public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 960;
		config.height = 540;
		config.x = -1250;
		config.y = -1;
		config.addIcon("core/assets/image/ico.png", Files.FileType.Internal);
		config.title = "helo my frind";
		config.foregroundFPS = 60;

		new LwjglApplication(new Window(), config);
	}

}
