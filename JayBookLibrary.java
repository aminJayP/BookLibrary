import java.util.Scanner;
public class JayBookLibrary {
    public static void main(String[] args){
        int userChoice = 1, bookCounter = 0;
        String title = "";
        Book[] library = new Book[10];
        Scanner scan = new Scanner(System.in);
        Boolean test = false;

        do{
            System.out.println("Enter 1 if you want to add a book, Enter 2 if you want to remove a book, and Enter 3 if you want to change book's information, Enter 0 to terminate: ");
            userChoice = Integer.parseInt(scan.nextLine());

            if(userChoice == 1){

                if(bookCounter == 10){
                    System.err.println("The library is full ");

                }
                else{
                    System.out.println("Enter the title of book: ");
                    title = scan.nextLine();
                    test = false;
                    for (int i = 0; i < library.length; i++)
                    {
                        if (library[i] != null)
                        {
                            if(library[i].getTitle().equals(title)) {
                                test = true;
                                break;
                            }
                        }
                    }
                    }
                    if(!test){
                        System.out.println("Enter the number of pages: ");
                        int numberOfPages = Integer.parseInt(scan.nextLine());
                        Book obj = new Book(numberOfPages, title);
                        for (int i = 0; i < library.length; i++)
                        {
                            if (library[i] == null)
                            {
                                library[i] = obj;
                                System.out.println("Book has been added");
                                bookCounter+=1;
                                for(int j=0; j<library.length; j++){
                                    if(library[j]!=(null))
                                    System.out.println(library[j]);
                                }
                                break;
                            }

                        }
                    }
                    else
                    {
                        System.err.println("No Duplicates book titles are allowed.");
                    }


                }
            else if(userChoice==2) {
                test = false;
                if (bookCounter == 0) {
                    System.err.println("The library is empty.");

                }
                else {
                    System.out.println("Enter a book title that you want to remove: ");
                    title = scan.nextLine();
                    for (int i = 0; i<bookCounter;i++)
                    {
                        if (library[i].getTitle().equals(title)) {
                            test = true;
                            library[i] = null;
                            bookCounter--;
                            System.out.println("Book has been removed");
                            for(int j=0; j<library.length; j++){
                                if(library[j]!=(null))
                                    System.out.println(library[j]);
                            }
                            break;
                        }
                    }

                    if (!test) {
                        System.err.println("Book does not exist");
                    }
                }

            }
            else if(userChoice==3){
                test = false;
                if (bookCounter == 0) {
                    System.err.println("The library is empty.");
                }
                else {
                    System.out.println("Enter a book title that you want to change the book's information of: ");
                    title = scan.nextLine();
                    for(int i=0; i<bookCounter; i++){
                        if(library[i].getTitle().equals(title)){
                            test = true;
                            System.out.println("Enter a new book title: ");
                            String t2 = scan.nextLine();
                            System.out.println("Enter the page numbers of the new title: ");
                            int number = Integer.parseInt(scan.nextLine());
                            Book obj2 = new Book(number, t2);
                            library[i] = obj2;
                            System.out.println("The book information has been changed. ");
                            for(int k=0; k<library.length; k++){
                                if(library[k]!=(null))
                                        System.out.println(library[k]);
                            }
                        }
                    }
                    if(!test){
                        System.err.println("Book does not exist");
                    }

                }
                
            }


            }while(userChoice != 0);



    }

}




