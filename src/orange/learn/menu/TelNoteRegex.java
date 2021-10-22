package orange.learn.menu;

import java.util.Scanner;

/**
 * @author orange
 * @description 数据校验类
 */
public class TelNoteRegex {

    private TelNoteRegex() {
    }

    /**
     * 对菜单输入选项的验证
     *
     * @param min
     * @param max
     * @return
     */
    public static int menuItemValidate(int min, int max) {
        String regex = "[" + min + "-" + max + "]";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字选项" + min + "-" + max);
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return Integer.parseInt(input);
            } else {
                System.out.println("请输入数字。范围在" + min + "-" + max);
            }
        }
    }

    /**
     * 对菜单输入选项的验证
     *
     * @param min
     * @param max
     * @return
     */
    public static int idValidate(int min, int max) {
        String regex = "[" + min + "-" + max + "]";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id" + min + "-" + max);
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return Integer.parseInt(input);
            } else {
                System.out.println("请输入数字。范围在" + min + "-" + max);
            }
        }
    }
    /**
     * 对用户输入姓名的验证
     * 1-10位字母。大小写都行
     */
    public static String nameValidate() {
        //1-10位字母。大小写都行
        String regex = "[a-zA-Z]{1,10}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("姓名是1-10位字母，大小写都行");
            }
        }
    }

    /**
     * 对用户输入年龄的验证
     * 年龄10-99
     */
    public static int ageValidate() {
        //年龄10-99
        String regex = "[1-9][0-9]";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return Integer.parseInt(input);
            } else {
                System.out.println("请输入正确的年龄，10-99");
            }
        }
    }

    /**
     * 对用户输入的性别验证
     * 男 M或m ，女 F或f
     *
     * @return
     */
    public static String sexValidate() {
        String regex = "[M|m|F|f]";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入性别。f代表男，m代表女");
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input.toUpperCase();
            } else {
                System.out.println("请输入正确的性别，m或f");
            }
        }
    }

    /**
     * 对用户输入电话号码的验证
     */
    public static String telNumValidate() {
        String regex = "(\\d{3,4}-\\d{7,8})|([1]\\d{10})";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入电话号码");
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("请输入正确的电话号码");
            }
        }
    }

    /**
     * 对用户输入地址的验证
     * 字母或数字1-50
     */
    public static String addressValidate() {
        String regex = "\\w{1,50}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入地址");
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("请输入正确的地址数字或字母1-50");
            }
        }
    }


}
