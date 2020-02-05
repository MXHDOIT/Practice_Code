import java.util.Scanner;

public class HashTableDemo {
    public static void main(String[] args) {
        //创建菜单
        HashTab hashTab = new HashTab(7);

        //写一个菜单
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("add:添加雇员");
            System.out.println("list:显示雇员");
            System.out.println("find:查找雇员");
            System.out.println("exit:退出系统");

            key = scanner.next();
            switch (key){
                case "add":
                    System.out.println("输入id");
                    int id = scanner.nextInt();
                    System.out.println("输入名字");
                    String name = scanner.next();
                    //创建雇员
                    Emp emp = new Emp(id,name);
                    hashTab.add(emp);
                case "list":
                    hashTab.list();
                case "find":
                    System.out.println("请输入id");
                    hashTab.findEmpById(scanner.nextInt());
                    default:
                        break;
            }
        }
    }
}

//创建hash表
class HashTab{
    private EmpLinkedList[] empLinkedLists;
    private int size;
    public HashTab(int size){
        this.size =size;
        empLinkedLists = new EmpLinkedList[size];

        for(int i = 0;i < empLinkedLists.length;i++){
            empLinkedLists[i] = new EmpLinkedList();
        }
    }

    //添加雇员·
    public void add(Emp emp){
        //根据员工id,得到位置
        int empLinkedListNO = hashFun(emp.id);
        //加入到对应链表
        empLinkedLists[empLinkedListNO].add(emp);
    }

    //遍历所有的链表
    public void list(){
        for(int i = 0;i < size;i++){
            empLinkedLists[i].list(i);
        }
    }
    
    //输入id查雇员
    public void findEmpById(int id){
        int empLinkedListNo = hashFun(id);

        Emp empById = empLinkedLists[empLinkedListNo].findEmpById(id);
        if(empById != null){
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }

    }

    // 编写散列函数，使用一个简单取模法
    public int hashFun(int id){
        return id%size;
    }
}

//表示雇员类
class Emp{
    public int id;
    public String name;
    public Emp next;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

//创建EmpLinkedList,表示链表
class EmpLinkedList{
    //头指针，执行第一个Emp,因此我们这个链表的head,是直接指向第一个Emp
    private Emp head;

    //添加雇员到链表
    public void add(Emp emp){
        if(head == null){
            head = emp;
        }else{
            Emp cur = head;
            while(cur.next!= null){
                cur = cur.next;
            }
            cur.next = emp;
        }
    }

    //遍历链表
    public void list(int no){
        if(head == null){
            System.out.println("第"+(no+1)+"链表为空");
            return ;
        }
        System.out.print("第"+(no+1)+"链表的信息为");
        Emp cur = head;
        while(true){
            System.out.printf("=> id=%d name=%s\t",cur.id,cur.name);
            if(cur.next == null)
                break;
            cur = cur.next;
        }
        System.out.println();
    }

    //根据id查找雇员
    public Emp findEmpById(int id){
        //判断链表是否为空
        if(head == null){
            System.out.println("链表为空");
            return null;
        }
        //辅助
        Emp cur = head;
        while(true){
            if(cur.id == id){
                break;
            }

            if(cur.next == null){
                cur = null;
                break;
            }
            cur = cur.next;
        }
        return cur;
    }
    
}
