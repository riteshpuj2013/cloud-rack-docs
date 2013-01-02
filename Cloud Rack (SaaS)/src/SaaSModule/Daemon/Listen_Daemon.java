/*
 * This program is responsible to listen to the specific folders that 
 * are needed to be synchronized with the cloud.
 */
package SaaSModule.Daemon;

/*
 * This program is called by the Run_Daemon.java program at the starting/initialization
 *
 *  This program will be running continously till the end of the process (end of time).
 *  The basic functions of this block of code is to
 *      1. Listen to changes in the Filesystem for the specified folder.
 *          Listening will be done by checking the folder for changes every 30 seconds.
 *      2. In case of change
 *           The respective changes will be noted in the desc.xml file.
 *              Desc.xml file will contain the following description of the folders , files and its subfolders.
 *      3. After updating the desc.xml file , inform the Run_Daemon for the changes.
 *      4. Re-Listen till end of time.
 *        
 */

/**
 *
 * @author iamrock
 */
public class Listen_Daemon {
    
}
