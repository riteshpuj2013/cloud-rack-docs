/*
 * This class file is basically for kickstarting the SAAS modules.
 * This class is responsible for starting the various modules,classes,programs under the SAAS module and should be Run first.
 */
package SaaSModule.Daemon;

/*
 *  The functionality of this class file is:
 * 
 *  1. Initialize various other programs though the constructor call. And keep them running till the process is not terminated.
 *  2. Various other modules and programs that are to be invoked are:
 *      i. Listen_Daemon (Listenter)
 *              Listener will listen/monitor the system folder for changes made by the user.(30 Second refresh rate)
 *      ii. Sync_Daemon (File Synchronization Block)
 *              This will depend upon the communicaotors response which will state wether there is a requirement for synchronization.
 *      iii. Communicator (To communicate with the Cloud (PAAS Block))
 *              Communicator has to be invoked upon changes only.
 *      iv. Graphical User Interface 
 *              This UI is to be invoked on startup and kept on running.
 */

/*
 *  For the purpose of the User Authentication we have to do a one time authentication of the
 *  user for one device by calling AuthenticateUser.java module.
 */
/**
 *
 * @author iamrock
 */
public class Run_Daemon {
    
}
