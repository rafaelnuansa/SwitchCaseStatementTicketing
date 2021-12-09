import java.util.Scanner;

public class ticketingStatus {
	public static void main(String[] args) {
		// Penentuan nilai dalam Status Ticket
		// Rafael Nuansa Ramadhon
		// Universitas Djuanda 
		// Disini saya menuliskan 1 contoh customer baru saja mengirimkan ticket baru / open ticket dan otomatis statusnya akan diprogress
		char status_ticket;
		Scanner input = new Scanner(System.in);

		System.out.print("Input Status Ticketing: ");
		status_ticket = input.next().charAt(0);

	    switch (status_ticket) {
	      case '1':
	        System.out.println("In Progress");
	        break;
	      case '2':
		//   Proses Answered yaitu sudah dijawab oleh pihak Staff/pengelola dari aplikasi Ticketing 
	        System.out.println("Answered");
	        break;
	      case '3':
		//   Proses dimana sudah dijawab kembali oleh customer 
	        System.out.println("Reply by Customers");
	        break;
	      case '4':
		//   Penutupan ticket bahwa ticket sudah ditutup dan troublesolving sudah complete 
	        System.out.println("Closed Ticket");
	        break;
	        default :
	        System.out.println("Tidak ada ticket");
	    }
	  }
}
