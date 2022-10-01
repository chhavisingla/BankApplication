package p5;
import java.util.Scanner;
import java.util.Random;
public class Application {



Account allAcc[]= new Account[3000];
int noOfAcc=0;
Scanner sc= new Scanner(System.in);
Scanner scStr= new Scanner(System.in);
public static void main(String[] args)
{
Application app= new Application();
while(true)
{
System.out.println("=====links=====");
System.out.println("0: Exit");
System.out.println("1: Submit User Details;");
System.out.println("2: Deposit the amount");
System.out.println("3:Withdrawl the amount");
System.out.println("4:Print All Details of account");
System.out.println("5:Display Contact Details");
System.out.println("6:Display KYC Details");
System.out.println("7:Print Balance");
System.out.println("8: Change Mobile Number");
System.out.println("9: Change Email Id");
System.out.println("Enter Your Choice[0-9]");
switch(app.sc.nextInt())
{
case 1:
app.submitUserDetails();
break;
case 2:
app.deposit();
break;
case 3:
app.withDraw();
break;
case 4:
app.viewAllUserDetails();
break;
case 5:
app.viewContactDetails();
break;
case 6:
app.viewKycDetails();
break;
case 7:
app.printBalance();
break;
case 8:
app.changeMobileNumber();
break;
case 9:
app.changeEmail();
break;

default:
System.out.println("Invalid Option");


}
}
}
public void submitUserDetails()
{
Random myRandom= new Random();
long accNo= myRandom.nextInt();
System.out.println("Enter User Name:");
String name= scStr.nextLine();
System.out.println("Enter Password:");
String password= scStr.nextLine();
System.out.println("Enter Initial Balance:");
int balance=sc.nextInt();
System.out.println("Enter Pan Card:");
String panNo= scStr.nextLine();
System.out.println("Enter Adhar No. :");
long aadhar= sc.nextInt();
System.out.println("Enter Document Type:");
String docType= scStr.nextLine();
System.out.println("Enter Document Number:");
String docNo =scStr.nextLine();
System.out.println("Enter House Number:");
String houseNo= scStr.nextLine();
System.out.println("Enter Locality Name:");
String locName= scStr.nextLine();
System.out.println("Enter City Name:");
String cityName= scStr.nextLine();
System.out.println("Enter State Name:");
String stateName= scStr.nextLine();
System.out.println("Enter Country Name:");
String countryName= scStr.nextLine();
System.out.println("Enter Pin Code:");
long pinCode= sc.nextInt();
System.out.println("Enter Mobile Number:");
int mobile= sc.nextInt();
System.out.println("Enter Email Id:");
long email= sc.nextInt();

ContactDetails contactDetails= new ContactDetails(houseNo,locName,cityName,stateName,countryName,pinCode,mobile,email);
KYCVerification kycVerification= new KYCVerification(panNo,aadhar,docType,docNo);
Account a= new Account(accNo,name,password,balance);

a.setKycdetails(kycVerification);
a.setContactDetails(contactDetails);
allAcc[noOfAcc++]=a;
System.out.println(""+a);
System.out.println("Added in the List!");

}
public void deposit()
{
System.out.println("Enter The Amount to Deposit:");
int amt=sc.nextInt();
System.out.println("Enter the Account Number in which you want to Deposit:");
int seachAccNumber= sc.nextInt();
for (int i=0;i<noOfAcc;i++)
{
Account a= allAcc[i];
boolean isFound= (a.getAccountNumber()== seachAccNumber);
if(isFound)
{
a.setBalance(a.getBalance()+amt);
System.out.println("Deposit Done");
System.out.println(a.getAccountNumber()+"-" +a.getBalance());

}
}
}
public void withDraw()
{
System.out.println("Enter The Amount to withdraw:");
int amt=sc.nextInt();
System.out.println("Enter the Account Number in which you want to Deposit:");
int seachAccNumber= sc.nextInt();
for (int i=0;i<noOfAcc;i++)
{
Account a= allAcc[i];
boolean isFound= (a.getAccountNumber()== seachAccNumber);
if(isFound)
{
a.setBalance(a.getBalance()-amt);
System.out.println("Deposit Done");
System.out.println(a.getAccountNumber()+"-" +a.getBalance());

}
}
}
public Account getAccount(long searchAccno)
{
for(int i=0;i<noOfAcc;i++)
{
Account a= allAcc[i];
boolean isFound= (a.getAccountNumber()== searchAccno);
if(isFound)
{
return a;
}
}
return null;
}
public void viewAllUserDetails()
{
System.out.println("Enter The account Number:");
long searchAccno= sc.nextInt();
Account a= getAccount(searchAccno);
System.out.println(a);
}
public void viewContactDetails()
{
System.out.println("Enter The account Number:");
long searchAccno= sc.nextInt();
Account a= getAccount(searchAccno);
System.out.println(a.getContactDetails());
}

public void viewKycDetails()
{
System.out.println("Enter The account Number:");
long searchAccno= sc.nextInt();
Account a= getAccount(searchAccno);
System.out.println(a.getKycdetails());
}

public void printBalance()
{
System.out.println("Enter The account Number:");
long searchAccno= sc.nextInt();
Account a= getAccount(searchAccno);
System.out.println(a.getBalance());
}

public void changeMobileNumber()
{
System.out.println("Enter The account Number:");
long searchAccNo= sc.nextInt();

Account a= getAccount(searchAccNo);
long previousMobileNo= a.getContactDetails().getMobileNumber();
System.out.println(previousMobileNo);
System.out.println("Enter New Mobile Number:");
long mobno=sc.nextInt();
a.getContactDetails().setMobileNumber(mobno);
System.out.println("Mobile Number is "+a.getContactDetails().getMobileNumber());
}
public void changeEmail()
{
System.out.println("Enter The account Number:");
long searchAccNo= sc.nextInt();

Account a= getAccount(searchAccNo);
long previousEmail= a.getContactDetails().getEmailId();
System.out.println(previousEmail);
System.out.println("Enter New Email Id:");
long email=sc.nextInt();
a.getContactDetails().setEmailId(email);
System.out.println("Email is "+a.getContactDetails().getEmailId());
}



}
