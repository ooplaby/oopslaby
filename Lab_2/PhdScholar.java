public class PhdScholar extends BITSStudent {
    String topic;
    double schoolFinalPercentage;
    String[] guides;
    String department;

    public void setQualification(String q) {
        this.schoolFinalPercentage = Double.parseDouble(q);
    }

    public void setScholarship(String stipendClass) {
        if (stipendClass.equals("INTERNAL"))
            super.stipend = 37000;
        else if (stipendClass.equals("PROJECT"))
            super.stipend = 45000;
        else
            super.stipend = Integer.parseInt(stipendClass);
    }
    public void setGuides(String[] guides){
        this.guides = guides;
    }

    public void printDetails(){
        String stipendDetails = "";
        if(super.stipend==0)
            stipendDetails = "recieves no scholarship";
        else
            stipendDetails = "recives a scholarship of "+super.stipend+" per month.";
        System.out.println(super.name  + "\n"
                           +"The id of the student is "+super.ID+" and email is "+super.email+"\n"
                           +"The student got "+this.schoolFinalPercentage+"/% marks in 12th and "
                           +stipendDetails+"\n");
        for(String x: this.guides){
            System.out.println("The guides are: " + x + "\n");
        }
    }

    public PhdScholar(String name, String ID, String topic, String sfP, String stipend, String department, String[] guides){
        super.name = name;
        super.ID = ID;
        super.email = "f"+ID+"@hyderabad.bits-pilani.ac.in";
        this.topic = topic;
        this.department = department;
        
        setScholarship(stipend);
        setQualification(sfP);
        setGuides(guides);
        
    }
}
   