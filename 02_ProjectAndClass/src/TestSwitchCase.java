/**
 * @Author：Hill
 * @Date：30/12/23 下午4:18
 */
public class TestSwitchCase {

    public void study(int x, double y ){
        x = 10;
        y = 20;
    }
    public static void main(String[] args) {
        /*
        char grade = 'B';

        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("等级是" + grade);*/

        int i = 1;
        switch (i){
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
        }
    }
}
