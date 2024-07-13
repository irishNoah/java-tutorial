class Order {
	String orderNum, ID, orderDate, orderName, orderProductNum, address;
	
	public void setOrder(String orderNum, String ID, String orderDate, String orderName, 
			String orderProductNum, String address) {
		this.orderNum = orderNum;
		this.ID = ID;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.orderProductNum = orderProductNum;
		this.address = address;
	}
	
	public void printOrder() {
		System.out.println("주문번호 : " + this.orderNum);
		System.out.println("주문자 아이디 : " + this.ID);
		System.out.println("주문 날짜 : " + this.orderDate);
		System.out.println("주문자 이름 : " + this.orderName);
		System.out.println("주문 상품 번호 : " + this.orderProductNum);
		System.out.println("배송 주소 : " + this.address);
	}
}

public class ClassInstanceEx01_240709 {
	public static void main(String[] args) {
		// Calculator
		Order order1 = new Order();
		order1.setOrder("201907210001", "abc123", "2019년 7월 21일", 
				"홍길순", "PD-345-12", "서울시 영등포구 여의도동 20번지");
		order1.printOrder();
	}
}
