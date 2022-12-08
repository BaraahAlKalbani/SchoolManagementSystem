import java.util.*;
public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String[][] student= new String[20][3];
		String[][] teacher= new String[20][3];
		int iStudent =0;
		int iTeacher =0;

		System.out.println("\t\t--School Managment System--");
		System.out.println("_________________________________________________");

		boolean valid=false;

		while(valid!=true)
		{
			System.out.println("Select Option:");
			System.out.println("\t1> Regester new Student");
			System.out.println("\t2> Manage Student");
			System.out.println("\t3> Hire New Teacher");
			System.out.println("\t4> Manage teacher");
			System.out.println("\tEnter Your Input:");
			int input=sc.nextInt();
			sc.nextLine();
			System.out.println("**************************************************\n");

			if(input==1)
			{
				System.out.println("\t\t**Regester new Student**");
				System.out.println("_________________________________________________");
				System.out.println("new Student number is:"+(iStudent+1));
				System.out.println("* Enter Student Name:");
				student[iStudent][0]=sc.nextLine();
				System.out.println("* Enter Student Phone number:");
				student[iStudent][1]=sc.nextLine();
				System.out.println("* Enter Student Email Address:");
				student[iStudent][2]=sc.nextLine();
				System.out.println("*************************************************");
				System.out.println("New Student data:"+student[iStudent][0]+" , "+student[iStudent][1]+" , "+student[iStudent][2]);
				System.out.println("*Done!?  y,n");
				String g=sc.nextLine();

				if(g=="y")
				{
					valid=true;
				}
				else 
				{
					iStudent++;
					valid=false;
				}

			}
			else if(input==2)
			{
				System.out.println("\t\t**Manage Student**");
				System.out.println("_________________________________________________");
				//System.out.println("* Enter Student Email Id:");
				//String n = sc.nextLine();
				for(int k=0;k<10;k++)
				{
					if(student[k][0]!=null)
					{
						System.out.println("Student "+(k+1)+" : "+student[k][0]+" , "+student[k][1]+" , "+student[k][2]);
						
					}
					else 
					{
						System.out.println("List is empty!!");
						break;
					}

				}

				System.out.println("*Done!?  y,n");
				String g=sc.nextLine();

				if(g=="y")
				{
					valid=true;
				}
				else 
				{
					valid=false;
				}

			}
			else if(input==3)
			{
				System.out.println("\t\t**Hire new Teacher**");
				System.out.println("_________________________________________________");

				System.out.println("new Student number is:"+(iTeacher+1));
				System.out.println("* Enter Teacher Name:");
				teacher[iTeacher][0]=sc.nextLine();
				System.out.println("* Enter Teacher Phone number:");
				teacher[iTeacher][1]=sc.nextLine();
				System.out.println("* Enter Teacher Email Address:");
				teacher[iTeacher][2]=sc.nextLine();
				System.out.println("*************************************************");
				System.out.println("New Teacher data:"+teacher[iTeacher][0]+" , "+teacher[iTeacher][1]+" , "+teacher[iTeacher][2]);
				System.out.println("*Done!?  y,n");
				String g=sc.nextLine();

				if(g=="y")
				{
					valid=true;
				}
				else 
				{
					iTeacher++;
					valid=false;
				}


			}
			else if(input==4)
			{
				System.out.println("\t\t**Manage Teacher List**");
				System.out.println("_________________________________________________");

				//System.out.println("* Enter Teacher Name:");
				//String n = sc.nextLine();
				for(int k=0;k<10;k++)
				{
					if(student[k][0]!=null)
					{
						System.out.println("Teacher "+(k+1)+" : "+teacher[k][0]+" , "+teacher[k][1]+" , "+teacher[k][2]);
					}
					else 
					{
						System.out.println("List is empty!!");
						break;
					}
				}

				System.out.println("*Done!?  y,n");
				String g=sc.nextLine();

				if(g=="y")
				{
					valid=true;
				}
				else 
				{
					valid=false;
				}


			}
			else 
			{
				valid=false;
				System.out.println("\t--Invalid Input--");
				System.out.println("_________________________________________________");

			}

		}

	}

}
