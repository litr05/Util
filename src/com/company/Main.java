package com.company;


public class Main {

    public static void main(String[] args) {
/*        String my = new CodeGen().randomString(6);
        System.out.println("Password: " + my);*/

        /*System.out.println(Ping.pingReacheble("localhost", 3000));*/

      IPv4 ipv4 = new IPv4("192.168.20.45/30");
        System.out.println(ipv4.getIP());
        System.out.println(ipv4.getNetmask());
        System.out.println(ipv4.getCIDR());
        System.out.println(ipv4.getHostAddressRange());

        MD5Util mesd = new MD5Util();
        String st = mesd.md5Custom(mesd.md5Custom("625810"));
        System.out.println(st);



    }
}
