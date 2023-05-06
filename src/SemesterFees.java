
import java.util.Scanner;


public class SemesterFees {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which Semester do you want to pay?\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n");
		
		int num = input.nextInt();
			
		switch(num) {
		
		case 1:
			Semester1 s1= new Semester1();
			s1.show();
			break;
		
		case 2:
			Semester2 s2= new Semester2();
			s2.show();
			break;
		
		case 3:
			Semester3 s3= new Semester3();
			s3.show();
			break;
		
		case 4:
			Semester4 s4= new Semester4();
			s4.show();
			break;
			
		case 5:
			Semester5 s5= new Semester5();
			s5.show();
			break;
			
		case 6:
			Semester6 s6= new Semester6();
			s6.show();
			break;
			
		case 7:
			Semester7 s7= new Semester7();
			s7.show();
			break;
			
		case 8:
			Semester8 s8= new Semester8();
			s8.show();
			break;
			
		case 9:
			Semester9 s9= new Semester9();
			s9.show();
			break;
			
		case 10:
			Semester10 s10= new Semester10();
			s10.show();
			break;
			
		case 11:
			Semester11 s11= new Semester11();
			s11.show();
			break;
			
		case 12:
			Semester12 s12= new Semester12();
			s12.show();
			break;
			
		default:
			System.out.println("You choose wrong!");
			break;
				}
	
	}

}

class Semester1{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (58100*waiver)/100;
		    fees1 = (58100- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);

	}
}

class Semester2{
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (53600*waiver)/100;
		    fees1 = (53600- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);

	}
}

class Semester3{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (64000*waiver)/100;
		    fees1 = (64000- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);
	
	}
}

class Semester4{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
	
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (55700*waiver)/100;
		    fees1 = (55700- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);
	
	}
}

class Semester5{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (64000*waiver)/100;
		    fees1 = (64000- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);
	
	}
}

class Semester6{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (59300*waiver)/100;
		    fees1 = (59300- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);

	}
}

class Semester7{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (54600*waiver)/100;
		    fees1 = (54600- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);

	}
}

class Semester8{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (60800*waiver)/100;
		    fees1 = (60800- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);

	}
}

class Semester9{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (54400*waiver)/100;
		    fees1 = (54400- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);

	}
}

class Semester10{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (44500*waiver)/100;
		    fees1 = (44500- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);

	}
}

class Semester11{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (53900*waiver)/100;
		    fees1 = (53900- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);
	}
}

class Semester12{
	
	public void show() {
		Scanner input = new Scanner(System.in);
		
		int waiver, fees, fees1, fees2, fees3, due, due1;
		
		System.out.println("What is the percentage of your current waiver?\n");
		waiver = input.nextInt();
	
		System.out.println("Do you have any previous due?\n");
		System.out.println("If Yes press '1'\nIf No  press '2'\n");
		due = input.nextInt();
		
		    if(due==1){
		    	System.out.println("Write the amount of your due:\n");
		    	due1 = input.nextInt();
		    }
		    else{
		        due1=0;
		    }
		    
		    fees = (39000*waiver)/100;
		    fees1 = (39000- fees);
		    fees2 = (fees1+due1)/2;
		    fees3= fees1+due1+13500;

		    System.out.println("You have to pay in this Semester:\n");
		    System.out.println("In Registration: 13500");
		    System.out.println("In Mid term: "+fees2);
		    System.out.println("In Final: " +fees2);
		    System.out.println("\nTotal: " +fees3);
	
	}
}

