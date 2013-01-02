/*
 * This program is meant for Synchronization of the Files and Folders 
 * on the Operating System.
 */
package SaaSModule.Daemon;

/*
 *  This program is called on requriement by the program Run_Daemon.java for the sake of
 *  synchronization of the file block.
 * 
 *  The basic operations of this program can be stated as follows :
 *  1. Identify synchronization direction
 *      This is to identify wether the files are to be uploaded or downloaded.
 *  2. Identify the files/folders to be synchronized.
 *      To reduce bandwidth usage this program will short-list those files that need to be 
 *      synced and leave the rest as it is. (Basically this will be done by checking 
 *      the timestamp differences in the files.).
 *  3. Finally call the function that will synchronize the foldes and files.
 *      Synchronize files and folders is to Delete , Update , Modify and Add.
 */

/**
 *
 * @author iamrock
 */
public class Sync_Daemon {
    
}
