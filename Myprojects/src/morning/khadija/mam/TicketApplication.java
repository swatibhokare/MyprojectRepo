package morning.khadija.mam;

import java.util.Scanner;

public class TicketApplication {

	public static void main(String[] args) {

		Ticket ticket = new Ticket();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the ticketid:");
		ticket.setTicketid(scanner.nextInt());

		System.out.println("Enter no of bookings:");
		ticket.setNooftickets(scanner.nextInt());

		System.out.println("Enter the available tickets:");
		Ticket.setAvailableTickets(scanner.nextInt());

		System.out.println("Enter the price:");
		ticket.setPrice(scanner.nextInt());

		System.out.println("Enter the no of tickets:");
		ticket.setNooftickets(scanner.nextInt());

		System.out.println("Available ticktes :" + Ticket.getAvailableTickets());
		System.out.println("Total amount :" + ticket.calculateTicketCost(ticket.getNooftickets()));
		System.out.println("Available ticket after booking :"
				+ ticket.getNoOfAvailbleTickets(Ticket.getAvailableTickets(), ticket.getNooftickets()));

		scanner.close();
	}

}
