package DZ_7_2410.Pr2_ConnectionExample;


public class ConnectionManager {

    private static Connection[] connections = new Connection[10];

    private static int connectionsNumber = 0;


    public static Connection getConnection(int id){
        if (connectionsNumber < connections.length){
            connections[connectionsNumber] = new Connection(id);
            System.out.println("Connection added. Number of connections: " + connectionsNumber);
            return connections[connectionsNumber++];
        }
        System.out.println("Returned null");
        return null;
    }



}