import java.util.*;
public class HelloSally {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("type 'hello sally' to begin.");
		String startCommand = userInput.nextLine();
		
			while(!startCommand.equals("hello sally")) {
				System.out.println("...try again dudski.");
				startCommand = userInput.nextLine();
			}
		
		System.out.println();
        	System.out.println("Hello! How are you?");
        	
        	boolean cont = true;
        	
        	do {
        	System.out.println("if you are bored, type \'bored\'");
        	System.out.println("if you are sad, type \'sad\'");
        	String userFeeling = userInput.nextLine();
        	
        		if(!userFeeling.equals("bored") && !userFeeling.equals("sad")) {
        			System.out.println("Welp. If you are fine, then carry on about your day. \ngoodbye!");
        		}
		
        	if(userFeeling.equals("bored")) {
        		 System.out.println();
                 System.out.println("Well-- I can help with that");
                 System.out.println("Today you should try doing:");

                 Random random = new Random();
                 int rand = random.nextInt(12);

                 String[] activities = {
                		 "Plant an herb garden. Help the environment, be healthy and have a cute garden! \n (tip: basil smells and tastes great)",
                		 "Buy some fake nails and glue them on and spend the day decorating them, you can never be too stylish ;)",
                		 "Bake something good! Here are some examples:\n 1) macarons (yes there is a difference between macarons and macaroons) \n 2) chocolate chip cookies, \n 3) japanese milk bread! \n have any more examples? Submit your recipes to: hellosallyprogram@gmail.com",
                		 "Rent a bike and ride around central park. weeee!",
                		 "Try to replicate some famous painting with some crayola paints",
                		 "Watch Hanse on youtube. Ahh so satisfying (>^-^)>~~~",
                		 "Get into a kpop band. Be careful because once you get sucked in, you can't come back out. See you on the darkside",
                		 "Cook some cool food! Here are some examples: \n 1) Vietnamese Pho \n 2) fries and steak with garlic sauce \n 3) the blood of your enemies! \nSubmit some more examples/recipes to: hellosallyprogram@gmail.com",
                		 "Get into some comic book series. DC? Marvel? the choice is yours. Choose wisely",
                		 "Learn to play the ukelele like any other tween superstar!",
                		 "Watch a documentary on the Vietnam war and appreciate the people that serve this country",
                		 "Watch animal planet or any other documentary about the world for that matter",
                		 "Hatch a quail from the supermarket! \nI was a skeptic too at first but then my first child Charlie the quail was born \nR.I.P Charlie June 5th, 2018 ~ August 20th, 2018",
                		 "Watch speedpaint videos on youtube and be amazed by how untalented you are (jk,you're amazeballs",
                		 "Learn a new language (pro tip: watch videos/shows in those languages)",
                		 "Write a short story. Remember show it, don't tell it",
                		 "Make a bucket list and be motivated to do them",

                		 };
                 
                 String chosenAct = activities[rand];
                 System.out.println(chosenAct);

        	}
        	
        	System.out.println();
        	System.out.println("Would you like to restart? yes or no");
        	String contAnswer = userInput.nextLine();
        		
        		while(!contAnswer.equals("yes") && !contAnswer.equals("no")) {
        			System.out.println("that's not an answer try again.");
        			contAnswer = userInput.nextLine();
        		}
        	
        		if(contAnswer.equals("no")) {
        			cont = false;
        		}
        	
        	} while(cont == true);
        	
        	System.out.println("bye bye!");

	}

}
