p
}


	
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
