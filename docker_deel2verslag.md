# docker deel 2

## stap 1 : installatie NextCloud

make directory NextCloud

```
mkdir NextCloud
```

enter dir

```
cd NextCloud
```

make .yml file

```
sudo nano docker-compose-NextCloud.yml
```

### Base version - apache

```version: '2'

volumes:
  nextcloud:
  db:

services:
  db:
    image: mariadb:10.5
    restart: always
    command: --transaction-isolation=READ-COMMITTED --binlog-format=ROW
    volumes:
      - db:/var/lib/mysql
    environment:
      - MYSQL_ROOT_PASSWORD=
      - MYSQL_PASSWORD=
      - MYSQL_DATABASE=nextcloud
      - MYSQL_USER=nextcloud

  app:
    image: nextcloud
    restart: always
    ports:
      - 8080:80
    links:
      - db
    volumes:
      - nextcloud:/var/www/html
    environment:
      - MYSQL_PASSWORD=nextcloud
      - MYSQL_DATABASE=nextcloud
      - MYSQL_USER=nextcloud
      - MYSQL_HOST=db
```

start de service op

```
sudo docker-compose -f docker-compose-NextCloud.yml up
```

![Alt text](./img/Screenshot%202022-04-27%20210354.png "a title")

> ERROR - zie bijlage

> solved

![Alt text](./img/Screenshot%202022-04-27%20213826.png)
_apache2 -D FOREGROUND zichtbaar_

**in browser**

![Alt text](./img/nextcloud.png)

## Stap 2: Commando’s uitvoeren in een container

**voeg redis toe aan docker-compose-NextCloud.yml**

![Alt text](./img/redis2.png)

```
sudo docker exec -ti redis sh -c 'redis-cli MONITOR'
```

![](./img/redis1.png)

> result == ok

## Stap 3: Environment variab les

maak een `.env` bestand

```
sudo nano .env
```

![](./img/save2.png)

**haal de gevoelig DATA uit het .yml bestand**

![](./img/SAVE1.png)

## bijlage

```
sudo docker ps
```

![Alt text](./img/Screenshot%202022-04-27%20210731.png "a title")

**adress already in use**

```
sudo ufw status
```

![Alt text](./img/Screenshot%202022-04-27%20213857.png)

allow new port

```
sudo ufw allow 4012
```

![Alt text](./img/Screenshot%202022-04-27%20213922.png)

**change port in .yml**

![Alt text](./img/Screenshot%202022-04-27%20214119.png)
