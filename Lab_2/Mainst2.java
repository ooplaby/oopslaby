public class Mainst2 {
    public static void main(String[] args) {
       /* BITSStudent students[] = new BITSStudent[6];
        students[0] = new FDStudent("Noori", "2020PS4576H", "CS", "96", "2000");
        students[1] = new FDStudent("Rohit", "2020PS9876H", "Mech", "98", "UGNS");
        students[2] = new FDStudent("Sayani", "2020PS3645H", "Eco", "94", "UG");
        students[3] = new HDStudent("Maya", "2023TS7656H", "CS", "92,8.45", "PG");
        students[4] = new HDStudent("Kalki", "2023TS8765H", "EC", "91,7.92", "PGGate");
        students[5] = new HDStudent("Harsh", "2023TS3517H", "Math", "97,9.4", "20000");
        System.out.println("\n********\n");
        for(BITSStudent student:students){
            student.printDetails();
        }*/ 
        PhdScholar scholars[] = new PhdScholar[2];
        String[] guide1 = {"Mae","nae"};
        String[] guide2 = {"rae","cae","tae"};
        scholars[0] = new PhdScholar("Ram", "P23333333", "csr", "92", "INTERNAL", "Maths", guide1); 
        scholars[1] = new PhdScholar("Raaam", "P233333233", "cswr", "93", "PROJECT", "Mathss", guide2); 
        for(PhdScholar scholar:scholars){
            scholar.printDetails();


    }
}}
