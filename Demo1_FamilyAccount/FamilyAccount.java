public class FamilyAccount {
    public static void main(String[] args) {
        String detail = "";
        int balance = 10000;
        label: for (;;) {
            System.out.println("-----------------家庭收支记账软件-----------------");
            System.out.println("                  1 收支明细");
            System.out.println("                  2 登记收入");
            System.out.println("                  3 登记支出");
            System.out.println("                  4 退   出");
            System.out.print("                  请选择(1-4):");
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println("收支\t账户金额\t收支金额\t说 明");
                    System.out.println(detail);
                    System.out.println("--------------------------------------------------");
                    System.out.println();
                    break;
                case '2':
                    System.out.print("本次收入金额:");
                    int input = Utility.readNumber();
                    System.out.print("本次收入说明:");
                    String inputInfo = Utility.readString();
                    System.out.println("系统提示：登记成功！");
                    balance += input;
                    detail += ("收入\t" + balance + "\t\t" + input + "\t\t" + inputInfo + "\n");
                    break;
                case '3':
                    System.out.print("本次支出金额:");
                    int output = Utility.readNumber();
                    System.out.print("本次支出说明:");
                    String outputInfo = Utility.readString();
                    System.out.println("系统提示：登记成功！");
                    balance -= output;
                    detail += ("支出\t" + balance + "\t\t" + output + "\t\t" + outputInfo + "\n");
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N):");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        break label;
                    }
            }
        }
    }
}
