package main;

import java.io.File;

import com.sun.javafx.application.LauncherImpl;

/**
 * @author Nick Madero
 *
 */
public class Launcher {
    public static String jversion;

    /**
     * @param args
     */
    @SuppressWarnings("restriction")
    public static void main(String[] args) {
        System.out.println("Running...");

        //prints java path that gives version of java being used
        final String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
        jversion = javaBin;
        System.out.println(javaBin);


        LauncherImpl.launchApplication(App.class, SpashScreenPreloader.class, args);

//        Application.launch(AppM.class, args);

    }

}