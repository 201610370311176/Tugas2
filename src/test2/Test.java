package test2;

public class Test {
    public static void main(String[] args) {
        
        ArayLinearList x = new ArayLinearList(8);
        System.out.println("ukuran pertama x \t\t"+x.element.length);
        x.add(0, "q");
        x.add(1, "w");
        x.add(2, "e");
        x.add(3, "r");
        x.add(4, "t");
        x.add(5, 7);
        x.add(6, 8);
        x.add(7, 9);
        System.out.println("isi pertama\t\t\t"+x.toString());
        System.out.println("array yg di isi\t\t\t"+x.size());
        System.out.println("isi array index 3\t\t"+x.get(3));
        
        x.remove(2);
        System.out.println("stlh index 2 di hapus \t\t"+x.toString());
        System.out.println("index 2 stlh di hapus \t\t"+x.get(2));
        x.add(2, "y");
        System.out.println("index 2 stlh d tambah\t\t"+x.get(2));
        System.out.println("stlh index 2 d tambah y\t\t"+x.toString());
        x.add(8, 10);
        x.add(9, 11);
        x.add(10, 12);
        System.out.println(x.size);
        System.out.println("isi stlh d tambah 3 array baru\t"+x.toString());
        System.out.println("jmlh array sebelum di potong\t"+x.element.length);
        x.trimToSize();
        System.out.println("jmlh array Setelah di potong\t"+x.element.length);
        x.setSize(6);
        System.out.println("atur ukuran 6\t\t\t"+x.toString());
        x.clear();
        System.out.println("clear \t\t\t\t"+x.toString());
    }
    
}
