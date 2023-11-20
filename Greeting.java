package package1;
import java.util.*;

public class Greeting {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		PriorityQueue <String> nicknames = new PriorityQueue <>();
		
		
			int indi1 = 1;
			System.out.println("Enter number inputs: ");
			int inp = scn.nextInt();
			System.out.println("Enter " + inp + " names: ");
			
			while(true) {
				nicknames.offer(scn.next());
				if(inp == indi1) {
					System.out.println(nicknames);
					break;
				}
				indi1++;
			}
			System.out.println("Press H to say Hi to each them. ");
			while(true) {
				String greet = scn.nextLine();
			    if(greet.equalsIgnoreCase("H")) {
					System.out.println("Hi " + nicknames.poll());
					if(nicknames.isEmpty()) {
						System.out.println("Done saying hi.");
						
						System.out.println("Press the letter of your firstname to continue, kindly use second letter if it's X or x to end the program. ");
						String key = scn.nextLine();
					
						if(key.equalsIgnoreCase("X")) {
							System.out.println("Program Exit");
							break;
						}
						else if(!key.equalsIgnoreCase("X")){
							int indi2 = 1;
							System.out.println("Enter number inputs: ");
							int inp2 = scn.nextInt();
							System.out.println("Enter " + inp + " names: ");
							
							while(true) {
								nicknames.offer(scn.next());
								if(inp2 == indi2) {
									System.out.println(nicknames);
									System.out.println("Press H to say Hi to each them. ");
									break;
								}
								indi2++;
							}
						}
					}
				}
				else if(!greet.equalsIgnoreCase("H")){
					continue;
				}
			
			}
			
			
			
		}
	}

