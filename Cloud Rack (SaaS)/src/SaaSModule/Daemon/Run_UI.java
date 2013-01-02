/*
 * This class file is basically for invoking various UI programs. This class is called by the 
 * Run_Daemon.java on startup of the process and run till the end of time.
 */
package SaaSModule.Daemon;

import SaaSModule.FrontEnd.Notification_UI.Notification_Dropdownmenu_UI;
/*
 *  This program calls the following:
 *      1) First time run/installation : 
 *          It will invoke the Install_UI.java program to initialize various initial settings
 *          and authentication information.
 *          This will be run only once and not after that.
 *      2) Then , Run the Tray_UI.java :
 *          Run the tray program for a basic system notification icon with the various settings page,
 *          and right click menu etc.
 * 
 */
/**
 *
 * @author iamrock
 */
public class Run_UI {
    
    public static void main(String args[]) {
        
        Notification_Dropdownmenu_UI n = new Notification_Dropdownmenu_UI();
        n.setVisible(true);
    }
    
}
