package orange.learn.menu;

import orange.learn.entry.Person;

import javax.management.OperationsException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author orange
 * @description 核心业务类
 */
public class Operate {

    private List<Person> list;

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    public Operate() {
        this.list = new ArrayList<>();
    }

    /**
     * 用户添加记录业务逻辑控制
     */
    public void addLogic() {
        while (true) {
            Menu.addMenu();
            int num = TelNoteRegex.menuItemValidate(1, 3);
            switch (num) {
                case 1:
                    addOperation();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    return;
                default:
                    break;

            }
        }
    }

    /**
     * 用户查询记录业务逻辑控制
     */
    public void searchLogic() {
        while (true) {
            Menu.searchMenu();
            int num = TelNoteRegex.menuItemValidate(1, 7);
            switch (num) {
                case 1:
                    searchByName();
                    break;
                case 2:
                    searchByAge();
                    break;
                case 3:
                    searchBySex();
                    break;
                case 4:
                    searchByTelNum();
                    break;
                case 5:
                    searchByAddress();
                    break;
                case 6:
                    showAll();
                    break;
                case 7:
                    return;
                default:
                    break;

            }
        }
    }

    /**
     * 修改记录业务逻辑控制
     */
    public void modifyLogic() {
        while (true) {
            Menu.modifyMenu();
            int num = TelNoteRegex.menuItemValidate(1, 3);
            switch (num) {
                case 1:
                    showAll();
                    break;
                case 2:
                    modifyOperation();
                    break;
                case 3:
                    return;
                default:
                    break;

            }
        }
    }

    /**
     * 删除记录业务逻辑控制
     */
    public void deleteLogic() {
        while (true) {
            Menu.deleteMenu();
            int num = TelNoteRegex.menuItemValidate(1, 4);
            switch (num) {
                case 1:
                    showAll();
                    break;
                case 2:
                    deleteOperation();
                    break;
                case 3:
                    deleteAllOperation();
                    break;
                case 4:
                    return;
                default:
                    break;

            }
        }
    }

    /**
     * 排序记录业务逻辑控制
     */
    public void orderLogic() {
        while (true) {
            Menu.orderMenu();
            int num = TelNoteRegex.menuItemValidate(1, 5);
            System.out.println("*************************");
            System.out.println("**      1.按姓名排序      **");
            System.out.println("**      2.按年龄排序      **");
            System.out.println("**      3.按性别排序      **");
            System.out.println("**      4.查看全部记录      **");
            System.out.println("**      5.返回上一级      **");
            System.out.println("*************************");
            switch (num) {
                case 1:
                    orderByName();
                    break;
                case 2:
                    orderByAge();
                    break;
                case 3:
                    orderSex();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    return;
                default:
                    break;

            }
        }
    }

    /**
     * 添加新记录信息
     */
    public void addOperation() {
        String name = TelNoteRegex.nameValidate();
        String address = TelNoteRegex.addressValidate();
        int age = TelNoteRegex.ageValidate();
        String sex = TelNoteRegex.sexValidate();
        String telNum = TelNoteRegex.telNumValidate();
        Person person = new Person();
        person.setName(name);
        person.setAddress(address);
        person.setAge(age);
        person.setTelNum(telNum);
        person.setSex(sex);
        list.add(person);
        person.setId(list.size());

    }

    /**
     * 查询全部记录
     */
    public void showAll() {
        System.out.println("********************************");
        for (Person person : list) {
            System.out.println(person);
        }
        if (list.size() == 0) {
            System.out.println("暂无记录");
        }
        System.out.println("********************************");
    }

    /**
     * 按姓名查询记录
     */
    public void searchByName() {
        System.out.println("********************************");
        boolean flag = false;
        String name = TelNoteRegex.nameValidate();
        for (Person person : list) {
            if (person.getName().equals(name)) {
                System.out.println(person);
                flag = true;
            }
        }
        if (flag) {
            System.out.println("查无此人");
        }
        System.out.println("********************************");
    }

    /**
     * 按年龄查询
     */
    public void searchByAge() {
        System.out.println("********************************");
        boolean flag = true;
        int age = TelNoteRegex.ageValidate();
        for (Person person : list) {
            if (person.getAge() == age) {
                System.out.println(person);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("查无此人");
        }
        System.out.println("********************************");
    }

    /**
     * 按性别查询
     */
    public void searchBySex() {
        System.out.println("********************************");
        boolean flag = true;
        String sex = TelNoteRegex.sexValidate();
        for (Person person : list) {
            if (person.getSex().equals(sex)) {
                System.out.println(person);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("查无此人");
        }
        System.out.println("********************************");
    }

    /**
     * 按电话号码查询
     */
    public void searchByTelNum() {
        System.out.println("********************************");
        boolean flag = true;
        String telNum = TelNoteRegex.telNumValidate();
        for (Person person : list) {
            if (person.getTelNum().equals(telNum)) {
                System.out.println(person);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("查无此人");
        }
        System.out.println("********************************");
    }

    /**
     * 按地址查询记录
     */
    public void searchByAddress() {
        System.out.println("********************************");
        boolean flag = true;
        String address = TelNoteRegex.addressValidate();
        for (Person person : list) {
            if (person.getAddress().equals(address)) {
                System.out.println(person);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("查无此人");
        }
        System.out.println("********************************");
    }

    /**
     * 修改指定记录
     */
    public void modifyOperation() {
        if (list.isEmpty()) {
            System.out.println("记录为空");
        } else {
            //待改进
            int i = TelNoteRegex.idValidate(1, 999999);
            Person person= null;
            for (Person person1 : list) {
                if(person1.getId()==i){
                    person=person1;
                }
            }
            while (true) {
                Menu.subModifyMenu();
                int num = TelNoteRegex.menuItemValidate(1, 7);
                switch (num) {
                    case 1:
                        modifyName(person);
                        break;
                    case 2:
                        modifyAge(person);
                        break;
                    case 3:
                        modifySex(person);
                        break;
                    case 4:
                        modifyTelNum(person);
                        break;
                    case 5:
                        modifyAddress(person);
                        break;
                    case 6:
                        return;
                    default:
                        break;

                }
            }
        }
    }

    /**
     * 删除指定记录
     */
    public void deleteOperation() {
        if (list.isEmpty()) {
            System.out.println("记录为空");
        } else {
            //待改进
            int i = TelNoteRegex.idValidate(1, 999999);
            for (Person person1 : list) {
                if(person1.getId()==i){
                    list.remove(person1);
                }
            }
        }
    }

    public void deleteAllOperation(){
        if (list.isEmpty()) {
            System.out.println("记录为空");
        } else {
            list.clear();
        }
    }
    /**
     * 按用户姓名排序
     */
    public void orderByName() {
        Collections.sort(list,new OrderName());
        System.out.println("******************************");
        for (Person person : list) {
            System.out.println(person);
        }
        System.out.println("******************************");
    }

    /**
     * 按用户年龄排序
     */
    public void orderByAge() {
        Collections.sort(list,new OrderAge());
        System.out.println("******************************");
        for (Person person : list) {
            System.out.println(person);
        }
        System.out.println("******************************");
    }

    /**
     * 按用户性别排序
     */
    public void orderSex() {
        Collections.sort(list,new OrderSex());
        System.out.println("******************************");
        for (Person person : list) {
            System.out.println(person);
        }
        System.out.println("******************************");
    }

    /**
     * 修改用户名字
     *
     * @param person
     */
    public void modifyName(Person person) {
        String name = TelNoteRegex.nameValidate();
        person.setName(name);
    }

    /**
     * 修改年龄
     *
     * @param person
     */
    public void modifyAge(Person person) {
        int age = TelNoteRegex.ageValidate();
        person.setAge(age);
    }

    /**
     * 修改性别
     *
     * @param person
     */
    public void modifySex(Person person) {
        String sex = TelNoteRegex.sexValidate();
        person.setSex(sex);
    }

    /**
     * 修改电话号码
     */
    public void modifyTelNum(Person person) {
        String telNum = TelNoteRegex.telNumValidate();
        person.setTelNum(telNum);
    }

    /**
     * 修改地址
     *
     * @param person
     */
    public void modifyAddress(Person person) {
        String address = TelNoteRegex.addressValidate();
        person.setAddress(address);
    }

    class OrderName implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    class OrderAge implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge()-o2.getAge();
        }
    }
    class OrderSex implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getSex().compareTo(o2.getSex());
        }
    }
}
