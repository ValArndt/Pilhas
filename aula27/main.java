package aula4;

public static void main(String[] args) {
    StaticList list = new StaticList(5);

    list.add(10);
    list.add(20);
    list.add(30, 1);

    list.display(); 

    list.remove(1);
    list.display(); 

    list.setData(25, 1);
    System.out.println(list.getData(1)); 

    System.out.println(list.find(10)); 
    System.out.println(list.find(99)); 
}
