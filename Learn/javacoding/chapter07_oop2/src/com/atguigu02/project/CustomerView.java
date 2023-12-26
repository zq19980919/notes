package com.atguigu02.project;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu02.project.CustomerView
 * @Date: 2023年12月26日 16:49
 * @Description: 主模块，负责菜单显示和处理用户操作
 */
public class CustomerView {
    CustomerList customerList = new CustomerList(10);
    public void enterMainMenu(){
        boolean isFlag = true;
        while (isFlag){
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添加客户");
            System.out.println("                   2 修改客户");
            System.out.println("                   3 删除客户");
            System.out.println("                   4 客户列表");
            System.out.println("                   5 退   出\n");
            System.out.print("                   请选择(1-5)：");
            char menuSelection = CMUtility.readMenuSelection();
            switch (menuSelection){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    /**
     * 添加客户的操作
     */
    private void addNewCustomer(){
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(15);
        System.out.print("邮箱：");
        String email = CMUtility.readString(15);

        Customer cust = new Customer(name,gender,age,phone,email);
        boolean isSuccess = customerList.addCustomer(cust);
        if (isSuccess){
            System.out.println("---------------------添加完成---------------------");
        }else {
            System.out.println("----------------记录已满，无法添加-----------------");
        }
    }
    private void modifyCustomer(){
        System.out.println("---------------------修改客户---------------------");
        int index = 0;
        Customer cust = null;
        for (; ; ) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1){
                return;
            }
            cust = customerList.getCustomer(index-1);
            if (cust == null){
                System.out.println("无法找到指定客户！");
            }else {
                break;
            }
        }

        System.out.print("姓名(" + cust.getName() + "):");
        String name = CMUtility.readString(4, cust.getName());

        System.out.print("性别("+cust.getGender() +"):");
        char gender = CMUtility.readChar(cust.getGender());

        System.out.print("年龄("+cust.getAge() +"):");
        int age = CMUtility.readInt(cust.getAge());

        System.out.print("电话("+cust.getPhone() +"):");
        String phone = CMUtility.readString(15, cust.getPhone());

        System.out.print("邮箱("+cust.getEmail() +"):");
        String email = CMUtility.readString(15, cust.getEmail());

        cust = new Customer(name,gender,age,phone,email);
        boolean isReplaced = customerList.replaceCustomer(index-1, cust);
        if (isReplaced) {
            System.out.println("---------------------修改完成---------------------");
        }else {
            System.out.println("---------------------修改失败---------------------");
        }
    }
    private void deleteCustomer(){
        System.out.println("---------------------删除客户---------------------");
        int index = 0;
        Customer cust = null;
        for (; ; ) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1){
                return;
            }
            cust = customerList.getCustomer(index-1);
            if (cust == null){
                System.out.println("无法找到指定客户！");
            }else {
                break;
            }
        }

        System.out.println("确认是否删除(Y/N)：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y'){
            boolean isDeleted = customerList.deleteCustomer(index-1);
            if (isDeleted){
                System.out.println("---------------------删除完成---------------------");
            }else {
                System.out.println("-------------无法找到指定客户，删除失败---------- ----");
            }
        }
    }
    private void listAllCustomers(){
        System.out.println("---------------------------客户列表---------------------------");
        int total = customerList.getTotal();
        if (total == 0){
            System.out.println("没有客户记录！");
        }else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
//                System.out.println((i+1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge() + "\t" + cust.getPhone() + "\t" + cust.getEmail());
                System.out.println((i+1) + "\t" + cust.getDetail());
            }
        }
    }


    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
