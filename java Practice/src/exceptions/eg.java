package exceptions;

class eg {
	private int no;
	
	eg(int no)
	{
		this.no=no;
	}
	
	private int getNo() {
		return no;
	}

	private void setNo(int no) {
		this.no = no;
	}

	public eg() {


	}
	public void  show(int no)
	{
		System.out.println("ur no is..."+ no);
		
	}

}
