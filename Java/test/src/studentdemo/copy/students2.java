package studentdemo.copy;

import java.util.Scanner;
/**
 * 
 * @author zhouyong
 *
 */
public class students2 {

	public static void main(String []args) {
		Scanner scan = new Scanner(System.in); 	
		int i=0;
		while(true){
		    System.out.println("请输入您想做的事情：1.增加 2.删除 3.修改 4.查询");
		    i=scan.nextInt();
			switch(i) {
			case 1:		 
				student s = new student();
				System.out.println("请输入学生学号");
				s.setNumber(scan.nextInt());
				System.out.println("请输入学生姓名");
				s.setName(scan.next());
				System.out.println("请输入学生年龄");
				s.setAge(scan.nextInt());
				System.out.println("请输入学生专业");
				s.setMagor(scan.next());
				System.out.println("请输入学生班级");
				s.setClasses(scan.nextInt());
				studentManage2.add(s);
				break;
			case 2:
				System.out.println("请输入要删除的学生学号");
				int x=scan.nextInt();
				studentManage2.del(x);
				break;
			case 3:						 
				student d = new student();
				System.out.println("请输入要修改学生的学号");
				d.setNumber(scan.nextInt());
				System.out.println("请输入修改学生姓名");
				d.setName(scan.next());
				System.out.println("请输入修改学生年龄");
				d.setAge(scan.nextInt());
				System.out.println("请输入修改学生专业");
				d.setMagor(scan.next());
				System.out.println("请输入修改学生班级");
				d.setClasses(scan.nextInt());
				studentManage2.update(d);
				break;
			case 4:
				studentManage2.query();
				break;
				
			}
		}
	        
		
		
		
	}
}
