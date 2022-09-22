package lecture_01;
// frontend class
public class Studentdetails_use
{
	public static void main (String[]args) 
	{
		Studentdetails s1 = new Studentdetails ("cgc");
		s1.setName("alok");
		s1.setAge(23);
		s1.setroll(1802287);
		s1.print();
		Studentdetails s2 = new Studentdetails ("");
		s1.setName("deepak");
		s1.setAge(23);
		s1.setroll(1802326);
		s1.print();
		
        System.out.print(Studentdetails.getnumberofobjects());
	}
}