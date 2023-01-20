package oops.Inheritence;

public class Application {
    public static void main(String[] args) {
        ComputerTable ct =new ComputerTable();

        ct.legs=4;
        ct.material= new Material();
        ct.tableTop= true;
        ct.tableType="Computer";
        ct.creatTable();
        ct.move();

        DinningTable dt = new DinningTable();
        dt.legs=8;
        dt.material=new Material();
        dt.tableTop= true;
        dt.tableType="Dinning";
        dt.creatTable();
        dt.move();

        DressingTable st = new DressingTable();
        st.legs= 4;
        st.material= new Material();
        st.tableTop= true;
        st.tableType ="Dressing";
        st.creatTable();
        st.move();

    }

    public static class ComputerTable extends Table {

    }


}
