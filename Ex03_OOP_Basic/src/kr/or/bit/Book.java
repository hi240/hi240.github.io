package kr.or.bit;

/*
public class Book {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 	
	TestBook publish = new TestBook("서영짱",2000);            //책출판.
    publish.BookInfo(); //불러오깅
    System.out.println(publish.getName());
    System.out.println(publish.getPrice());
	}
}
 class TestBook {
	    private String bname;
	    private int bprice;
	    public TestBook(String name,int price) {  //책 출판되면 이름과 가격을 무조건 가지고 있다.
	    	bname=name;
	    	bprice=price;
	        System.out.println("책이 출판되었습니다.");
	    }
	    public void BookInfo() {
	    	System.out.println(bname+bprice);
	    }
	    //getter setter{
	 
		public String getName() { 
			return bname;
		}
		public int getPrice() {
			return bprice;
		}		
}
	  */  
 
public class Book {
	public static void main(String[] args) {
		Ex17_Book b= new Ex17_Book("240",240);
	b.BookInfo();
		
	}
	
}
class Ex17_Book {
private int bprice;

	private String bname;
	
	public Ex17_Book(String bname,int bprice){
	this.bname=bname;
	this.bprice=bprice;
		System.out.println("책이 출판되었습니다");
	}
		public int getBprice() {
		return bprice;
	}
		public String getBname() {
		return bname;
	}

	public void BookInfo(){
		System.out.println(bname+bprice);
	}
}