import java.util.Vector;
import java.util.Scanner;

public class Lab04 {
	public static void main(String []args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner s = new Scanner(System.in);
		int i = 0, num, j, sum = 0;
		while(true){
			System.out.print("������ �Է� (0 �Է½� ����)>>");
			num = s.nextInt();
			v.add(num);
			if(v.get(i) == 0) break;
			i++;
			for(j = 0; j < v.size(); j++) {
				System.out.print(v.get(j) +  " ");
				sum += v.get(j);
			}
			System.out.println(" ");
				sum = sum/j;
			System.out.println("���� ��� " + sum);
		sum = 0;	
		}
		s.close();
		
	}
}