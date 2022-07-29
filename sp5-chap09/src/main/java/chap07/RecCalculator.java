package chap07;

public class RecCalculator implements Calculator {

	@Override
	public long factorial(long num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
	}

}
//		long start = System.currentTimeMillis();
//		try {
//			if(num == 0) {
//				return 1;
//			}else {
//				return num * factorial(num - 1);
//			}
//		}finally{
//			long end = System.currentTimeMillis();
//			System.out.printf("RecCalculaotr.factorial(%d) 실행 시간 = %d\n",
//					num, (end-start));
//		}
//		
//	}
//	ImpeCalculator impeCal = new ImpeCalculator();
//	long start1 = System.currentTimeMillis();
//	long fourFactorial1 = impeCal.factorial(4);
//	long end1 = System.currentTimeMillis();
//	System.out.printf("ImpeCalculator.factorial(4)실행 시간 = %d\n",
//			(end1-start1));
	
//	RecCalculator recCal = new RecCalculator();
//	long start2 = System.currentTimeMillis();
//	long fourFactorial1 = recCal.factorial(4);
//	long end2 = System.currentTimeMillis();
//	System.out.printf("ImpeCalculator.factorial(4)실행 시간 = %d\n",
//			(end2-start2));
	
// 실행시간을 밀리초 단위가 아니라 나노초 단위로 구해야한다면 양쪽 다 바꿔야한다. 기존코드를 수정하지 않고도 바꿀수 있는 방법이 있는데 이때 출연하는것이 프록시 객체라고 한다.

