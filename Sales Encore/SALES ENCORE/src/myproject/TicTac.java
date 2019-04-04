
package myproject;


import javax.swing.JOptionPane;

public class TicTac {
       
                    public static void main(String [] args) {
                             
                        System.out.println("*****WELCOME TO THE TIC TAC GAME*****");
                        int a[][] = new int [3][3];
                        System.out.println("1     2     3");
                        System.out.println("4     5     6");
                        System.out.println("7     8     9");
                        
                        for(int i=0;i<9;i++)
                        {
                        int b = Integer.parseInt(JOptionPane.showInputDialog("USER  \n ENTER THE NUMBER FROM THE MENU TO ENTER......"));
                        switch(b) 
                        {
                            case 1:
                               a[1][1] = 'X';
                                    break;
                           case 2:
                               a[1][2] = 'X';
                                    break;
                           case 3:
                               a[1][3] = 'X';
                                    break;
                           case 4:
                               a[2][1] = 'X';
                                    break;
                           case 5:
                               a[2][2] = 'X';
                                    break;
                           case 6:
                               a[2][3] = 'X';
                                    break;
                           case 7:
                               a[3][1] = 'X';
                                    break;
                           case 8:
                               a[3][2] = 'X';
                                    break;
                           case 9:
                               a[3][3] = 'X';
                                    break;
                           default:
                                        System.out.println("INVALID CHICE");
                                    break;
                           
                        }
                        
                        int c = Integer.parseInt(JOptionPane.showInputDialog("USER  \n ENTER THE NUMBER FROM THE MENU TO ENTER......"));
                        switch(b) 
                        {
                            case 1:
                               a[1][1] = 'O';
                                    break;
                           case 2:
                               a[1][2] = 'O';
                                    break;
                           case 3:
                               a[1][3] = 'O';
                                    break;
                           case 4:
                               a[2][1] = 'O';
                                    break;
                           case 5:
                               a[2][2] = 'O';
                                    break;
                           case 6:
                               a[2][3] = 'O';
                                    break;
                           case 7:
                               a[3][1] = 'O';
                                    break;
                           case 8:
                               a[3][2] = 'O';
                                    break;
                           case 9:
                               a[3][3] = 'O';
                                    break;
                           default:
                                        System.out.println("INVALID CHICE");
                                    break;
                           
                        }
                        
                        
                        
                        }
        }
   
}
