package com.lyic.inheima.String.ATMSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {

        //创建账户集合
        ArrayList<Account> account = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("====================ATM系统==================");
            System.out.println("1.账户登录");
            System.out.println("2.账户注册");
            System.out.println("请输入选择操作：");
            int command = input.nextInt();

            switch (command) {
                case 1:
                    login(account, input);
                    break;
                case 2:
                    register(account,input);
                    break;
                default:
                    System.out.println("您所执行的操作有无，请检查！");
            }
        }
    }

    /**
     * 登陆界面
     * @param account
     * @param input
     */
    private static void login(ArrayList<Account> account, Scanner input) {

        System.out.println("====================登录系统==================");
        //先判断账户合集里面是否有账户
        if(account.size() == 0){
            System.out.println("对不起，无任何账户，请先创建账户");
            return;
        }

        while(true) {
            System.out.println("请输入账户号：");
            String idCard = input.next();
            Account acc = compare(idCard, account);
            if (acc != null) {
                while(true) {
                    System.out.println("请输入密码：");
                    String passWord = input.next();
                    if (acc.getPassWord().equals(passWord)) {
                        System.out.println("恭喜您：" + acc.getUserName() + ",登陆成功！卡号为：" + acc.getCardId());
                        showUserAccount(acc, input, account);
                        return;
                    } else
                        System.out.println("对不起，您所输入的密码不正确！请重新输入");
                }
            } else
                System.out.println("对不起，您所输入的卡号不存在！请重新输入");
        }
    }

    /**
     * 用户操作界面
     * @param acc
     * @param input
     */
    private static void showUserAccount(Account acc, Scanner input, ArrayList<Account> account) {
        while(true) {
            System.out.println("====================用户操作页面==================");
            System.out.println("1.查询账户信息                           2.存款");
            System.out.println("3.取款                                 4.转账");
            System.out.println("5.修改密码                              6.注销账户");
            System.out.println("7.退出");
            System.out.println("请选择您要进行的操作：");
            int command = input.nextInt();
            switch (command) {
                case 1:
                    showAccount(acc);
                    break;
                case 2:
                    depositMoney(acc, input);
                    break;
                case 3:
                    drawMoney(acc, input);
                    break;
                case 4:
                    transferMoney(account, acc, input);
                    break;
                case 5:
                    updataPassWord(acc, input);
                    return;
                case 6:
                    deletAccount(account, acc, input);
                    return;
                case 7:
                    System.out.println("退出成功！");
                    return; //结束当前方法
            }
        }
    }

    /**
     * 注销账户
     * @param account
     * @param acc
     * @param input
     */
    private static void deletAccount(ArrayList<Account> account, Account acc, Scanner input) {
        System.out.println("====================账户注销界面==================");
        System.out.println("您真的要注销账户吗？ （y/n）");
        String answer = input.next();
        switch (answer){
            case "y":
                if(acc.getMoney() > 0){
                    System.out.println("您的账户中还有钱，不能注销！");
                }else{
                    account.remove(acc);
                    System.out.println("您的账户已注销！");
                }
                break;
            default:
                System.out.println("好的，当前账户保留！");
                break;
        }
    }

    /**
     * 修改密码
     * @param acc
     * @param input
     */
    private static void updataPassWord(Account acc, Scanner input) {
        System.out.println("====================修改密码界面==================");
        while (true) {
            System.out.println("请输入您的密码：");
            String passWord = input.next();
            if(passWord.equals(acc.getPassWord())){
                while (true) {
                    System.out.println("请输入你的新密码：");
                    String newPassWord = input.next();
                    System.out.println("请确认您的新密码：");
                    String secondPassWoed = input.next();

                    if(secondPassWoed.equals(newPassWord)){
                        acc.setPassWord(secondPassWoed);
                        System.out.println("恭喜您，修改密码成功");
                        return;
                    }else{
                        System.out.println("请所输入的两次密码不正确！请重新输入：");
                    }
                }

            }else{
                System.out.println("对不起，您的密码不正确！不能进行修改，请重新输入");
            }
        }
    }

    /**
     * 转账
     * @param account
     * @param acc
     * @param input
     */
    private static void transferMoney(ArrayList<Account> account, Account acc, Scanner input) {
        System.out.println("====================取款系统==================");
        if(account.size() < 2) {
            System.out.println("对不起，所有账户不足2个，快去开账户吧！");
            return;
        }

        while(true) {
            System.out.println("请输入对方卡号：");
            String idCard = input.next();
            //判断是否为自己的卡号
            if(idCard.equals(acc.getCardId())){
                System.out.println("对不起，您不可以给自己进行转账！");
                continue;
            }
            //判断对方卡号
            Account object = compare(idCard, account);
            if (object == null) {
                System.out.println("对不起，您所输入的卡号不存在！请重新输入：");
            }else{
                //进一步认证：进行姓氏认证
                String userName = object.getUserName();
                String tip = "*"+userName.substring(1);
                System.out.println("请输入 ["+tip+"] 的姓氏");
                String preName = input.next();
                //验证姓氏
                if(userName.startsWith(preName)){
                    while(true) {
                        System.out.println("请输入您的转帐金额：");
                        Double money = input.nextDouble();
                        if (money > acc.getMoney()) {
                            System.out.println("对不起，您的账户余额不足以转账这么多钱，您的账户还有" + acc.getMoney());
                        } else {
                            acc.setMoney(acc.getMoney()-money);
                            object.setMoney(object.getMoney()+money);
                            System.out.println("恭喜您，转账成功！您所生余额："+acc.getMoney());
                            return;
                        }
                    }
                }else{
                    System.out.println("对不起，您所输入的信息有误！");
                }
            }
        }

    }

    /**
     * 取钱
     * @param acc
     * @param input
     */
    private static void drawMoney(Account acc, Scanner input) {
        System.out.println("====================取款系统==================");

        while(true) {
            System.out.println("请输入您所要取款的金额：");
            Double money = input.nextDouble();
            if (money > acc.getQutomoney()) {
                System.out.println("对不起，您所取出的金额超出了您的限额！您的限额为：" + acc.getQutomoney());
            } else if(money > acc.getMoney()){
                System.out.println("对不起，您所取出的金额超过了您的余额！您的余额是："+acc.getMoney());
            }else{
                System.out.println("恭喜您，您取款成功！");
                acc.setMoney(acc.getMoney()-money);
                showAccount(acc);
                return;
            }
        }
    }

    /**
     * 存钱
     * @param acc
     * @param input
     */
    private static void depositMoney(Account acc, Scanner input) {
        System.out.println("====================存款系统==================");
        System.out.println("请输入您的存款金额：");
        Double money = input.nextDouble();
        acc.setMoney(acc.getMoney()+money);
        System.out.println("恭喜您，存款成功！");
        showAccount(acc);
    }

    /**
     * 账户信息显示
     * @param acc
     */
    private static void showAccount(Account acc) {
        System.out.println("您的账户信息如下：");
        System.out.println("户主："+acc.getUserName());
        System.out.println("卡号："+acc.getCardId());
        System.out.println("余额："+acc.getMoney());
        System.out.println("限额："+acc.getQutomoney());
    }

    /**
     * 注册系统
     * @param account
     * @param input
     */
    private static void register(ArrayList<Account> account, Scanner input) {

        System.out.println("====================注册系统==================");
        Account user = new Account();
        System.out.println("请输入账户名：");
        String userName = input.next();
        user.setUserName(userName);

        while(true) {
            System.out.println("请输入账户密码：");
            String passWord = input.next();
            System.out.println("请确认账户密码：");
            String secondPassWord = input.next();

            if (secondPassWord.equals(passWord)) {
                user.setPassWord(secondPassWord);
                System.out.println("密码录入成功！");
                break;
            } else {
                System.out.println("您输入的两次密码不一致！请重新输入！");
            }
        }

        System.out.println("请输入账户限制额度：");
        int qutomoney = input.nextInt();
        user.setQutomoney(qutomoney);

        //生成一个卡号（需要进行检查：看是否生成的卡号与之前的卡号重复）
        String idCard = getRandomCard(account);
        user.setCardId(idCard);

        //把这个账户加入账户合集
        account.add(user);
        System.out.println("恭喜您："+userName+",您开户成功，您的卡号为："+idCard);

    }

    /**
     * 生成卡号
     * @param account
     * @return
     */

    private static String getRandomCard(ArrayList<Account> account) {
        //生成卡号
        while(true) {
            String idCard = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                idCard += r.nextInt(10);
            }

            //判断卡号是否已经之前生成过
            Account flag = compare(idCard, account);
            if (flag == null) {
                return idCard;
            }
        }
    }

    /**
     * 检查是否生成的卡号重复
     * @param idCard
     * @param account
     * @return
     */
    private static Account compare(String idCard, ArrayList<Account> account) {
        for(int i = 0; i < account.size(); i++){
            Account acc = account.get(i);
            if(idCard.equals(acc.getCardId()))
                return acc;
        } return null;
    }

}
