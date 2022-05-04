package ch13.db;

public class MsImpl implements DbInterface {

    @Override
    public void connect() {
        System.out.println("Connect MS-SQL DB system");
    }

    @Override
    public void select() {
        System.out.println("Select data in MS-SQL");
    }

    @Override
    public void insert() {
        System.out.println("Insert data in MS-SQL");
    }

    @Override
    public void update() {
        System.out.println("Update data in MS-SQL");
    }

    @Override
    public void delete() {
        System.out.println("Delete data in MS-SQL");
    }
}
