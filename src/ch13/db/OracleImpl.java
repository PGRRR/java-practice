package ch13.db;

public class OracleImpl implements DbInterface {
    @Override
    public void connect() {
        System.out.println("Connect oracle DB system");
    }

    @Override
    public void select() {
        System.out.println("Select data in oracle DB system");
    }

    @Override
    public void insert() {
        System.out.println("Insert data in oracle DB system");
    }

    @Override
    public void update() {
        System.out.println("Update data in oracle DB system");
    }

    @Override
    public void delete() {
        System.out.println("Delete data in oracle DB system");
    }
}
