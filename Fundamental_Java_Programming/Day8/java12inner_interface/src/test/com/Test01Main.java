package test.com;

import test.com.Button.OnClickListener;

public class Test01Main { // 할당을 제외한 실행문들은 main 메서드 위에 전역변수로 올 수 없음.
						 // if, for , while, 은 항상 {} 블럭안에 넣어주어야한다.
	
	OnClickListener onClickListener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("onClick()...111");
			
		}
	};
	
	public static void main(String[] args) {
		System.out.println("Hello inner interface");

		Button btn = new Button();
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("onClick()...111");
			}
		});
		btn.touch();
		
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("onClick()...222");
			}
		});
		btn.touch();

	} // end main

} // end class
