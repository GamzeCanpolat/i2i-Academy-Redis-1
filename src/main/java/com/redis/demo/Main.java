package com.redis.demo;

import redis.clients.jedis.Jedis;

public class Main {

    public static void main(String[] args) {

        // Redis'e bağlan
        Jedis jedis = new Jedis("localhost", 6379);

        // Bağlantıyı kontrol et
        System.out.println("Redis bağlantısı: " + jedis.ping());

        // 10.000 Person ekle
        for (int i = 1; i <= 10000; i++) {

            Person person = new Person(
                    i,
                    "Person" + i,
                    20 + (i % 30)
            );

            jedis.set("person:" + i, person.toString());
        }

        System.out.println("10.000 kişi Redis'e eklendi.");

        // İlk 10 kişiyi oku
        System.out.println("\nİlk 10 kayıt:");

        for (int i = 1; i <= 10; i++) {

            String person = jedis.get("person:" + i);

            System.out.println(person);
        }

        jedis.close();
    }
}