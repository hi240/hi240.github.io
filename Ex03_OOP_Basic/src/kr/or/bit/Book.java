package kr.or.bit;

/*
public class Book {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 	
	TestBook publish = new TestBook("����¯",2000);            //å����.
    publish.BookInfo(); //�ҷ�����
    System.out.println(publish.getName());
    System.out.println(publish.getPrice());
	}
}
 class TestBook {
	    private String bname;
	    private int bprice;
	    public TestBook(String name,int price) {  //å ���ǵǸ� �̸��� ������ ������ ������ �ִ�.
	    	bname=name;
	    	bprice=price;
	        System.out.println("å�� ���ǵǾ����ϴ�.");
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
		System.out.println("å�� ���ǵǾ����ϴ�");
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