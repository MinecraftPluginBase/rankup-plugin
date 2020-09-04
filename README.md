# Rankup
Allow your players to rank up!

### Prerequisites
* Java 8+
* [Spigot 1.8.8](https://cdn.getbukkit.org/spigot/spigot-1.8.8-R0.1-SNAPSHOT-latest.jar)

### Default Configuration
```yml
ranks:
  basic:
    name: "Básico"
    prefix:
      short: "[B] "
      long: "[Basic] "
    position: 1
  advanced:
    name: "Avançado"
    prefix:
      short: "[A] "
      long: "[Advanced] "
    position: 2
    price: 500
```

### Examples
Returning a User object.
```java
// Getting API
UserAPI api = new UserAPI(player id);

// Checking if there is
if (api.exists()) { }

// Getting User object
User user = api.getUser();
```

Returning a Rank object.
```java
// Getting API
RankAPI api = new RankAPI(rank position);

// Checking if there is
if (api.exists()) { }

// Getting Rank object
Rank rank = api.getRank();

// Getting next rank
Rank nextRank = rank.getNextRank();

// You can verify if next rank exists
if (rank.hasNextRank()) { }
```

## Contributors
<table>
  <tr>
    <td align="center"><a href="https://github.com/ViiictorXD">
<img src="https://avatars3.githubusercontent.com/u/38568440?v=4" width="100px;" alt=""/><br /><sub><b>ViiictorXD</b></sub></a><br /><a href="https://github.com/MinecraftPluginBase/rankup-plugin/commits?author=ViiictorXD" title="Code">💻</a></td>
  </tr>
</table>
