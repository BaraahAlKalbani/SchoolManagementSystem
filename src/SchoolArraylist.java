import java.util.*;
public class SchoolArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>[] Student = new ArrayList[10];
		ArrayList<String>[] Teacher = new ArrayList[10];

		int iStudent =0;
		int iTeacher =0;

		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t--School Managment System--");
		System.out.println("_________________________________________________");

		boolean validMenu1=false;

		while(validMenu1!=true)
		{
			boolean validadmin=false;
			boolean vaildCR=false;
			boolean vaildS=false;
			System.out.println("Select Option:");
			System.out.println("\t1> Admin Pannel");
			
			System.out.println("\t2> Career Opertonities");
			System.out.println("\t3> ADMISION ");
			System.out.println("\t4> Exit Program ");
			System.out.println("\tEnter Your Input:");
			int input=sc.nextInt();
			sc.nextLine();
			System.out.println("**************************************************\n");
			if(input==1)
			{
				while(validadmin!=true) {


					System.out.println("\t\t**Admin**");
					System.out.println("Select Option:");
					System.out.println("\t1> Manage Student");
					System.out.println("\t2> Manage Teacher ");
					System.out.println("\t3> Main menu");
					int in1=sc.nextInt();
					sc.nextLine();

					if(in1==1)
					{
						System.out.println("\t\t**Manage Student**");
						System.out.println("_________________________________________________");
						//System.out.println("* Enter Student Email Id:");
						//String n = sc.nextLine();

						for (int i = 0; i < 3; i++) {
							for (int j = 0; j < Student[i].size(); j++) {
								System.out.print(Student[i].get(j) + " ");
							}
							System.out.println();
						}

						System.out.println("*Done!?  y,n");
						String g=sc.nextLine();

						if(g =="y")
						{
							validadmin=true;
						}
						else 
						{
							validadmin=false;
						}

					}
					else if(in1==2)
					{
						System.out.println("\t\t**Manage Teacher List**");
						System.out.println("_________________________________________________");

						//System.out.println("* Enter Teacher Name:");
						//String n = sc.nextLine();
						for (int i = 0; i < 3; i++) {
							for (int j = 0; j < Teacher[i].size(); j++) {
								System.out.print(Teacher[i].get(j) + " ");
							}
							System.out.println();
						}

						System.out.println("*Done!?  y,n");
						String g=sc.nextLine();

						if(g=="y")
						{
							validadmin=true;
						}
						else 
						{
							validadmin=false;
						}


					}
					else if(in1==3)
					{
						validadmin=true;
					}
					else
					{
						validadmin=false;
						System.out.println("\t--Invalid Input--");
						System.out.println("_________________________________________________");
					}
				}

			}
			else if(input==2)
			{
				while(vaildCR!=true) 
				{
					System.out.println("\t\t**Career Opertonities**");
					System.out.println("Select Option:");
					System.out.println("\t1> add Teacher ");
					System.out.println("\t2> Main menu");
					int in2=sc.nextInt();
					sc.nextLine();
					if(in2==1)
					{
						System.out.println("\t\t**Hire new Teacher**");
						System.out.println("_________________________________________________");
						String iString;
						System.out.println("new Teacher number is:"+(iTeacher+1));
						System.out.println("* Enter Teacher Name:");
						iString=sc.nextLine();
						Teacher[iTeacher].add(iString);
						System.out.println("* Enter Teacher Phone number:");
						iString=sc.nextLine();
						Teacher[iTeacher].add(iString);
						System.out.println("* Enter Teacher Email Address:");
						iString=sc.nextLine();
						Teacher[iTeacher].add(iString);
						System.out.println("*************************************************");
						System.out.println("New Teacher data:"+Teacher[iTeacher].get(0)+" , "+Teacher[iTeacher].get(1)+" , "+Teacher[iTeacher].get(2));
						System.out.println("*Done!?  y,n");
						String g=sc.nextLine();

						if(g=="y")
						{
							vaildCR=true;
						}
						else 
						{
							iTeacher++;
							vaildCR=false;
						}

					}
					else if (in2==2) {
						vaildCR=true;
					}
					else 
					{
						vaildCR=false;
						System.out.println("\t--Invalid Input--");
						System.out.println("_________________________________________________");
					}


				}

			}
			else if(input==3)
			{
				while(vaildS!=true) 
				{
					System.out.println("\t\t**Admision**");
					System.out.println("Select Option:");
					System.out.println("\t1> add Student ");
					System.out.println("\t2> Main menu");
					int in2=sc.nextInt();
					sc.nextLine();
					if(in2==1)
					{
						String iString;
						System.out.println("\t\t**Regester new Student**");
						System.out.println("_________________________________________________");
						System.out.println("new Student number is:"+(iStudent+1));
						System.out.println("* Enter Student Name:");
						iString=sc.nextLine();
						Student[iStudent].add(iString);
						System.out.println("* Enter Student Phone number:");
						iString=sc.nextLine();
						Student[iStudent].add(iString);
						System.out.println("* Enter Student Email Address:");
						iString=sc.nextLine();
						Student[iStudent].add(iString);
						System.out.println("*************************************************");
						System.out.println("New Student data:"+Student[iStudent].get(0)+" , "+Student[iStudent].get(1)+" , "+Student[iStudent].get(0));
						System.out.println("*Done!?  y,n");
						String g=sc.nextLine();

						if(g=="y")
						{
							vaildS=true;
						}
						else 
						{
							iTeacher++;
							vaildS=false;
						}

					}
					else if (in2==2) {
						vaildS=true;
					}
					else 
					{
						vaildS=false;
						System.out.println("\t--Invalid Input--");
						System.out.println("_________________________________________________");
					}
				}
			}
			else if (input==4) 
			{
				validMenu1=true;
				System.out.println("\t--Shuting Off Program--");
			}
			else 
			{
				validMenu1=false;
				System.out.println("\t--Invalid Input--");
				System.out.println("_________________________________________________");
			}
		}
	}
}



