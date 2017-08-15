import redis.clients.jedis.Jedis;

public class Main {

    public static void main(String[] args) {
        Jedis jedis=new Jedis("localhost");
        jedis.clientList();
        System.out.println(jedis.clientList());


    }
}
