/*
 * This program is to authenticate the User with the cloud.
 */
package SaaSModule.Daemon;

/*
 *  This program will run one time in the startup/installation for authentication of the user
 *  or whenever the user credentials are lost.
 *  Functionality of this module is:
 *      Call the PAAS server and authenticate the database.
 *          The credentials will be stored in a file known as .user.xml
 *      The authentication protocol will be to store
 *          1) Username/ID
 *          2) Email
 *          3) MD5-hash(Password+Mac Address) - + - MD5-hash(Mac + Machine Name)
 *          4) IP Address
 */

/**
 *
 * @author iamrock
 */
public class AuthenticateUser {
    
}
