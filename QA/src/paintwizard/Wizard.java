package paintwizard;
import java.util.Scanner;

    public class Wizard
{
        public static void main(String[] args)
{

        Scanner input = new Scanner( System.in );

        Items theItem = new Items();

        int number;
        String Name = "";

    System.out.print("How many items are to be put into inventory count?:  ");
    number = input.nextInt();
    input.nextLine();

    Items[]inv = new Items[number];


     for(int count = 0; count < inv.length; ++count)
            {
                    System.out.print("What is item " +(count +1) + "'s name?:  ");
                            Name = input.nextLine();
                            theItem.setName(Name);

                    System.out.print("Enter " + Name + "'s product number:  ");
                            double pNumber = input.nextDouble();
                            theItem.setpNumber(pNumber);

                    System.out.print("How many " + Name + "s are there in inventory?:  ");
                            double Units = input.nextDouble();
                            theItem.setUnits(Units);

                    System.out.print(Name + "'s cost: ");
                            double Price = input.nextDouble();
                            theItem.setPrice (Price);

                    inv[count] = new Items(Name, Price, Units, pNumber);
                    input.nextLine();

                        System.out.print("\n Product Name:     " + theItem.getName());
                        System.out.print("\n Product Number:     " + theItem.getpNumber());
                        System.out.print("\n Amount of Units in Stock:     " + theItem.getUnits());
                        System.out.print("\n Price per Unit:   " +"£" + theItem.getPrice() + "\n\n");
                        System.out.printf("\n Total cost for %s in stock: £%.2f", theItem.getName(), theItem.calculateTotalPrice());
                    System.out.printf("\n Total Cost for all items entered: £%.2f", theItem.calculateTotalPrice());    //i need to prompt for output to show total price for all items in array
            }
    }
}