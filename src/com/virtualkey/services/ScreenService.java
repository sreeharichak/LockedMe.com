package com.virtualkey.services;

import com.virtualkey.screens.FileOptionScreen;
import com.virtualkey.screens.Screen;
import com.virtualkey.screens.WelcomeScreen;
import com.virtualkey.entities.Directory;

public class ScreenService {
	
	//static Directory dir = new Directory();
	
	
	
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionScreen FileOptionScreen = new FileOptionScreen();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
