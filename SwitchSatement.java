package june5MorningBatch;

public class SwitchSatement {
	public void veera() {
		String festival ="Holi";

	switch(festival) {
	case "Republic day"     : System.out.println("26th January 2022  Wednesday");break;
	case "Shiv Jayanti"     :System.out.println("19th Feb 2022 Saturaday");break;
	case "Holi"             :System.out.println("18th March 2022 Friday");break;
	case "Gudi padwa "      :System.out.println("2nd April 2022 Monday"); break;
	case "Maharashtra day"  : System.out.println("1st May 2022 Sunaday");break;
	case "Father's Day "    :System.out.println("19 th june 2022 Sunady"); break;
	case "Bail pola"        :System.out.println("12th july 2022 tuesday"); break;
	case "Raksha Bandahn "  : System .out.println("11th August 2022 thursday");break;
	case "Teacher's day "   : System.out.println("5th septemeber 2022 monaday"); break;
	case "Diwali "          : System.out.println("24th october 2022 monday");break;
	case "Tulasi vivah "    : System.out.println("5th November 2022 saturaday"); break;
	case "Chritmas "        : System.out.println("25 th december 2022 Sunday"); break;
	default   : System.out.println ("Festivale is not listed");
		}}

public static void veera1() {  
    String name = "Mango";  
    switch(name){  
    case "Mango":   System.out.println("It is a fruit"); break;
    case "Tomato":System.out.println("It is a vegitable");break;
    case "Coke":System.out.println("It is cold drink"); break;
    default : System.out.println ("Item doesn't exist ");
    }  
}  

	
	
	public static void main(String [] args) {
		SwitchSatement p = new SwitchSatement();
		p.veera();
	veera1();
	}
       
	

}

