# Redis Java Uygulaması

## Proje Hakkında

Bu proje, i2i Academy Redis ödevi kapsamında hazırlanmıştır.

Projede Docker üzerinde çalışan Redis sunucusuna Java uygulaması ile bağlantı kurulmuş ve Redis'in temel kullanım mantığı uygulanmıştır.

## Kullanılan Teknolojiler

- Java 17
- Maven
- Redis
- RedisInsight
- Docker
- Jedis

## Projenin Amacı

Bu proje ile;

- Redis'e Java üzerinden bağlantı kurmak,
- 10.000 adet örnek Person nesnesini Redis'e eklemek,
- Eklenen verileri Redis'ten okuyarak doğrulamak,
- RedisInsight üzerinden kayıtları görüntülemek

amaçlanmıştır.

## Proje Yapısı

```
Redis
│
├── src
│   └── main
│       └── java
│           └── com.redis.demo
│               ├── Main.java
│               └── Person.java
│
├── pom.xml
└── README.md
```

## Nasıl Çalıştırılır?

1. Docker üzerinde Redis container'ını çalıştırın.
2. RedisInsight container'ını çalıştırın.
3. IntelliJ IDEA ile projeyi açın.
4. Maven bağımlılıklarını yükleyin.
5. `Main.java` dosyasını çalıştırın.

## Projenin Çalışma Mantığı

Uygulama çalıştığında önce Redis sunucusuna bağlanır. Daha sonra döngü kullanılarak 10.000 adet Person nesnesi oluşturulur ve Redis'e kaydedilir. Son olarak ilk 10 kayıt Redis'ten okunarak konsolda görüntülenir ve işlemin başarılı olduğu doğrulanır.

## Örnek Çıktı

```
Redis bağlantısı: PONG

10.000 kişi Redis'e eklendi.

İlk 10 kayıt:

1,Person1,21
2,Person2,22
3,Person3,23
...
```

## Geliştirici

**Gamze Canpolat**

Bilgisayar Mühendisliği Öğrencisi