import java.sql.*;
import java.sql.Connection;
import java.util.*;
import javax.swing.JOptionPane;
import java.io.Console;

class Project
{
     static  Connection   con =null;
   static {
       try {
                 Class.forName ("com.mysql.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYPROJECT","root","password");
                  
       }catch(Exception e) {
           
           
       }
       }
    public static void admin() throws SQLException, ClassNotFoundException
    {
         
                                Statement stmt = con.createStatement();
                               
                                
				ResultSet rs = stmt.executeQuery("SELECT * FROM user");
				String b = JOptionPane.showInputDialog("LOGIN ID-------->");
                                //Console c = System.console();
                                // System.out.println("fcsdhfdgs");
				Scanner scn = new Scanner(System.in);
                                System.out.print("ENTER PASSWORD-------->");
                               // char [] ch= c.readPassword();
				String d = scn.nextLine();
                              
				int flg=0;
				while(rs.next())	
			     {
                                      if(flg==1)
                                       break;
                                
						if(b.equals(rs.getString("UserId")) && d.equals(rs.getString("Password")) && rs.getString("Role").equals("ADMIN") && rs.getString("Status").equals("ACTIVATED"))
                                                   
						{  
                                                     flg=1; 
							System.out.println("********WELCOME********");	
							do
							{	
								
								int h = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Choice  : \n1.Add monitor details\n2.Add admin details \n3.Reset password for monitor \n4.Activate/Deactivate monitor \n5. Add new model details \n6.View all models \n7.View all monitors \n8.View all admin\n9.Search prospects Detail by  name \n10.search prospects Details by  hotness \n11.delete prospect \n12.Update password \n  0.to exit"));
								switch(h)
							   {
		 							case 1:
										PreparedStatement pst = con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?)");
										String UserId = JOptionPane.showInputDialog("ENTTER MONITOR ID");
										String Password = JOptionPane.showInputDialog("ENTER PASSWORD");
										String Role = JOptionPane.showInputDialog("ENTER ROLE OF THE USER");
										String Status = JOptionPane.showInputDialog("ENTER STATUS");
										String UserFullName = JOptionPane.showInputDialog("ENTER FULL NAME");
										String UserPhone = JOptionPane.showInputDialog("ENTER PHONE NO.");
										String UserEmail = JOptionPane.showInputDialog("ENTER EMAIL ID");
										String UserAddress = JOptionPane.showInputDialog("ENTER ADDRESS");
										pst.setString(1,UserId);
										pst.setString(2,Password);
										pst.setString(3,Role);
										pst.setString(4,Status);
										pst.setString(5,UserFullName);
										pst.setString(6,UserPhone);
										pst.setString(7,UserEmail);
										pst.setString(8,UserAddress);
										int status1 = pst.executeUpdate();
										if(status1 > 0)
										{
											System.out.println("\n \t Data saved successfully \n");
										}//end of if 
										else 
										{
											System.out.println("\n\t Data not saved successfully \n");
										}//end of else
										break;
									case 2:	
										PreparedStatement pst1 = con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?)");
										UserId = JOptionPane.showInputDialog("ENTER USER ID");
										Password = JOptionPane.showInputDialog("ENTER PASSWORD ");
										Role = JOptionPane.showInputDialog("ENTER ROOLE");
										Status = JOptionPane.showInputDialog("ENTER STATUS");
										UserFullName = JOptionPane.showInputDialog("ENTER FULL NAME ");
										UserPhone= JOptionPane.showInputDialog("ENTER PHONE NO.");
										UserEmail = JOptionPane.showInputDialog("ENTER EMAIL ID");
										UserAddress = JOptionPane.showInputDialog("ENTER ADDRESS");
										pst1.setString(1,UserId);
										pst1.setString(2,Password);
										pst1.setString(3,Role);
										pst1.setString(4,Status);
										pst1.setString(5,UserFullName);
										pst1.setString(6,UserPhone);
										pst1.setString(7,UserEmail);
										pst1.setString(8,UserAddress);
										int status2 = pst1.executeUpdate();
										if(status2 > 0)
										{
											System.out.println("\n \t Data saved successfully \n");
										}//end of if 
										else 
										{
											System.out.println("\n\t Data not saved successfully \n");
										}//end of else
										break;
									case 3:
										PreparedStatement pst2 = con.prepareStatement("update user set Password = ? where UserId = ? and Role='MONITOR'");
										String g = JOptionPane.showInputDialog("ENTER USER ID");
										Statement stmt1 = con.createStatement();
		 								ResultSet r1 = stmt1.executeQuery("SELECT * FROM user where UserId='"+g+"'  and Role='MONITOR' and Status='ACTIVATED'");
                                                                                
                                                                      
                                                                                
                                                                                    if(r1.next())
                                                                                    {
                                                                                        Password = JOptionPane.showInputDialog("ENTER NEW PASSWORD");
											pst2.setString(1,Password);
											pst2.setString(2,g);
                                                                                         int status3 = pst2.executeUpdate();
												if(status3 > 0)
													{
														System.out.println("\n \t Data saved successfully \n");
													}//end of if 
												else 
													{
														System.out.println("\n\t Data not saved successfully \n");
													}
                                                                                    }
                                                                                    else
												{
												   System.out.println("*******MONITOR NOT FOUND****");
												   break;
												}
										
                                                                               //end of else
														break;
										            
											
										
									
									case 4:
										PreparedStatement pst3 = con.prepareStatement("update user set Status = ? where UserId = ? and Role='MONITOR'");
										String name = JOptionPane.showInputDialog("ENTER USER ID");
										
										Statement stmt2 = con.createStatement();
		 								ResultSet r2 = stmt2.executeQuery("SELECT * FROM user where UserId='"+name+"'  and Role='MONITOR'");
										if(r2.next())
										{
											
											

												Status = JOptionPane.showInputDialog("ENTER STATUS TO CHANGE");
												pst3.setString(1,Status);
												pst3.setString(2,name);
												int status4 = pst3.executeUpdate();
												if(status4 > 0)
												{
												System.out.println("\n \t Data saved successfully \n");
												}//end of if 
												else 
												{
												System.out.println("\n\t Data not saved successfully \n");
												}//end of else
											
											}
											else
												{
												System.out.println("*******MONITOR NOT FOUND****");
												break;
												}
										
										break;
									case 5:
										
										PreparedStatement pst5 = con.prepareStatement("insert into model values(?,?,?,?,?,?,?,?,?)");
								
										String ModelName = JOptionPane.showInputDialog("enter model name");
										String ModelId= JOptionPane.showInputDialog("ENTER MODEL ID");
										String VehicleType = JOptionPane.showInputDialog("enter VEHICLE type");
										String Color = JOptionPane.showInputDialog("enter color of the car");
										String Engine= JOptionPane.showInputDialog("enter type of engine for the model ");
										String Price = JOptionPane.showInputDialog("enter price of the model ");
										String Warranty= JOptionPane.showInputDialog("enter warranty for the model ");
										String FuelType = JOptionPane.showInputDialog("enter fuel type");
										String TotalSeats = JOptionPane.showInputDialog("enter maximum seat for the model");
										pst5.setString(1,ModelName);
										pst5.setString(2,ModelId);
										pst5.setString(3,VehicleType);
										pst5.setString(4,Color);
										pst5.setString(5,Engine);
										pst5.setString(6,Price);
										pst5.setString(7,Warranty);
										pst5.setString(8,FuelType);
										pst5.setString(9,TotalSeats);
										int status5 = pst5.executeUpdate();
										if(status5 > 0)
										{	
											System.out.println("\n \t Data saved successfully \n");
										}//end of if 
										else 
										{
											System.out.println("\n\t Data not saved successfully \n");
										}//end of else
										break;
									case 6:
										Statement stmt3 = con.createStatement();
		 								ResultSet r3 = stmt3.executeQuery("SELECT * FROM model");
										while(r3.next())
										{
											System.out.println(r3.getString("ModelName") +"\t" +r3.getString("ModelId")+"\t" +r3.getString("VehicleType") +"\t" +r3.getString("Color")+"\t" +r3.getString("Engine") +"\t" +r3.getString("Price")+"\t" +r3.getString("Warranty") +"     " +r3.getString("FuelType") +"     " +r3.getString("TotalSeats"));
										}//end of while loop
										break;
									case 7:
										Statement stmt4 = con.createStatement();
                                                                                ResultSet r4 = stmt4.executeQuery("SELECT * FROM user");
										while(r4.next())
                                                                                {
											if(r4.getString("Role").equals("MONITOR"))
											System.out.println("\t" +r4.getString("UserId") +"\t" +r4.getString("Password") +"\t" +r4.getString("Role") +"\t" +r4.getString("Status")+"\t" +r4.getString("UserFullname")+"\t" +r4.getString("UserPhone")+"\t" +r4.getString("UserEmail")+"\t" +r4.getString("UserAddress"));
										}//end of while loop
										break;			
									case 8:
										Statement stmt5 = con.createStatement();
		 								ResultSet r5 = stmt5.executeQuery("SELECT * FROM user");
										while(r5.next())
										{
											if(r5.getString("Role").equals("ADMIN"))
											System.out.println("\t" +r5.getString("UserId") +"\t" +r5.getString("Password") +"\t" +r5.getString("Role") +"\t" +r5.getString("Status")+"\t" +r5.getString("UserFullname")+"\t" +r5.getString("UserPhone")+"\t" +r5.getString("UserEmail")+"\t" +r5.getString("UserAddress"));
										}//end of while loop
										break;			
									case 9:
										String name2 = JOptionPane.showInputDialog("ENTTER PROSPECT NAME");
										Statement stmt6= con.createStatement();
		 								ResultSet r6 = stmt6.executeQuery("SELECT * FROM prospect");
										int j =0;
										while(r6.next())
										{
											if((r6.getString("ProspectName")).equals (name2))
											{
												System.out.println("\t" +r6.getString("ProspectId") +"\t" +r6.getString("ProspectName") +"\t" +r6.getString("ProspectPhone") +"\t" +r6.getString("ProspectAddress")+"\t" +r6.getString("InterestedModel") +"\t" +r6.getString("InterestedColor") +"\t" +r6.getString("DateOfVisit")+"\t" +r6.getString("Status"));
											j=1;
											}
											
										}//end of while loop
										if(j==0)
										{
											System.out.println("*******PROSPECT NOT FOUND********");
										}
										break;

									case 10:
										String name3 = JOptionPane.showInputDialog("ENTTER STATUS THROUGH WHICH YOY WANT TO SEARCH");
										Statement stmt7= con.createStatement();
		 								ResultSet r7 = stmt7.executeQuery("SELECT * FROM prospect");
										int i =0;
										while(r7.next())
										{
											if((r7.getString("Status")).equals (name3))
											{
												System.out.println("\t" +r7.getString("ProspectId") +"\t" +r7.getString("ProspectName") +"\t" +r7.getString("ProspectPhone") +"\t" +r7.getString("ProspectAddress")+"\t" +r7.getString("InterestedModel") +"\t" +r7.getString("InterestedColor") +"\t" +r7.getString("DateOfVisit")+"\t" +r7.getString("Status"));
											i=1;
											}
											
										}//end of while loop
										if(i==0)
										{
											System.out.println("*******PROSPECT NOT FOUND********");
										}
										break;
								
									case 11:
										PreparedStatement pst6 = con.prepareStatement("delete from prospect where ProspectName = ?");
										String PName = JOptionPane.showInputDialog("ENTER PROSPECT NAME");
										pst6.setString(1,PName);
										int status6 = pst6.executeUpdate();
										if(status6 > 0)
										{
											System.out.println("\n \t Data deleted successfully \n");
										}
										else 
										{
											System.out.println("\nPROSPECT NOT FOUND \n \t Data not deleted successfully  \n ");
										}
										break;
									case 12:
										PreparedStatement pst7 = con.prepareStatement("update user set Password = ? where UserId = ?");
										String id = JOptionPane.showInputDialog("ENTER USER ID TO CHANGE PASSWORD");
										Statement stmt8 = con.createStatement();
		 								ResultSet r8 = stmt8.executeQuery("SELECT * FROM user where UserId='"+id+"' and Role='ADMIN'");
										if(r8.next())
										{
										
                                                                                    String Apass = JOptionPane.showInputDialog("ENTER NEW PASSWORD");
                                                                                    pst7.setString(1,Apass);
                                                                                    pst7.setString(2,id);
                                                                                    int status7 = pst7.executeUpdate();
                                                                                        if(status7 > 0)
                                                                                        {		
											System.out.println("\n \t *****Data updated successfully****** \n");
                                                                                           }//end of if 
                                                                                    else 
                                                                                        {
											System.out.println("\n\t ******Data not updated successfully***** \n");
                                                                                            }//end of else
                                                                                        
                                                                                    }
                                                                                        else
                                                                                        {
                                                                                            System.out.println("ADMIN NOT FOUND");
                                                                                        break;
                                                                                        }
                                                                                        
                                                                                
                                                                                break;
									case 0:
										System.exit(0);
										break;  //to exit the loop
									default:
										System.out.println("******INVALID CHOICE******RETRY!!!!!");	
	 							}//end of inner switch case 1
                                                        }while(true);
                                                    }
                                                
                             
                             }
                                if(flg==0)
                                    System.out.println("ADMIN NOT FOUND");
                                     
    }
    public static void monitor() throws SQLException, ClassNotFoundException
    {
                                Statement st = con.createStatement();
		 		ResultSet re = st.executeQuery("SELECT * FROM user");
				String b = JOptionPane.showInputDialog("USER ID-------->");
                                /*
                                Console co= System.console();
                                Console c1=System.console();
                                System.out.print("ENTER PASSWORD-------->");
                              char [] cc=c1.readPassword();
				String d = String.valueOf(cc);
				Scanner scn = new Scanner(System.in);
                                */
                                Scanner sc = new Scanner(System.in);
                                System.out.print("ENTER PASSWORD-------->");
                               // char [] ch= c.readPassword();
				String d = sc.nextLine();
                             
								
				int m =0;

					while(re.next())
					{	if(m==1) break;
						if(b.equals(re.getString("UserId")) && d.equals(re.getString("Password")) && re.getString("Status").equals("ACTIVATED")&& re.getString("Role").equals("MONITOR") )
							{
                                                                 m=1;
                                                                 
								System.out.println("***********YOUR ACCOUNT IS ACTIVE WELCOME SIR**************");
	
								do
								   {
									int h = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Choice  : \n1.Add New Prospect Details\n2.View All Prospect Details \n3.Update Contact Details For Prospect \n4.Update The Interested Color \n5. Reset Password \n  0.to exit"));
										switch(h)
										    {
									case 1:
										PreparedStatement ps = con.prepareStatement("insert into prospect values(?,?,?,?,?,?,?,?)");
										String ProspectId = JOptionPane.showInputDialog("ENTER THE PROSPECT ID ");
										String ProspectName = JOptionPane.showInputDialog("ENTER PROSPECT NAME");
										String ProspectPhone = JOptionPane.showInputDialog("ENTER PHONE NO. FOR THE PROSPECT");
										String ProspectAddress = JOptionPane.showInputDialog("ENTER THE PROSPECT ADDRESS");
										String InterestedModel= JOptionPane.showInputDialog("ENTER THE INTERESTED MODEEL FOR THE PROSPECT");
										String InterestedColor= JOptionPane.showInputDialog("ENTER THE INTERESTED COLOR");
										String DateOfVisit= JOptionPane.showInputDialog("ENTER THE DATE OF VISIT");
										String Status = JOptionPane.showInputDialog("ENTER STATUS OF THE PROSPECT");
										ps.setString(1,ProspectId);
										ps.setString(2,ProspectName);
										ps.setString(3,ProspectPhone);
										ps.setString(4,ProspectAddress);
										ps.setString(5,InterestedModel);
										ps.setString(6,InterestedColor);
										ps.setString(7,DateOfVisit);
										ps.setString(8,Status);
										int status1 = ps.executeUpdate();
										if(status1 > 0)
										{
											System.out.println("\n \t Data saved successfully \n");
										}//end of if 
										else 
										{
											System.out.println("\n\t Data not saved successfully \n");
										}//end of else
										break;
									case 2:
										Statement stm1 = con.createStatement();
		 								ResultSet r1 = stm1.executeQuery("SELECT * FROM prospect");
										while(r1.next())
										{
											
											System.out.println(r1.getString("ProspectId") +"          " +r1.getString("ProspectName")+"          " +r1.getString("ProspectPhone") +"          " +r1.getString("ProspectAddress")+"          " +r1.getString("InterestedModel") +"          " +r1.getString("InterestedColor")+"          " +r1.getString("DateOfVisit") +"          " +r1.getString("Status"));
										}//end of while loop
										break;
									case 3:
										
                                                                        	PreparedStatement ps1 = con.prepareStatement("update prospect set ProspectPhone = ? where ProspectId = ?");
										String name = JOptionPane.showInputDialog("ENTER PROSPECT ID");
										
										Statement stm2 = con.createStatement();
		 								ResultSet r2 = stm2.executeQuery("SELECT  * FROM prospect where ProspectId='"+name+"'");
										if(r2.next())
										        {
											

												String cd = JOptionPane.showInputDialog("ENTER NEW CONTACT NO.");
												ps1.setString(1,cd);
												ps1.setString(2,name);
												int status2 = ps1.executeUpdate();
												if(status2 > 0)
												{
												System.out.println("\n \t Data saved successfully \n");
												}//end of if 
												else 
												{
												System.out.println("\n\t Data not saved successfully \n");
												}//end of else
												
											}
											else
												{
												System.out.println("*******PROSPECT NOT FOUND****");
												break;
												}
										
										break;
									
									case 4:
										PreparedStatement ps2 = con.prepareStatement("update prospect set InterestedColor = ? where ProspectId = ?");
										name = JOptionPane.showInputDialog("ENTER PROSPECT ID");
										
										Statement stm3 = con.createStatement();
		 								ResultSet r3 = stm3.executeQuery("SELECT  * FROM prospect where ProspectId='"+name+"'");
										if(r3.next())
										{
											

												String color = JOptionPane.showInputDialog("ENTER NEW INTERSTED COLOR");
												ps2.setString(1,color);
												ps2.setString(2,name);
												int status3 = ps2.executeUpdate();
												if(status3 > 0)
												{
												System.out.println("\n \t Data saved successfully \n");
												}//end of if 
		
                                                                                                else 
												{
												System.out.println("\n\t Data not saved successfully \n");
												}//end of else
												
											}
											else
												{
												System.out.println("*******PROSPECT NOT FOUND****");
												break;
												}
										
										break;
									case 5:
										
										PreparedStatement ps3 = con.prepareStatement("update user set Password = ? where UserId = ? and Role='MONITOR'");
										String g = JOptionPane.showInputDialog("ENTER USER ID");
										Statement stm4 = con.createStatement();
		 								ResultSet r4 = stm4.executeQuery("SELECT * FROM user where UserId='"+g+"' and Role='MONITOR'");
										if(r4.next())
										{
											 
											String Password = JOptionPane.showInputDialog("ENTER NEW PASSWORD");
											ps3.setString(1,Password);
											ps3.setString(2,g);
											int status4 = ps3.executeUpdate();
												if(status4 > 0)
													{
														System.out.println("\n \t Data saved successfully \n");
													}//end of if 
												else 
													{
														System.out.println("\n\t Data not saved successfully \n");
													}//end of else
													
										            }
											else
												{
												   System.out.println("*******MONITOR NOT FOUND****");
												   break;
												}
                                                                                break;
			                                                                  
										//end of all cases	
                                                                                 case 0:	 System.exit(0);
                                                                                 
                                                                                 default : System.out.println("*****INVALID CHOICE RETRY*******");
									     }//end of switch case

                                                                            }while(true);	
									}
                                                             
                                                             }
                                                                
                                                
                                                if(m==0)
							 
                                                            System.out.println("******MONITOR NOT FOUND OR DEACTIVATED OR INCORRECT PASSWORD RETRY*******");

						
								
							}
					

                                                   
                                                   
                                                       

    
	public static void main(String ... args) throws Exception
	{
                   
		Project obj = new Project();
		do 
	     {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter The Category.......\n 1.ADMIN \n 2.MONITOR \n 3.EXIT"));
		switch(a)
		{ 
                    
                    
                        case 1:  obj.admin();
                                     break;
                        case 2: obj.monitor();
                                     break;
                        case 3:  System.exit(0);
                        default: System.out.println("*************INVALID ENTRY******************");
                        
                    
                
                
                    
                }
             }while(true);
                
         }
    }

							
	
