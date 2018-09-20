package java1;

import java.util.*;

class Student {	
	// TODO: khai báo các thuộc tính cho Student
     String Name, Id, Email, Group;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName()
    {
        return Name;
    }
    public void  setName(String s)
    {
        this.Name = s;
    }
    public String getEmail()
    {
        return Email;
    }
    public void setEmail(String s)
    {
        this.Email = s;
    }
    public String getGroup()
    {
        return Group;
    }
    public void setGroup(String s)
    {
        this.Group = s;
    }
    public String getId()
    {
        return Id;
    }
    public void setId(String id)
    {
        this.Id = id;
    }
    /**
     * Constructor 1
     */

    public Student() {
        // TODO:
        this.Name = "student";
        this.Id ="000";
        this.Group = "INT22041";
        this.Email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n, String i, String em) {
        // TODO:
        this.Name = n;
        this.Id = i;
        this.Group = "INT22041";
        this.Email = em;
    }

    /**
     * Constructor 3
     * @param s
     */

    public Student(Student s) {
        // TODO:
        this.Name = s.Name;
        this.Id = s.Id;
        this.Email = s.Email;
        this.Group = s.Group;
    }

    public void getInfo()
    {
    	System.out.println("--------------------------------");
        System.out.println("Name: "+this.Name);
        System.out.println("MSSV: "+this.Id);
        System.out.println("Email: "+this.Email);
        System.out.println("Group: "+this.Group);
    	System.out.println("--------------------------------");
    }
}

public class StudentManage {

	static Scanner sc = new Scanner(System.in);
     // TODO: khai báo thuộc tính students là array chia các đối tượng thuộc lớp Student (max. 100)
	static Student[] list = new Student[10];
	static int n = list.length;
    public static  boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if ( s1.Group.equals(s2.Group)) return true;
        else return false; // xóa dòng này sau khi cài đặt
    }

    static void scan()
    {
    	for( int i = 0 ; i < n; i ++)
    	{
    		String a, b, c;
    		System.out.print("Name: ");
    		a = sc.nextLine();
    		System.out.print("ID: ");
    		b = sc.nextLine();
    		System.out.print("Email: ");
    		c = sc.nextLine();
    		list[i] = new Student(a,b,c);
    		System.out.print("Group: ");
    		list[i].Group = sc.nextLine();
    	}
    }
     static void studentsByGroup() {
        // TODO:
    	HashSet<String> hs = new HashSet<String>();
    	for ( int i = 0; i < n ; i ++)
    	{ 		 
    		hs.add(list[i].Group);
    	}
    	String [] arr = new String[hs.size()];
    	hs.toArray(arr);
    	for ( int i = 0 ; i < hs.size(); i ++)
    	{
    		System.out.print("             "+arr[i]+" \n");
    		for ( int j = 0 ; j < n; j ++)
    		{
    			if(arr[i].equals(list[j].Group)) list[j].getInfo();
    		}
    	}
    	}

    public static void removeStudent(String id) {
        // TODO:
    for ( int i = 0 ; i < n;i ++)
    {
    	if (id.equals(list[i].Id)) 
    	{
    		for ( int j = i; j<n-1;j++)
    		{
    			list[j] = list[j+1];
    		}
    		n--;
    	} 
    }
    }
    public static void main(String[] args) {
        // TODO:
    	String a;
//        Student persion1 = new Student();	
//        Student persion2 = new Student("ND Hieu","17020742","17020742@vnu.edu.vn");
//        persion1.Name = "Nguyen Duc Hieu	";
//        persion1.Id = "17020742";
//        persion1.Email = "17020742@vnu.edu.com";
//        persion1.Group = "INT22041";
//        Student persion3 = new Student(persion1);
//        persion3.Group = "INT22042";
//        // print name:
//        System.out.println("Name: "+persion1.Name);
//        persion1.getInfo();
//        //check Group:
//        System.out.println("Same Group: "+sameGroup(persion1,persion2));
        list[0] = new Student("hieu","1","hieu@vnu");
        list[1] = new Student("hieu","2","hieu@vnu");
        list[2] = new Student("hieu","3","hieu@vnu");
        list[3] = new Student("hieu","4","hieu@vnu");
        list[4] = new Student("hieu","5","hieu@vnu");
        list[5] = new Student("hieu","6","hieu@vnu");
        list[5].setGroup("INT22042");
        list[6] = new Student("hieu","7","hieu@vnu");
        list[6].setGroup("INT22042");
        list[7] = new Student("hieu","8","hieu@vnu");
        list[7].setGroup("INT22042");
        list[8] = new Student("hieu","9","hieu@vnu");
        list[8].setGroup("INT22043");
        list[9] = new Student("hieu","10","hieu@vnu");
        list[9].setGroup("INT22043");
        Test1.studentsByGroup();
        System.out.print("remove the student: ");
        a = sc.nextLine();
        removeStudent(a);
        for(int i = 0; i < n ; i ++)
        {
        	list[i].getInfo();
        }
    }
    
}
