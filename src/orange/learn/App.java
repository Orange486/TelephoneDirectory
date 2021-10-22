package orange.learn;

import orange.learn.entry.Person;
import orange.learn.menu.Menu;
import orange.learn.menu.Operate;
import orange.learn.menu.TelNoteRegex;

import java.util.ArrayList;
import java.util.List;

/**
 * @author orange
 * @description 启动类
 */
public class App {
    /**
     * 启动电话本项目
     *
     * @param args
     */
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    /**
     * 控制主菜单
     */
    public void start() {
        Operate operate = new Operate();
        //初始化添加默认三条数据
        List<Person> list = operate.getList();
        list.addAll(generate());
        Person person = new Person();
        person.setName("");
        while (true) {
            Menu.mainMenu();
            int num = TelNoteRegex.menuItemValidate(1, 6);
            switch (num) {
                case 1:
                    operate.addLogic();
                    break;
                case 2:
                    operate.searchLogic();
                    break;
                case 3:
                    operate.modifyLogic();
                    break;
                case 4:
                    operate.deleteLogic();
                    break;
                case 5:
                    operate.orderLogic();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }
    }

    private List generate(){
        List<Person> list =new ArrayList<>(3);
        Person person = new Person();
        person.setName("zhangsan");
        person.setAddress("wuhan");
        person.setAge(24);
        person.setSex("M");
        person.setTelNum("15071232583");
        list.add(person);
        person.setId(list.size());
        Person person2 = new Person();
        person2.setName("lisi");
        person2.setAddress("wuhan");
        person2.setAge(24);
        person2.setSex("W");
        person2.setTelNum("15081232583");
        list.add(person2);
        person2.setId(list.size());
        return list;
    }

}
