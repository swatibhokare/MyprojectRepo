package morning.khadija.mam;

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;
	private int nooftickets;

	public int getNooftickets() {
		return nooftickets;
	}

	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		if (availableTickets > 0) {
			Ticket.availableTickets = availableTickets;
		}
	}
	
	public int getNoOfAvailbleTickets(int availableTickets,int noofticktes){
		return availableTickets-noofticktes;
	}
	

	public int calculateTicketCost(int nooftickets) {

		if (availableTickets >= nooftickets) {
			return nooftickets * price;
		} else {
			return -1;
		}

	}

}
