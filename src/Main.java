import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("type a random name for a funny story");
		String name = in.nextLine();
		System.out.println("now give him an object");
		String object = in.nextLine();
		System.out.println("how's the weather do you want it to be?");
		String weather = in.nextLine();
		System.out.println("Type random number before current: ");
		double year = in.nextDouble();
		System.out.println("give him an opponent name ");
		in.nextLine();
		String opponent = in.nextLine();
		System.out.println("Choose what happen to "+name+" in the end");
		String happen = in.nextLine();
		System.out.println("At the year "+year+" there is a legend named "+name+" about to attack "+opponent+" using ultimate "+object+" in the "+weather+" weather. What happened after remain secret, but some myth said that it ended up "+happen+"");

	}

}
