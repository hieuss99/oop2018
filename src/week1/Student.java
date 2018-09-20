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
