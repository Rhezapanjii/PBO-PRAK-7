package kasus3;

public class weeklySales {
	public static void main(String[] args)
	{
		 Salesperson [] salesStaff = new Salesperson [4];
		 salesStaff[0] = new Salesperson ("Rheza", "Panji", 3000);
		 salesStaff[1] = new Salesperson ("Annisa", "Salsa", 4000);
		 salesStaff[2] = new Salesperson ("Koli", "Nuwo", 3000);
		 salesStaff[3] = new Salesperson ("Narma", "Dana", 2800);
		 Sorting.selectionSort(salesStaff);
		 System.out.println("\nRanking of Sales for the week\n");
		 for(Salesperson s : salesStaff)
		 System.out.println(s);
	}
}